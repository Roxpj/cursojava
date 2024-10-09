package com.curso.java.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.curso.java.colecciones.ejercicios.jugueteria.Munieca;
import com.curso.java.poo.ejercicios.alumnos.Alumno;

public class EjemplosMap {

	public static void main(String[] args) {
		//Podemos guardarlo con el tipo de la interfaz (Map)
		//La clave tiene que ser única
		//Hay que tipar los dos campos: clave y valor. 
		Map<String, Alumno> mapaAlumnos = new HashMap();
		
		
		Alumno a1 = new Alumno("111A", "N1", "A1");
		//mapaAlumnos.put("111A", a1); // Guardamos con el método put
		mapaAlumnos.put(a1.getDni(), a1); // No repetipos datos, mucho mejor referenciarlo
		
		Alumno a2 = new Alumno("222B", "N2", "A2");
		Alumno a3 = new Alumno("333C", "N3", "A3");
		mapaAlumnos.put(a2.getDni(), a2);
		mapaAlumnos.put(a3.getDni(), a3);
		
		//El método put nos devuelve el objeto que teniamos guardado antes en esa clave. Puede usarse para sustituir un objeto y no perder el que había.

		//Para recuperar los datos, hay que pasarle un objeto del mismo valor que la clave, y nos devolverá un objeto del tipo valor
		String dni = "333C";
		Alumno alum = mapaAlumnos.get(dni); // Recuperamos con el método get
		
				
		Set<String> dnis = mapaAlumnos.keySet(); //KeySet - Devuelve un Set de todas las claves. Podemos guardar y usar, ej. con forEach.
		for (String dniAlumno : dnis) {
			System.out.println(dniAlumno);
		}
		
		Collection<Alumno> alumnos = mapaAlumnos.values(); //Values - Devuelve una Colección con todos los valores
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
		}
		
		
		//Podemos guardar dentro Listas dentro de Map
		Map<String, List<Munieca>> muniecasColor = new HashMap();
		Munieca doll1 = new Munieca("D1",50,"BArbie","rojo");
		Munieca doll2 = new Munieca("D2",60,"BArbie","azul");
		Munieca doll3 = new Munieca("D3",80,"Nenuco","rojo");
		Munieca doll4 = new Munieca("D4",100,"BArbie","blanco");
		
		muniecasColor.put(null, null);
		
		List<Munieca> dollsRojo = new ArrayList<Munieca>() ;
		dollsRojo.add(doll1);
		dollsRojo.add(doll3);
		List<Munieca> dollsAzul = new ArrayList<Munieca>() ;
		dollsAzul.add(doll2);
		List<Munieca> dollsBlanco = new ArrayList<Munieca>() ;
		dollsBlanco.add(doll4);
		
		muniecasColor.put(null, dollsBlanco);
		System.out.println("--: "+muniecasColor.get(null).size());
		
		muniecasColor.put("rojo", dollsRojo);
		muniecasColor.put("azul", dollsAzul);
		muniecasColor.put("blanco", dollsBlanco);
		
		Set<String> colores = muniecasColor.keySet();
		for (String color : colores) {
			//System.out.println(color);
			List<Munieca> muniecas =  muniecasColor.get(color);
			double precioTotal = 0;
			for (Munieca munieca : muniecas) {
				precioTotal += munieca.getPrecio();
			}
			System.out.println("Para el color "+ color + " el total es " + precioTotal);
		}
		
		//Para recuperar claves y valores
		Set<Entry<String, List<Munieca>>> entries = muniecasColor.entrySet(); //EntrySet - Nos devuelve un Set de Entries, formados por parejas de claves y valores del mapa
		for (Entry<String, List<Munieca>> entry : entries) {
			String color = entry.getKey(); //Recogemos la clave
			List<Munieca> muniecas = entry.getValue(); //Recogemos el valor
			double precioTotal = 0;
			for (Munieca munieca : muniecas) {
				precioTotal += munieca.getPrecio();
			}
			System.out.println("Para el color "+ color + " el total es " + precioTotal);
		}
		
	}

}
