package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjemplosBuclesWhileDoWhile {

	public static void main(String[] args) {
		
	//BUCLE WHILE
		//while(condición){código a ejecutar}
		
		int numero = 0;
		while (numero<10) {
			System.out.println(numero);
			
			if(numero==5) {
				break;
			}
			numero+=3;
		}
		
		
	//BUCLE DO-WHILE
		//Primero pone el código y ejecuta y luego pone la condición
		//do{código a ejecutar}while(condición)
		
		String respuesta ="";
		do {
			System.out.println("¿Deseas continuar?");
			Scanner scan = new Scanner(System.in);
			respuesta = scan.nextLine();
			
		}while(respuesta.equals("si"));
		
	}
}
