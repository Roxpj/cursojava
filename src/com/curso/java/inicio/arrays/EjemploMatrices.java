package com.curso.java.inicio.arrays;

public class EjemploMatrices {

	public static void main(String[] args) {
		
		//Por cada [] va a añadir una dimensión
		
		//filas y columnas
		int [] [] notas = new int [2] [3];
		
		System.out.println(notas[1][1]);
		
		System.out.println(notas.length);    //aquí da el número de filas
		System.out.println(notas[1].length); //aquí da la longitud (número de columnas) de la fila indicada
		
		
		int [][] edades = new int [3][];
		System.out.println(edades[0][0]); //error, no existen columnas
		edades[0]= new int[5];
		edades[1]= new int[2]; //Así creamos filas con distinta longitud de columnas
		
		int[][] multiArray = { //Así creamos filas con distinta longitud de columnas
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8, 9}
	        };
	}

}
