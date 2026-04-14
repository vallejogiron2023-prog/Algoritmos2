/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Andres Felipe
 */
public class fizzBuzz {
    
    public void mostrarNumeros(){
    //ejercicios de fizzBuzz

    for (int i = 1; i <= 100; i++) {
         //System.out.println("Numero: "+i);
         if(i%3 ==0 && i%5==0){
             System.out.println("Numero: "+i+" fizzBuzz");
         
         
         }else
              if(i%3 ==0 ){ 
               System.out.println("Numero: "+i+" fizz");
               
           }else
              if(i%5 ==0 ){ 
               System.out.println("Numero: "+i+" Buzz");
               
               
       }  else
                  System.out.println("Numero:"+i);
    
       } 
    }
}
