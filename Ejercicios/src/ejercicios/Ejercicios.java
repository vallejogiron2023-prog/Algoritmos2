/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Andres Felipe
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //==========declaracion de variables=======
        int opc=0;
        Scanner leer=new Scanner(System.in);
        
        //Espacios para las clases de ejercicios
        fizzBuzz p1 = new fizzBuzz(); 


        //==================================
        
        
        //===========mostrar en pantalla=========
        
        
        while(opc!=100){
            System.out.println("*****Ejercicios*****");
            System.out.println("1. FizzBuzz");
              System.out.println("ingrese opcion: ");
            opc=leer.nextInt();
            
            
            switch(opc){
                case 1:
                    p1.mostrarNumeros();
                    
                    
                break;
                
                
                
                
            }
        }
        
        
    }
    
}
