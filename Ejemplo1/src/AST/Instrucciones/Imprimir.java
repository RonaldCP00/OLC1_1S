package AST.Instrucciones;

import AST.Entornos.Entorno;
import AST.Expresion;
import AST.Instruccion;
import ejemplo1.SalidaConsola;

public class Imprimir implements Instruccion{
        
    private int linea;
    private Expresion exp;
    
    public Imprimir(Expresion exp,int linea){
        this.exp=exp;
        this.linea=linea;
    }

    @Override
    public Object ejecutar(Entorno ent) {
        Object valor = (this.exp==null)?null:this.exp.operar(ent);
        
        if(valor instanceof Double){
            SalidaConsola.agregar(">>>"+valor.toString());
        }else{
            SalidaConsola.agregar(">>>nulo");
        }
        return null;
    }

    @Override
    public int getlinea() {
        return this.linea;
    }
}
