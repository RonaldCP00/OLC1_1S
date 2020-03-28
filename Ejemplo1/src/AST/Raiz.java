package AST;

import AST.Entornos.Entorno;
import AST.Instrucciones.Imprimir;
import AST.Instrucciones.ListaDeclaracion;
import java.util.LinkedList;

public class Raiz implements Instruccion {
    
    private LinkedList<Instruccion> insts;
    
    public Raiz(LinkedList<Instruccion> insts){
        this.insts=insts;
    }
    
    @Override
    public Object ejecutar(Entorno ent) {
        for(Instruccion ins:insts){
            if(ins instanceof ListaDeclaracion){
                ins.ejecutar(ent);
            }else if(ins instanceof Imprimir){
                ins.ejecutar(ent);
            }
        }
        return null;
    }

    @Override
    public int getlinea() {
        return 0;
    }
}
