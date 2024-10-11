package com.curso.java.colecciones.ejercicios.naves.individuos;

import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxPointsLimitException;

public class Guerrero {
	private String nombre;
	private String tipo;
	private int fuerza;
	private int resistencia;
	
	public Guerrero(String nombre, String tipo, int fuerza, int resistencia) throws MaxPointsLimitException{
		super();
		if(fuerza+resistencia>10) {
			throw new MaxPointsLimitException("Los puntos de fuerza y resistencia combinados no deben ser mayores que 10.");
		}
		this.nombre = nombre;
		this.tipo = tipo;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getFuerza() {
		return fuerza;
	}
	public int getResistencia() {
		return resistencia;
	}
	
}
