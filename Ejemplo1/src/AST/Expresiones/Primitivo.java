package AST.Expresiones;

import AST.Expresion;

public class Primitivo implements Expresion {
    
    public static enum tipo_primitivo{
        NUMERO
    }

    private int linea;
    private Object valor;
    private tipo_primitivo tipo;
        
    public Primitivo(tipo_primitivo tipo,Object valor,int linea){
        this.linea=linea;
        this.tipo=tipo;
        this.valor=valor;
    }

    @Override
    public Object operar() {
        if(tipo==tipo_primitivo.NUMERO){
            return (Double) valor;
        }
        return null;
    }

    @Override
    public int getlinea() {
        return this.linea;
    }
}
