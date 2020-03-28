package AST.Entornos;

import AST.Entornos.Simbolo;
import java.util.LinkedList;

public class TablaSimbolo extends LinkedList<Simbolo> {
    
    public TablaSimbolo(){
        super();
    }

    public Object getvalor(String id){
        for(int x=this.size()-1;x>=0;x--){
            if(this.get(x).getid().equals(id.toLowerCase()))
                return this.get(x).getvalor();
        }
        return null;
    }
    
    public void setvalor(String id,Object valor){
        for(int x=this.size()-1;x>=0;x--){
            if(this.get(x).getid().equals(id.toLowerCase()))
                this.get(x).setvalor(valor);
        }
    }
    
    public Boolean varexist(String id){
        for(int x=this.size()-1;x>=0;x--){
            if(this.get(x).getid().equals(id.toLowerCase()))
                return true;
        }
        return false;
    }
}
