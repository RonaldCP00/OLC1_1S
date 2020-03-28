package AST.Instrucciones;

import AST.Entornos.Entorno;
import AST.Entornos.Simbolo;
import AST.Expresion;
import AST.Instruccion;
import ejemplo1.SalidaConsola;

public class Declaracion implements Instruccion{
    private int linea;
    private String id;
    private Expresion exp;
    
    // id = EXP
    public Declaracion(String id,Expresion exp,int linea){
        this.id=id;
        this.exp=exp;
        this.linea=linea;
    }

    //id
    public Declaracion(String id,int linea){
        this.id=id;
        this.linea=linea;
    }

    @Override
    public Object ejecutar(Entorno ent) {
        Object valor = (this.exp==null)?null:this.exp.operar(ent);
        
        if(ent.gettabla().varexist(id)){//verifica si existe en el entorno actual
            SalidaConsola.agregar(">>>Error Linea "+linea+": La variable \""+this.id+"\" ya fue declarada en el entorno actual");
            return null;
        }
        
        if(valor instanceof Double){
            ent.gettabla().add(new Simbolo(this.id,(Double) valor));
        }else{
            ent.gettabla().add(new Simbolo(this.id,null));
        }
        return null;
    }

    @Override
    public int getlinea() {
        return this.linea;
    }
}

