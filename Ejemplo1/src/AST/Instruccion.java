package AST;

import AST.Entornos.Entorno;

public interface Instruccion extends NodoAST {
    public Object ejecutar(Entorno ent);
}
