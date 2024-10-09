package com.curso.java.ficheros;

import java.io.File;

public class EjercicioFicheros {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Tardes.SB03-08\\Desktop\\ejercicioficheros");
		String name = file.getName();
		System.out.println(name);
		
		//Cuantos ficheros hay en el directorio
		String[] ficheros = file.list();
		int numArchivos = ficheros.length;
		System.out.println(numArchivos);
		
		//Tamaño del directorio
		System.out.println(file.getTotalSpace());
		
		//Mostrar el nombre de todos los ficheron que sean imágenes
		for (String fichero : ficheros) {
			if(fichero.endsWith(".jpg")|| fichero.endsWith(".png")) {
				System.out.println(fichero);				
			}
		}
		
		
	}
	
}
