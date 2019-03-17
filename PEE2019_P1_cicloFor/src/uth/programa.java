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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //i++; es igual a decir i=i+1; tambien decir i+=1;
        for(int i=0;i<=10;i+=5){
            System.out.println(i);
        }
        for(int i=10;i>=0;i-=1){
            System.out.println(i);
        }
        for(int patito=0;patito<=100;patito++){
            System.out.println(patito);
        }
        System.out.println("impresion despues de patito");
        int x=20;
        for(int patito=x;patito<=30;patito++){
            System.out.println(patito);
        }
        System.out.println("deteniendo el cliclo cuando llega a 10");
        for(int x2=1;x2<=30;x2++){
            if (x2==10) {
                System.out.print("deteniendo el ciclo ");
                System.out.println(x2);
                break;
            }
            if (x2==5) {
                System.out.print("aplicando el continuar en el ");
                System.out.println(x2);
                continue;
            }
            System.out.println(x2);
        }
        
        System.out.println("concatenando");
        String mensaje="";
        for(int i=0;i<=10;i++){
            mensaje+=i+",";
        }
        System.out.println(mensaje);
        
        //concatenando
        String saludo="hola";
        String nombre="manuel";
        String oracion=saludo+">=<"+nombre;
        
        System.out.println(oracion);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("x("+i+") => "+i+" + 1 = "+(i+1)+"");
        }
    }
    
}
