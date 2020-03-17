package ejemplo1;

import java.util.LinkedList;

public class SalidaConsola {
    public static LinkedList<String> salida=new LinkedList<>();

    public SalidaConsola(){
        super();
    }
    
    public static void agregar(String texto){
        salida.add(texto);
    }
    
    public static void imprimir(){
        for(int i=0;i<salida.size();i++){
            System.out.println(salida.get(i));
        }
        salida.clear();
    }
}
