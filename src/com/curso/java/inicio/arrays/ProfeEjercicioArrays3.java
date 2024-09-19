package com.curso.java.inicio.arrays;

import java.util.Scanner;

public class ProfeEjercicioArrays3 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("¿Cuántos números quieres almacenar?");
		int cantidad = scan.nextInt();
		int [] numeros = new int[cantidad];
	 	
		for (int i=0 ; i<numeros.length ;  i++  ) {
			scan = new Scanner (System.in);
			System.out.println("Introduce el valor para la posición "+i);
			numeros[i]=scan.nextInt();
		}

		for (int i=0 ; i<numeros.length ;  i++  ) {
			System.out.print(numeros[i]+"|");
		}
		System.out.println();
		for (int i=numeros.length-1 ; i>=0 ;  i--  ) {
			System.out.print(numeros[i]+"|");
		}
		
		System.out.println("\n==============================");
		for (int i=0 ; i<numeros.length/2 ;  i++  ) {
			int aux = numeros[numeros.length-1-i];
			numeros[numeros.length-1-i] = numeros[i];
			numeros[i]=aux;
			//numeros[3]=numeros[0];
		}
		for (int i=0 ; i<numeros.length ;  i++  ) {
			System.out.print(numeros[i]+"|");
		}
	}

}
