/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anagrama;

/**
 *
 * @author Andres Felipe
 */
public class ANAGRAMA {

    /**
     * @param args the command line arguments
     */
    public static boolean esAnagrama(String palabra1, String palabra2) {
        
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        // si son iguales, no es anagrama
        if (palabra1.equals(palabra2)) {
            return false;
        }

        // si tienen distinta longitud no pueden ser anagramas
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // convertimos palabra2 a arreglo para poder modificarlo
        char[] letras2 = palabra2.toCharArray();

        // recorremos cada letra de palabra1
        for (int i = 0; i < palabra1.length(); i++) {
            char letra = palabra1.charAt(i);
            boolean encontrada = false;

            // buscamos la letra en palabra2
            for (int j = 0; j < letras2.length; j++) {
                if (letras2[j] == letra) {
                    letras2[j] = '*'; // marcar como usada
                    encontrada = true;
                    break;
                }
            }

            // si no encontramos la letra no es anagrama
            if (!encontrada) {
                return false;
            }
        }

        // si todas las letras coinciden
        return true;
    }
}

