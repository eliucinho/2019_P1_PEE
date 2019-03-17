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

    public static int reducirNumero(int x){
        int valor=x-1;
        
        if (valor==1) {
            return 1;
        }else{
            return reducirNumero(valor);
        }        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //reducir el numero hasta que sea igual a 1
        System.out.println(reducirNumero(5));
    }
    
}
