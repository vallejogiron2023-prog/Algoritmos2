/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumapositivos;

/**
 *
 * @author LEN
 */
import java.util.Scanner; 
public class SumaPositivos {

    /**
     * @param args the command line arguments
     */


    public void calcular() { // Método que hace todo

        Scanner sc = new Scanner(System.in); // Leer teclado
        int num; // Guarda cada número
        int suma = 0; // Acumula los positivos

        for (int i = 1; i <= 10; i++) { // Repite 10 veces
            System.out.print("Ingresa número " + i + ": ");
            num = sc.nextInt(); // Leer número

            if (num > 0) { // Solo positivos
                suma = suma + num;
            }
        }

        System.out.println("\nSuma de positivos: " + suma); // Resultado
    }
}
    
    
