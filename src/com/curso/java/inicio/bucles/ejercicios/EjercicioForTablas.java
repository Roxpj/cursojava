package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForTablas {

	public static void main(String[] args) {

		 for (int i=0, n=1; i<=10; i++) { 
			 System.out.println(n +"x"+ i + ": " + n*i);
			 if(i==10 && n<10) {
				 n++; i=0;
				 }
			 }
		 

		// Método del profe con pregunta para cerrar el bucle

		for (int j=1; j<=10; j++) {
			System.out.println("\nTabla del " + j); // \n -Para hacer salto de línea

			for (int i = 0; i <= 10; i++) {
				System.out.println("\t" + j + "x" + i + " = " + (j * i)); // \t -Para tabulación
			}
			System.out.println("¿Quieres ver más tablas?");
			Scanner scan = new Scanner(System.in);
			String respuesta = scan.nextLine();

			if (respuesta.equalsIgnoreCase("no")) {
				System.out.println("Adiós");
				break;
			}

		}
	}

}
/*
 * EjercicioForTablas
 * ============================================================ 
 * Mostrar la tabla de multiplicar de los números del 1 al 10
 */
