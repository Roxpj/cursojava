package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForTenistas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int posicionMejorTenista = 1000; // = Integer.MAX_VALUE (Propiedad de la clase wrapper Integer para usar el máximo valor de un entero)
		int clasificados10Primeros = 0;
		String mejorTenista = "";

		System.out.println("Indica el número de tenistas:");
		int numeroTenistas = scan.nextInt();
		
		for(int i=0; i<numeroTenistas; i++) {
			System.out.println("Nombre del tenista número " + (i+1) + ":");
			scan = new Scanner(System.in);
			String nombreTenista = scan.nextLine();
			System.out.println("Su posición en el ranking:");
			scan = new Scanner(System.in);
			int posicionTenista = scan.nextInt();
			
			if(posicionTenista<=10) {
				clasificados10Primeros++;
			}
			
			if(posicionTenista<posicionMejorTenista) {
				posicionMejorTenista = posicionTenista;
				mejorTenista = nombreTenista;
			}
		}
		System.out.println("Hay " + clasificados10Primeros + " tenistas entre los 10 primeros.");
		System.out.println(mejorTenista + " es el mejor tenista.");
	}
}
/*
EjercicioForTenistas
============================================================
Pedir número de tenistas, por cada tenista pedir su nombre 
y la posición que ocupa en el ranking. 
Indicar cuantos tenistas hay entre los 10 primeros
y el nombre del mejor tenista
*/
