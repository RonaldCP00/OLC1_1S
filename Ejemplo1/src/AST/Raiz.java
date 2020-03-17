package AST;

public class Raiz implements Expresion {
    
    public Raiz(Expresion e,int linea){
        this.exp = e;
        this.linea = linea;
    }
    
    private Expresion exp;
    private int linea;

    @Override
    public Object operar() {
        return this.exp.operar().toString();
    }

    @Override
    public int getlinea() {
        return this.linea;
    }
}
