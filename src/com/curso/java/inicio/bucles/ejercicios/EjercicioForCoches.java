package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForCoches {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mayorVelocidadCoche = 0;

		System.out.println("Indica el número de coches:");
		int numeroCoches = scan.nextInt();

		for (int i = 0; i < numeroCoches; i++) {
			System.out.println("Indica velocidad del coche número " + (i + 1) + " :");
			int inputVelocidadCoche = scan.nextInt();
			if (inputVelocidadCoche > mayorVelocidadCoche) {
				mayorVelocidadCoche = inputVelocidadCoche;
			}

		}
		System.out.println("La velocidad del coche más rápido es: " + mayorVelocidadCoche);
	}

}
/*
EjercicioForCoches
============================================================
Pedir numero de coches
Por cada coche pedir su velocidad
Indicar a qué velocidad va el coche más rápido
 */