/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import java.util.Scanner;

/**
 *
 * @author eliucinho
 */
public class programa {

    public static void imprimirArreglo(String [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i + ": " + arreglo[i]);
        }
    }
    
    public static String[] leerAlumnos(int tamanio){
        Scanner scan=new Scanner(System.in);
        String [] arreglo=new String[tamanio];
        
        System.out.println("Listado de Alumnos");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("¿Cual es el valor de la posicion "+i+"?");
            arreglo[i]=scan.nextLine();
        }
       
        return arreglo;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arregloCaracteres = {"daniel", "gerardo", "maria"};
        int[] arregloEnteros = {4, 5, 7, 10, 100, 2, 67};
        double[] arregloDecimales = {5.3, 4.3, 3.2};

        System.out.println(arregloCaracteres[0]);
        System.out.println(arregloCaracteres[1]);
        System.out.println(arregloCaracteres[2]);

        imprimirArreglo(arregloCaracteres);
              
        String [] arregloAlumnos=leerAlumnos(7);
        System.out.println(arregloAlumnos.length);
        
        imprimirArreglo(arregloAlumnos);
        
    }

}
