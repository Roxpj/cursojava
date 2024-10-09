package com.curso.java.colecciones.ejercicios.naves.individuos;

import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxPointsLimitException;

public class Marciano extends Guerrero {
	
	private String planeta;

	public Marciano(String nombre, String tipo, int fuerza, int resistencia, String planeta) throws MaxPointsLimitException {
		super(nombre, tipo, fuerza, resistencia);
		this.setPlaneta(planeta);
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}
	
	

}
