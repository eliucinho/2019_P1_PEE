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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Toda la programacion
        //variable de lectura
        Scanner scan=new Scanner(System.in);
        
        //INICIO
        int x=scan.nextInt();
        int ciclo=1;
        int subCiclo=1;
        int vuelta=1;
        String mensaje="";
        String separador="-";
        
        //repetir mientras ciclo sea menor o igual a x
        while (ciclo<x) {            
            subCiclo=x-ciclo;
            //repetir mientras la vuelta sea menor o igual al subciclo
            while (vuelta<=subCiclo) {                
                mensaje=mensaje+separador;
                vuelta=vuelta+1;
            }//fin de repetir
            vuelta=ciclo;
            while(vuelta>=1){
                mensaje=mensaje+vuelta;
                vuelta=vuelta-1;
            }//fin de repetir
            ciclo=ciclo+1;
            //imprimir mensaje
            System.out.println(mensaje);
            vuelta=1;
            mensaje="";
        }//fin repetir mientras
        System.out.println(mensaje);
        
    }//FIN
    
}
