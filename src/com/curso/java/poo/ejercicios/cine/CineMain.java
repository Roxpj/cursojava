package com.curso.java.poo.ejercicios.cine;

import com.curso.java.utils.Utilidades;

public class CineMain {

	public static void main(String[] args) {

		Espectador espect1 = new Espectador("Milky", "321P");
		Espectador espect2 = new Espectador("Mishi", "654L");
		Espectador espect3 = new Espectador("Kirli", "987M");
		Espectador[] espectadores = { espect1, espect2, espect3 };
		
		Espectador [][] butacas1 = new Espectador [2][3];
		Espectador [][] butacas2 = new Espectador [4][4];
		Espectador [][] butacas3 = new Espectador [2][4];
		
		Sala sala1 = new Sala(1, "Matrix", butacas1);
		Sala sala2 = new Sala(2, "LOTR", butacas2);
		Sala sala3 = new Sala(3, "Deadpool", butacas3);
		
		Sala[] salas = { sala1, sala2, sala3 };
		
		Cine cine1 = new Cine("Cines Vose", salas);
		
		CineMain cineMain1 = new CineMain();
		cineMain1.comprarEntradas(espectadores, cine1);

	}

	public void comprarEntradas(Espectador[] espectadores, Cine cine) {
		for(Espectador espect : espectadores) {
			int numEntradas = Utilidades.pideDatoNumerico("Bienvenido "+espect.getNombre()+". ¿Cuántas entradas quieres comprar?");
			System.out.println("Estas son las películas con butacas disponibles:");

			cine.pintarSalasDisponibles(cine, numEntradas);
			
			int salaSelec = Utilidades.pideDatoNumerico("Indique el número de la sala.");
			Sala sala = cine.getSalas()[salaSelec-1];
			System.out.println();
			
			System.out.println("Estas son las butacas libres de la sala "+salaSelec+":");
			sala.pintarButacas(sala.getButacas());
			
			sala.seleccionarButacas(numEntradas, sala.getButacas(), espect);
		}
		cine.pintarResumen(cine);
		
	}
	
	
	
}

/*
Espectador 
nombre
dni

Sala
numero
tituloPelicula
butacas

Cine
nombre
salas

Clase con main
- Crear Cine con 3 salas
- Crear 3 espectadores
- por cada espectador preguntarle 
	+ cuantas entradas quiere
	+ que pelicula quiere ver (solo las que tengan suficientes butacas disponibles)
+ de la pelicula seleccionada mostrarle los asientos libres
+ que pueda elegir fila y asientos o solo fila
+ Cuando todos los espectadores hayan comprado la entrada mostrar un resumen por cada sala del cine
*/

