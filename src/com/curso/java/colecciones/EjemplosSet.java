package com.curso.java.colecciones;

import java.util.HashSet;
import java.util.Set;

import com.curso.java.poo.ejercicios.alumnos.Alumno;

public class EjemplosSet {

	public static void main(String[] args) {
		//COLECCIONES LIST
		//No permiten guardar por posiciones, las gestiona solo, y no permite duplicados.
		//Los HashSet utilizan el hash de los objetos para guardarlos y para comprobar si están duplicados (comprueban si están ya añadidos)
		//LinkedHashSet los guarda en el orden en el que los introduces, HashSet de manera aleatoria.

		Set<Alumno> conjunto = new HashSet();
		
		conjunto.add(new Alumno("222B", "N2", "A2"));
		conjunto.add(new Alumno("333C", "N3", "A3"));
		conjunto.add(new Alumno("444D", "N4", "A4"));
		conjunto.add(new Alumno("555E", "N5", "A5"));
		
		
		//Podemos usar bucles foreach, pero no el for tradicional, ya que los Sets no tienen posiciones
		for (Alumno alumno : conjunto) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("==============================");
		
		//
		Alumno alumno6 = new Alumno("666C", "N6", "A6");
		conjunto.add(alumno6);
		conjunto.add(alumno6); //Como no puede tener repetidos sólo lo guardará una vez
		System.out.println(conjunto.add(alumno6)); //El método add devuelve un booleano, si puede añadirlo o no
		
		
		for (Alumno alumno : conjunto) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("==============================");
		
		
		//Para encontrar por algún atributo recorro con un bucle
		String dni = "333C";
			for (Alumno alumno : conjunto) {
				if(alumno.getDni().equals(dni)){
					System.out.println(alumno.getNombre());
					break;
				}
			}
	}

}
