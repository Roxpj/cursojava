package com.curso.java.poo.ejercicios.carreracaballos;

public class Carrera {

	private int id;
	private String nombre;
	private Caballo[] participantes;
	private int distancia;
	
	public Carrera(String nombre, Caballo[] participantes, int distancia) {
		this.nombre = nombre;
		this.participantes = participantes;
		this.distancia = distancia;
	}

	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Caballo[] getParticipantes() {
		return participantes;
	}

	public int getDistancia() {
		return distancia;
	}
	
	public Caballo iniciarCarrera() {
		System.out.println("\tEmpieza la "+nombre+" 🏁 ~♪♬♪♪♬");
		System.out.println();
		Caballo caballoGanador = null;
		boolean finalCarrera = false;
		for(int i=0; i<distancia; i++) {
			for(int j=0; j<participantes.length; j++) {
				participantes[j].correr();
				if(participantes[j].getRecorrido()>=distancia) {
					participantes[j].setRecorrido(0);
					System.out.println();
					System.out.println("\t( •ᴗ•)人 ¡"+participantes[j].getNombre()+" ha quedado en primera posición! ~~✧♞🏁🐎"); caballoGanador = participantes[j]; finalCarrera=true; break;
				}
			}
			if(finalCarrera) break;
			System.out.println();
		}
		return caballoGanador;
	}
}

/*
Clase Carrera
	+ id
	+ nombre
	+ Caballo[]
	+ distancia
	
	iniciarCarrera()
		todos los caballos asignados a la carrera se pongan a correr
		
		//Devolver caballo ganador
*/