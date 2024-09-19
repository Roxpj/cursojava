package com.curso.java.inicio.bucles.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6174 {

	public static void main(String[] args) {
		
		System.out.println("Vamos a comprobar la constante de Kaprekar. Introduce un número de 4 cifras:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		int mayorMenor = 0;
		int menorMayor = 0;
		
		int vueltas = 0;
		
		if(numero==6174) {
			System.out.println("¿Intentas hacer trampas?");
		}
		
		do {
			//convertimos numero a string
			String cadenaNumero = String.valueOf(numero);
			
			//convertimos string a cadena de caracteres
			char[] digitos = cadenaNumero.toCharArray();
			
			//ordenamos la cadena de caracteres
			Arrays.sort(digitos);
			
			//conviertimos a numero
			menorMayor = Integer.parseInt(new String(digitos));
		
			//revertimos el orden de los digitos y convertimos a número
			String reverse = new StringBuilder(new String(digitos)).reverse().toString();
			mayorMenor = Integer.parseInt(reverse);
			
			//hacemos el cálculo
			numero = mayorMenor-menorMayor;
			System.out.println("\t" + mayorMenor + "-" + menorMayor + " = " + numero);
			vueltas++;
			
		}while(numero!=6174);
		
		if(vueltas<=7) {
			System.out.println("Hemos comprobado la constante de Kaprekar en " + vueltas + " intentos.");
		}else {
			System.out.println("¡Dios mío, hemos roto la constante de Kaprekar! Llama a un matemático y cuentaselo.");
		}
				
	}

}
/*
6174
===============================
Pedir un numero de 4 digitos.
Ordenar cada dígito de mayor a menor, y de menor a mayor, y restar 
antes de siete repeticiones, ¿Llega al numero 6174?
*/