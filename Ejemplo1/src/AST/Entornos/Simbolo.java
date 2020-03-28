package AST.Entornos;

public class Simbolo{       
    private Object valor;
    private String id;

    public Simbolo(String id,Object valor){
        this.id=id;
        this.valor=valor;
    }

    public String getid(){
        return this.id;
    }

    public Object getvalor(){
        return this.valor;
    }


    public void setvalor(Object valor){
        this.valor=valor;
    }
}