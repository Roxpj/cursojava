package com.curso.java.inicio.strings.ejercicios;

public class EjercicioDividirNombreExtension {
		
	public static void main(String[] args) {
		
		String nombreFichero = "fichero.jpg";
		
		int punto = nombreFichero.lastIndexOf(".");
		
		String nombre = nombreFichero.substring(0,punto);
		String extension = nombreFichero.substring(punto);
		
		System.out.println("El nombre del archivo es " + nombre);	
		System.out.println("La extensión del archivo es " + extension);
	}
}

/*
Sacar por separado el nombre y la extensión de un archivo
*/