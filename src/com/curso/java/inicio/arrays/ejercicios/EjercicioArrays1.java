package com.curso.java.inicio.arrays.ejercicios;

public class EjercicioArrays1 {

	public static void main(String[] args) {
		
		int [] numeros = new int[3];
		numeros[0] = 5;
		numeros[1] = 57;
		numeros[2] = 6;
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		
		double media = 0;
		for(int i=0; i<3; i++) {
			System.out.println(numeros[i]);
			media+= numeros[i];
		}
		media/=numeros.length;
		System.out.println("El numero medio es "+media);
		
	}

}
/* 
	EjercicioArrays1
==========================================================
Definir un array de enteros de longitud 3
Vais a dar los valores de cada posición de una en una
Mostrar 
+ Uno por uno
+ Desde un bucle
+ Media de todos los numeros que hay en el array
*/