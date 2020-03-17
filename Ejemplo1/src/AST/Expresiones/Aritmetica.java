package AST.Expresiones;

import AST.Expresion;
import ejemplo1.SalidaConsola;

public class Aritmetica implements Expresion {
    
    public static enum op_arit{
        SUMA,
        RESTA,
        MULTIPLICACION,
        DIVISION,
        POTENCIA
    }
    
    private Expresion izq;
    private Expresion der;
    private op_arit oper;
    private int linea;

    public Aritmetica(Expresion izq,Expresion der,op_arit oper,int linea){
        this.izq=izq;
        this.der=der;
        this.oper=oper;
        this.linea=linea;
    }

    @Override
    public Object operar() {
        Object izq1 = (this.izq==null)?null:this.izq.operar();
        Object der1 = (this.der==null)?null:this.der.operar();

        if(oper==op_arit.SUMA){
            if(izq1 instanceof Double && der1 instanceof Double){
                return (Double)izq1+(Double)der1;
            }else{
                SalidaConsola.agregar(">>>Error Linea "+linea+": Suma de tipos inconsistente");
                return null;
            }
        }else if(oper==op_arit.RESTA){
            if(izq1 instanceof Double && der1 instanceof Double){
                return (Double)izq1-(Double)der1;
            }else{
                SalidaConsola.agregar(">>>Error Linea "+linea+": Resta de tipos inconsistente");
                return null;
            }
        }else if(oper==op_arit.MULTIPLICACION){
            if(izq1 instanceof Double && der1 instanceof Double){
                return (Double)izq1*(Double)der1;
            }else{
                SalidaConsola.agregar(">>>Error Linea "+linea+": Multipliccion de tipos inconsistente");
                return null;
            }
        }else if(oper==op_arit.DIVISION){
            if(izq1 instanceof Double && der1 instanceof Double){
                if((Double)der1==0.0){
                    SalidaConsola.agregar(">>>Error Linea "+linea+": Division entre 0");
                    return null;
                }
                return (Double)izq1/(Double)der1;
            }else{
                SalidaConsola.agregar(">>>Error Linea "+linea+": Division de tipos inconsistente");
                return null;
            }
        }else if(oper==op_arit.POTENCIA){
            if(izq1 instanceof Double && der1 instanceof Double){
                return Math.pow((Double)izq1,(Double)der1);
            }else{
                SalidaConsola.agregar(">>>Error Linea "+linea+": Potencia de tipos inconsistente");
                return null;
            }
        }
        return null; 
    }

    @Override
    public int getlinea() {
        return this.linea;
    }
}
