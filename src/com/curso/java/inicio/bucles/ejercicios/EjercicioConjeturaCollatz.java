package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioConjeturaCollatz {

	public static void main(String[] args) {
		
		System.out.println("Vamos a comprobar la conjetura de Collatz. Introduce un número.");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		while(numero!=1) {
			
			if(numero%2==0) {
				numero/=2;
				System.out.println(numero);
			}else {
				numero = numero*3 + 1;
				System.out.println(numero);
			}
		}
		
	}

}
/*
Conjetura Collatz
===============================================================
Todo número entero positivo llegará siempre a ser UNO siguiendo las siguientes reglas matemáticas

Se pide un numero

Si el número es par: Dividimos entre dos
Si el número es impar: Multiplicados por tres y sumamos 1

Repetir mientras que el numero sea distinto de 1
*/