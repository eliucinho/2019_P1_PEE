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

    public static int obtenerMillar(int numero) {
        int contador = 0;
        //Si el numero es mayor de mil
        if (numero >= 1000) {
            numero -= 1000;

            return obtenerElemento(numero, contador, 1000);
        } else {
            return 0;
        }
    }

    public static int obtenerCentena(int numero) {
        int contador = 0;
        int millar = obtenerMillar(numero);
        //Si el numero es mayor de mil
        numero -= (millar * 1000);
        if (numero >= 100) {
            numero -= 100;

            return obtenerElemento(numero, contador, 100);
        } else {
            return 0;
        }
    }

    public static int obtenerDecena(int numero) {
        int contador = 0;
        int millar = obtenerMillar(numero);
        int centena = obtenerCentena(numero);
        //Si el numero es mayor de mil
        numero -= (millar * 1000);
        numero -= (centena * 100);
        //Si el numero es mayor de mil
        if (numero >= 10) {
            numero -= 10;

            return obtenerElemento(numero, contador, 10);
        } else {
            return 0;
        }
    }

    public static int obtenerElemento(int numero, int contador, int elemento) {
        contador += 1; //incrementando de 1 en 1
        //Si el numero es mayor de mil
        if (numero >= elemento) {
            numero -= elemento;
            return obtenerElemento(numero, contador, elemento);
        } else {
            return contador;
        }
    }

    //public static int obtenerUnidad(int numero){        
    //}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Que numero quiere leer?");
        int numero = scan.nextInt();

        System.out.println(obtenerMillar(numero));
        System.out.println(obtenerCentena(numero));
        System.out.println(obtenerDecena(numero));
    }

}
