package AST.Expresiones;

import AST.Entornos.Entorno;
import AST.Expresion;
import ejemplo1.SalidaConsola;

public class Identificador implements Expresion {
    private int linea;
    private String id;
    
    public Identificador(String id,int linea){
        this.id=id;
        this.linea=linea;
    }

    @Override
    public Object operar(Entorno ent) {
        while(ent!=null){
            if(ent.gettabla().varexist(id)){
                return ent.gettabla().getvalor(id);
            }else{
                ent=ent.getpadre();
            }
        }
        SalidaConsola.agregar(">>>Error Linea "+linea+": La variable \""+id+"\" no fue declarada");
        return null;
    }

    @Override
    public int getlinea() {
        return this.linea;
    }  
}
