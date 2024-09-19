package com.curso.java.inicio.arrays.ejercicios;

public class EjercicioMatrices1 {

	public static void main(String[] args) {
		
		int [] [] notas = new int [2] [3];
		
		notas[0][0] = 6;
		notas[0][1] = 3;
		notas[0][2] = 7;
		notas[1][0] = 7;
		notas[1][1] = 2;
		notas[1][2] = 8;
	
	//Con bucle for	
	for(int i=0; i<notas.length; i++) {
		for(int b=0; b<notas[i].length; b++) {
			System.out.print(notas[i][b]);
		}
		System.out.println();
	}
	
	//Con bucle for each
	System.out.println("\n-------------\n");
	
	for (int[] filas : notas) {
		for (int num : filas) {
			System.out.print(num);
		}
		System.out.println();			
	}

	}
}
/* 
	EjercicioMatrices1
==========================================================
+ Definir array bidimensional de enteros de 2x3
+ Dar los valores de cada posición de una en una
+ Mostrar todos los datos en formato matriz con dos for anidados
+ Hacer los mismo con 2 foreach

 */