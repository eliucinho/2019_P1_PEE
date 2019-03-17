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
    //void: indica que la funcion no retorna valores, por tanto es un procedimiento
    
    //Definiendo un procedimiento que no recibe valores
    public static void mostrarSaludoUTH(){
        //aqui se colocan las instrucciones
        //System.out.println("hola uth");
        mostrarSaludPersonalizado("Hola ", "UTH");
    }
    //un procedimiento que recibe un valor
    public static void mostrarSaludoA(String nombre){
        //saluda concatenando el mensaje
        //System.out.println("Hola "+nombre);
        mostrarSaludPersonalizado("Hola ", nombre);
    }
    //un procedimiento que recibe un valor
    public static void mostrarSaludPersonalizado
        (String mensaje, String nombre){
        //saluda concatenando el mensaje
        String mensajeCompleto=mensaje+nombre;
        System.out.println(mensajeCompleto);
    }
        
    public static void repetirMensajes
        (int cuantasRepeticiones, String mensaje){
        for(int i=0;i<cuantasRepeticiones;i++){
            System.out.println(i+mensaje);
        }
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //para utilizar el procedimiento, se escribe su nombre;
        mostrarSaludoUTH();
        
        mostrarSaludoA("Juan");
        mostrarSaludoA("Manuel");
        mostrarSaludoA("Pedro");
        mostrarSaludoA("Pablito");
        mostrarSaludoA("Cesar");
        
        mostrarSaludPersonalizado("Como estas ", "Raul");
        
        repetirMensajes(1000, "Cual es su proyecto??");
    }
    
}
