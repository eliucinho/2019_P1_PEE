/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

/**
 *
 * @author uth
 */
public class programa {

    //Funcion que retorna la suma de dos numeros enteros
    public static int sumar(int valorA, int valorB){
        int suma=valorA+valorB;
        
        //retornando el valor
        return suma; //es igual a decir return valorA´valorB;
    }
    
    public static boolean esValorAElMayor
        (int valorA,int valorB){
            
        //pudo haberse evitado escribiendo return (valorA>valorB);
        if (valorA>valorB) {
            return true;
        }else{
            return false;
        }
    }
    
    public static String concatenar(String oracion1, String oracion2){
        return oracion1+oracion2;
    }    
        
    public static int exponencial(int numero, int n){
        int resultado=numero;
        for(int i=1;i<n;i++){
            //es igual a decir resultado*=resultado;
            resultado=resultado*numero;
        }
        return resultado;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado=sumar(2, 4);
        
        System.out.println(resultado);
        
        boolean resultadoEvaluacion=
                esValorAElMayor(40, 200);
        
        if (resultadoEvaluacion) {
            System.out.println("A es mayor");
        }else{
            System.out.println("B es mayor o igual");
        }
        
        System.out.println(concatenar("Hola ", "UTH"));
        
        //Exponente: donde recibe n y se multiplica las veces que diga n
        System.out.println(exponencial(2, 5));
        
        System.out.println(Math.pow(2, 5));
    }
    
}
