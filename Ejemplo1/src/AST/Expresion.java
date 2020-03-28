package AST;

import AST.Entornos.Entorno;

public interface Expresion extends NodoAST {
    public Object operar(Entorno ent);
}
