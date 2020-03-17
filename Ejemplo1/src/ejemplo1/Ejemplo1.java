package ejemplo1;

import java.io.BufferedReader;
import java.io.StringReader;

public class Ejemplo1 {

    public static void main(String[] args) {
        String texto="1.5*2 }";//14
        
        try {
            Analizadores.Lexico lexico1=new Analizadores.Lexico(new BufferedReader(new StringReader(texto)));
            Analizadores.Sintactico pars1=new Analizadores.Sintactico(lexico1);
            pars1.parse();
            SalidaConsola.imprimir();
        } catch (Exception e) {
            System.out.println(">>> Error en compilación de entrada.\n");
        }
    }
    
}
