package com.curso.java.inicio.funciones.ejercicios;

public class EjerciciosFunciones {

	public static void main(String[] args) {
		int tamanio = funciones1("cerdito");
		System.out.println("La palabra tiene "+tamanio+" letras.");
		funciones2(3,"hola");
		funciones3(2);
	}
	
	public static int funciones1(String texto) {
		int longitud = texto.trim().length();
		return longitud;
	}
	
	public static void funciones2(int numero, String texto) {
		for(int i=0; i<numero; i++) {
			System.out.println(texto);
		}
	}
	
	public static void funciones3(int numero) {
		for(int i=0; i<11; i++) {
			System.out.println(numero+"x"+i+" = "+(numero*i));
		}
	}

}

/*
Funciones1
definir funcion que recibe un String y devuelve la longitud del String

Funciones2
Funcion que recibe un numero y un texto y me va a pintar el texto que le pasemos el numéro de veces indicado por el parámetro

Funciones3
Funcion a la que le paso un numero y me pinta la tabla de multiplicar de ese numero
*/

