/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author Andres Felipe
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public  void mostrar() {
        int a =0;
        int b =1;
            System.out.println("serie Fibonacci");      
        
        for(int i = 0; i < 50; i++){
            System.out.print(a + " ");
        int siguiente = a + b;
        a = b;
        b= siguiente;
        
        }
        
    }
    
}
