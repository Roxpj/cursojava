package com.curso.java.inicio.arrays.ejercicios;

public class EjercicioMatrices2 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [5] [5];
		
		//Relleno matriz con números aleatorios
		for(int i=0; i<matriz.length; i++) {
			for(int b=0; b<matriz[i].length; b++) {
				matriz[i][b] = (int)(Math.random()*10);
				System.out.print(matriz[i][b]+ " ");
			}
			System.out.println();
		}
		
		//Pinto diagonal
		System.out.println(matriz[2][4]);
		for(int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i]);
		}
		
		//Invierto los valores de la diagonal
		for(int i=0; i<matriz.length/2; i++) {
			int aux =  matriz[matriz.length-1-i][matriz.length-1-i];
			matriz[matriz.length-1-i][matriz.length-1-i] = matriz[i][i];
			matriz[i][i] = aux;
			
		}
		
		//Pinto diagonal ya invertida
		System.out.println();
		for(int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i]);
		}
	}

}
// 5x5 sacar diagonal, invertir los valores de la diagonal, mostrar
/* 
	EjercicioMatrices2
==========================================================
+ Definir array bidimensional de enteros de 5x5
+ Dar los valores
+ Mostrar todos los datos en formato matriz
+ Sacar los valores de la diagonal
+ Invertir valores de la diagonal
+ Mostrar los nuevos valores de la diagonal

*/