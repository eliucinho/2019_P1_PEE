/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import java.util.Scanner;

/**
 *
 * @author uth
 */
public class programa {

    public static String transformarEnLetras(int x){
        String respuesta="Nose";
        
        if (x==0) {
            respuesta="cero";
        } else if(x==1) {
            respuesta="uno";
        }else if(x==2) {
            respuesta="dos";
        }else if(x==3) {
            respuesta="tres";
        }else if(x==4) {
            respuesta="cuatro";
        }else if(x==5) {
            respuesta="cinco";
        }else if(x==6) {
            respuesta="seis ";
        }else if(x==7) {
            respuesta="siete";
        }else if(x==8) {
            respuesta="ocho";
        }else if(x==9) {
            respuesta="nueve";
        }else if(x==10) {
            respuesta="diez";
        }else{
            respuesta="Numero no soportado";
        }
        
        return respuesta;
    } 
    
    public static void imprimirEncabezado(String mensaje){
         System.out.println("============ UTH ============");
        System.out.println(mensaje);
        System.out.println("=============================");
    }
    
    public static void imprimirPiePagina(String mensaje){
         System.out.println("=============================");
        System.out.println(mensaje);
        System.out.println("=============================");
    }
    
    public static void menuInteractivo(){
        Scanner scan=new Scanner(System.in);
        
        String salirPrograma="N";
        
        while(!salirPrograma.equals("S")){
            System.out.println("Ingresar el valor de X:");
            int x=scan.nextInt();
            
             System.out.println("Respuesta: "+transformarEnLetras(x));
             System.out.println("");
             System.out.println
            ("¿Quiere salir del programa? (S=salir; N=Continuar)");
            salirPrograma=scan.next();
            while (!(salirPrograma.equals("S") 
                    || salirPrograma.equals("N"))) { 
                System.out.println("Funcion no soportada");
                System.out.println
                ("¿Quiere salir del programa? (S=salir; N=Continuar)");
                salirPrograma=scan.next();
            }
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirEncabezado("Programa X que transcribe su nombre en letras");
        
        menuInteractivo();
        
        imprimirPiePagina("Adios!!!");
    }
    
}
