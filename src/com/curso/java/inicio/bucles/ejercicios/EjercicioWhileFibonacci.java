package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioWhileFibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos de la serie de Fibonacci quieres visualizar?");
		int numeroElementos = scan.nextInt();
		
		int numeroX = 0;
		int numeroY = 0;
		int numeroZ = 0;
		
		while(numeroElementos>0) {
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
			
			numeroElementos--;
		}
		
		
		//Resultado del profe generando el número de repeticiones en vez de preguntarlo
		System.out.println((int)(Math.random()*10)); // saca un numero de 0 100 random
		//Math.random genera un número aleatorio del 0 al 1
		
		int numRepeticiones = (int)(Math.random()*10)+1; 
		
		int num1= 0;
		int num2 = 1;
		
		System.out.print(""+num1+", "+ num2);
		for (int i= 0; i<numRepeticiones-2; i++) {
			int suma = num1+num2;
			System.out.print(", "+suma);
			num1 = num2;
			num2 = suma;
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