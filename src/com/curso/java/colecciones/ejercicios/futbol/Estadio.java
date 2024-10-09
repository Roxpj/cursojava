package com.curso.java.colecciones.ejercicios.futbol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Estadio {
	private String nombre;

	public Estadio(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public static void main(String[] args) {
	
		Estadio estadio1 = new Estadio("estadio1");
		estadio1.iniciarPartido();
	
	}
	
	private void iniciarPartido() {
		
		Equipo equipo1 = new Equipo("E1");
		Equipo equipo2 = new Equipo("E2");
		
		Jugador jugador1 = new Jugador("J1", 22, "centro");
		Jugador jugador2 = new Jugador("J2", 17, "centro");
		Jugador jugador3 = new Jugador("J3", 32, "portero");
		Jugador jugador4 = new Jugador("J4", 21, "portero");
		Jugador jugador5 = new Jugador("J5", 18, "defensa");
		Jugador jugador6 = new Jugador("J6", 34, "defensa");
		
		List<Jugador> jugadores1 = new ArrayList();
		jugadores1.add(jugador1);
		jugadores1.add(jugador3);
		jugadores1.add(jugador5);
		
		List<Jugador> jugadores2 = new ArrayList();
		jugadores2.add(jugador2);
		jugadores2.add(jugador4);
		jugadores2.add(jugador6);
		
		Map<Equipo, List<Jugador>> partido = new HashMap();
		partido.put(equipo1, jugadores1);
		partido.put(equipo2, jugadores2);
		
		mostrarJugadores(partido);
		mostrarEquipo(partido);
	}
	
	private void mostrarJugadores(Map<Equipo, List<Jugador>> partido) {
		System.out.println("Lista de jugadores en el estadio:");
		Collection<List<Jugador>> listasJugadores = partido.values();
		for (List<Jugador> jugadores : listasJugadores) {
			for (Jugador jugador : jugadores) {
				System.out.println(jugador.getNombre());
			}
		}
	}
	
	private void mostrarEquipo(Map<Equipo, List<Jugador>> partido) {
		System.out.println("\nDatos de los equipos: ");
		Set<Entry<Equipo, List<Jugador>>> entries = partido.entrySet();
		for (Entry<Equipo, List<Jugador>> entry : entries) {
			Equipo equipo = entry.getKey();
			System.out.println("\n"+equipo.toString());
			
			List<Jugador> lista = entry.getValue();
			for (Jugador jugador : lista) {
				System.out.println(jugador.toString());
			}
		}
	}
	
}
