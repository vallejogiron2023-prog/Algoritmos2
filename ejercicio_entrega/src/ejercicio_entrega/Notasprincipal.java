/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_entrega;

/**
 *
 * @author Andres Felipe
 */

import java.util.Scanner;

public class Notasprincipal {

    Scanner sc = new Scanner(System.in);

    double nota1, nota2, nota3;
    double promedio;

    // Método para ingresar notas
    public void ingresarNotas() {

        System.out.print("Ingrese nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Ingrese nota 2: ");
        nota2 = sc.nextDouble();

        System.out.print("Ingrese nota 3: ");
        nota3 = sc.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;
    }

    // Método para mostrar resultados
    public void mostrarResultados() {

        System.out.println("Promedio: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Aprobó");
        } else {
            System.out.println("Reprobó");
        }
    }
}