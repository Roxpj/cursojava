package com.curso.java.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.curso.java.poo.ejercicios.alumnos.Alumno;

public class EjemplosList {

	public static void main(String[] args) {
		//COLECCIONES LIST
		
		//Creamos un ArrayList asignado a una variable del mismo tipo.
		ArrayList lista = new ArrayList();
		
		//No es aconsejable objetos de distintos tipos, aunque podamos, si no expecificamos los objetos se guardan con tipo Object
		lista.add("Hola");
		lista.add(1);
		lista.add(new Alumno("111A", "N1", "A1"));
		
		//<E> a esto se le llama genéricos, si al hacer la clase le indico un tipo de objeto así ArrayList<Alumno>, 
		//solo dejará guardar objetos de ese tipo
		ArrayList<Alumno> lista2 = new ArrayList<Alumno>();
		lista2.add(new Alumno("222B", "N2", "A2"));

		//Así es como lo veremos más a menudo, guardandolas en variables con la interfaz List,
		//ya que es posible que no sepamos con qué clase de colección fue creada.
		List<Alumno> lista3 = new ArrayList();
		
		//.add
		//.get
		//.remove
		//.size
		lista3.add(new Alumno("333C", "N3", "A3"));
		lista3.add(new Alumno("444D", "N4", "A4"));
		lista3.add(new Alumno("555E", "N5", "A5"));
		
		
		//Para recorrerlas lo hacemos igual que con Arrays, con un foreach
		for (Alumno alumno : lista3) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("==============================");
		//o con un for
		for (int i=0; i<lista3.size(); i++) {
			Alumno alumno = lista3.get(i);
			System.out.println(alumno.getNombre());
		}
		System.out.println("==============================");
		
		
		//Si añadimos indicando un índice, no sobreescribe, si no que recoloca los objetos que ya estaban
		Alumno alumno6 = new Alumno("333C", "N3", "A3");
		lista3.add(0, alumno6);
		lista3.add(0, alumno6); //Permite guardar el mismo objeto dos veces, aquí el anterior pasaría a la posicion 1 para hacer sitio a este.
		lista3.set(0, alumno6); //Con el método set reemplazamos un objeto de la lista por otro dado al indicar el índice
		
		for (Alumno alumno : lista3) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("==============================");
		
		lista3.remove(alumno6); //Elimina la primera ocurrencia del objeto que encuentre
		
		
		//Para encontrar por algún atributo recorro con un bucle
		String dni = "333C";
		for (Alumno alumno : lista3) {
			if(alumno.getDni().equals(dni)){
				System.out.println(alumno.getNombre());
				break;
			}
		}
		
		//CopyOnWriteArrayList
		List<Alumno> lista4 = new CopyOnWriteArrayList<Alumno>(); //Para poder modificar la lista mientras la recorremos.
		
		//Algunos otros métodos:
		lista.contains(alumno6);
		lista.indexOf(alumno6);
		lista.lastIndexOf(alumno6);
		
		
	}

}
