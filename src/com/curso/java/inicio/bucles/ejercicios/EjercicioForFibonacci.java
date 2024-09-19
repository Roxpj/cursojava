package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioForFibonacci {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos de la serie de Fibonacci quieres visualizar?");
		scan = new Scanner(System.in);
		int numeroElementos = scan.nextInt();
		
		//para 5 da: 12358
		/*
		int numeroA = 0;
		int numeroB = 1;
		int numeroC = 0;
		
		for(int i=0; i<numeroElementos; i++) {
			numeroC = numeroA + numeroB;
			numeroA = numeroB;
			numeroB = numeroC;
			
			System.out.println(numeroC);
		} */
		
		int numeroX = 0;
		int numeroY = 0;
		int numeroZ = 0;
		
		for(int i=0; i<numeroElementos; i++) {
			if(numeroY==1) {
				System.out.println(numeroY);
			}
			System.out.println(numeroZ);
			if(numeroY==0) {
				numeroY++;
			}
			numeroZ = numeroX + numeroY;
			numeroX = numeroY;
			numeroY = numeroZ;
		}
		
	}
}
/*
EjercicioForFibonacci
============================================================
Pedir número de elementos de la serie de fibonacci a mostrar.
La serie de Fibonacci es 0,1,1,2,3,5,8,13,21,34,...
Si introduces 5, la secuencia a mostrar sería:  0,1,1,2,3 
*/