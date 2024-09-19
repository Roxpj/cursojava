package com.curso.java.inicio.bucles;

public class EjemplosBucleForEach {

	public static void main(String[] args) {
		
		//ESTRUCTURA BÁSICA
			/*
			  for ( : ){
			  }
			*/
		
		// for (los valores : el array a recorrer){
	    //  aqui usamos el valor, se repetirá por cada posición uno a uno 
		// }
		
		
		int [] numeros = new int[3];
		numeros[0] = 41;
		numeros[1] = 57;
		numeros[2] = 6;
		
		for ( int num : numeros ) {
			System.out.println(num);
		}
		
	}
	
}
