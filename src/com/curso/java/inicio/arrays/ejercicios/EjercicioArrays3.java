package com.curso.java.inicio.arrays.ejercicios;

import java.util.Scanner;

public class EjercicioArrays3 {

	public static void main(String[] args) {
		
		System.out.println("¿Cuántos números se van a registrar?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int [] numeros = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("Introduce un valor:");
			scan = new Scanner(System.in);
			numeros[i] = scan.nextInt();
		}
		
		//Muestra valores introducidos
		System.out.println("Hay " +numeros.length+ " números registrados:");
		for(int numero : numeros) {
			System.out.println("\t- "+ numero);
		}
		
		//Muestra al revés
		for(int i=numeros.length; i>=0; i--) {
			System.out.print(numeros[i] + " ");
		}
		
		//Reordena a la inversa los valores del array y lo muestra
		int [] copia = new int[numeros.length];
		for(int i=0; i<num; i++) {
			copia[i] = numeros[i];
		}
		for (int i=0; i<num; i++) {
			int indice= numeros.length-i-1;
			numeros[i] = copia[indice];
		} 
		System.out.println("\n---------------------\n");
		for(int numero : numeros) {
			System.out.println("\t- "+ numero);
		}
	}
	
}
/*
	EjercicioArrays3
==========================================================
Pedir cuantos números se van a guardar
Pedir los valores de cada número
Mostrar todos los números introducidos
Reordenar los números de manera inversa en el array
Mostrar de nuevo todos los números

*/