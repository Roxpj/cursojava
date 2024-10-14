package com.curso.java.ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.curso.java.poo.ejercicios.alumnos.Alumno;

public class EjercicioFicheros {

	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\Tardes.SB03-08\\Desktop\\ejercicioficheros");
		String name = directorio.getName();
		System.out.println(name);

		//Cuantos ficheros hay en el directorio
		String[] ficheros = directorio.list();
		int numArchivos = ficheros.length;
		System.out.println(numArchivos);
		
		//Tamaño del directorio
		System.out.println(directorio.getTotalSpace());

		System.out.println("\n--------------------------------");
		//Mostrar el nombre de todos los ficheron que sean imágenes
		for (String fichero : ficheros) {
			if(fichero.endsWith(".jpg")|| fichero.endsWith(".png")) {
				System.out.println(fichero);				
			}
		}
		
		System.out.println("\n--------------------------------");
		//Mostrar el tamaño y el nombre del fichero más grande
		long tamanioGrande = 0;
		String nombreFicheroGrande = "";
		for (String nombreFichero : ficheros) {
			File fichero = new File("C:\\Users\\Tardes.SB03-08\\Desktop\\ejercicioficheros\\"+nombreFichero);
			long tamanio = fichero.length();
			System.out.println(tamanio/1024+"KB");
			if(tamanio>tamanioGrande) {
				tamanioGrande = tamanio;
				nombreFicheroGrande = nombreFichero;
			}
		}
		System.out.println(nombreFicheroGrande+" "+tamanioGrande/1024+"KB");
		
		
		
		System.out.println("\n--------------------------------");
		List<Alumno> alumnos = new ArrayList();
		try {
			alumnos = leerAlumnos("fichero_datos.txt");
			for (Alumno alumno : alumnos) {
				System.out.println(alumno.getDni());
			}
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("Cantidad de alumnos: "+alumnos.size());
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
		}

		
	}
	
	//Segunda parte - Lectura de archivos - fichero_datos.txt

	//Cargar los alumnos del fichero en una lista
	public static List<Alumno> leerAlumnos(String nombre) throws IOException{
		System.out.println("\n--------------------------------");
		Path path = Paths.get(nombre);
		List<Alumno> alumnos = new ArrayList();
		List<String> lines = Files.readAllLines(path);
		
		for (String linea : lines) {
			String[] valoresAlumnos = linea.split(";");
			try {
				String nombreAlumno = valoresAlumnos[0];
				String dniAlumno = valoresAlumnos[1];
				String apellidoAlumno = valoresAlumnos[2];
				System.out.println(nombreAlumno);
				
				Alumno alumno = new Alumno(dniAlumno, nombreAlumno, apellidoAlumno);
				alumnos.add(alumno);			
			}catch(ArrayIndexOutOfBoundsException aiobe) {
				System.err.println("Error " + aiobe.getMessage()+" in line: "+linea);
			}
		}
		return alumnos;
	}
	
}
