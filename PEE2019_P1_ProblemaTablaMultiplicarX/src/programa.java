
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        Scanner scan=new Scanner(System.in);
        
        //diccionario de variables
        int x=scan.nextInt();
        int multiplicando=1;
        
        while (multiplicando<=100) {            
            //esta opcion imprime en pantalla el contenido
            //System.out.println(x+"*"+multiplicando+"="+(x*multiplicando));
            
            //esta opcion solo imrpime el resultado
            int resultado=multiplicando*x;
            System.out.println(resultado);
            
            //Esta instruccion incrementa el valor de el multiplicando en 1
            multiplicando=multiplicando+1;
        }
        
    }
    
}
