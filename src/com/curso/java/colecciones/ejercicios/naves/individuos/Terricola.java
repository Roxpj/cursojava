package com.curso.java.colecciones.ejercicios.naves.individuos;

import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxPointsLimitException;

public class Terricola extends Guerrero {
	
	private String pais;

	public Terricola(String nombre, String tipo, int fuerza, int resistencia, String pais) throws MaxPointsLimitException {
		super(nombre, tipo, fuerza, resistencia);
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

}
