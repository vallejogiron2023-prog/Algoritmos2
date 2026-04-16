/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_entrega;
import java.util.Scanner;

/**
 *
 * @author Andres Felipe
 */
public class Ejercicio_entrega {

    public static void main(String[] args) {

        // Se crea un objeto Scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);

        // Se crea un objeto de la clase Notasprincipal
        // Este objeto permitirá llamar a los métodos ingresarNotas() y mostrarResultados()
        Notasprincipal objNotas = new Notasprincipal();

        // Variable para guardar la opción que el usuario elija en el menú
        int opcion;

        // Estructura repetitiva que mantiene el menú activo hasta que el usuario elija salir
        do {

            // Menú de opciones que se muestra al usuario
            System.out.println("\n=== MENU DE OPCIONES ===");
            System.out.println("1. Ingresar notas");
            System.out.println("2. Mostrar resultados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            // Se lee la opción ingresada por el usuario
            opcion = sc.nextInt();

            // Estructura switch que evalúa la opción seleccionada
            switch (opcion) {

                case 1:
                    // Llama al método que permite ingresar las 5 notas
                    objNotas.ingresarNotas();
                    break;

                case 2:
                    // Llama al método que muestra aprobadas, reprobadas y promedio
                    objNotas.mostrarResultados();
                    break;

                case 3:
                    // Mensaje cuando el usuario decide salir del programa
                    System.out.println("Saliendo...");
                    break;

                default:
                    // Mensaje en caso de que el usuario ingrese una opción no válida
                    System.out.println("Opción inválida");
            }

        // El ciclo se repite mientras la opción sea diferente de 3
        } while (opcion != 3);

    }
}