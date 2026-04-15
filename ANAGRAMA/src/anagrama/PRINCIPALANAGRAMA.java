/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrama;

/**
 *
 * @author Andres Felipe
 */
public class PRINCIPALANAGRAMA {
    public static void main(String[] args){
        
        String palabra1 = "escuchar";
        String palabra2 = "silencioso";

        if (ANAGRAMA.esAnagrama(palabra1, palabra2)){
            System.out.println("Son anagramas");
            
        }   else{
              System.out.println("No Son anagramas");        
        }    
    }
    
}
