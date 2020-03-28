package ejemplo1;

import AST.Entornos.Entorno;
import java.io.BufferedReader;
import java.io.StringReader;

public class Ejemplo1 {

    public static void main(String[] args) {
        String texto="var a=1+2*4;"//9
                + "var z,b = 3*8;"//24
                + "imprimir(a+b);"//33
                + "imprimir(z);"//nulo
                + "imprimir(no_existe);";//error

        try {
            Analizadores.Lexico lexico1=new Analizadores.Lexico(new BufferedReader(new StringReader(texto)));
            Analizadores.Sintactico pars1=new Analizadores.Sintactico(lexico1);
            
            
            Entorno ent=new Entorno(null);//entorno global
            pars1.setEntorno(ent);
            pars1.parse();
            
            SalidaConsola.imprimir();
            
            
        } catch (Exception e) {
            System.out.println(">>> Error en compilación de entrada.\n");
        }
    }
    
}
