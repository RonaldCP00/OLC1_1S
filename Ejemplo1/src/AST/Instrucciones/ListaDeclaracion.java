package AST.Instrucciones;

import AST.Entornos.Entorno;
import AST.Instruccion;
import java.util.LinkedList;

public class ListaDeclaracion implements Instruccion{
    
    private int linea;
    private LinkedList<Instruccion> lista;
    
    public ListaDeclaracion(LinkedList<Instruccion> lista,int linea){
        this.lista=lista;
        this.linea=linea;
    }

    @Override
    public Object ejecutar(Entorno ent) {
        for(Instruccion ins: lista){
            if(ins!=null)
                ins.ejecutar(ent);
        }
        return null;
    }

    @Override
    public int getlinea() {
         return this.linea;
    }
}
