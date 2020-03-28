package AST.Entornos;

public class Entorno {
    private TablaSimbolo simbolos;
    private Entorno padre;
    
    public Entorno(Entorno padre){
        simbolos=new TablaSimbolo();
        this.padre=padre;
    }

    public Entorno getpadre(){
        return this.padre;
    }
    
    public TablaSimbolo gettabla(){
        return this.simbolos;
    }
    
    public Entorno getglobal(){
        Entorno ent=this;
        while(ent.padre!=null){
            ent=ent.padre;
        }
        return ent;
    }
}
