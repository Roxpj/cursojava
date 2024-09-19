package com.curso.java.poo.ejercicios.carreracaballos;

public class GranPremio {

	private int id;
	private String nombre;
	private Carrera[] carreras;
	
	public GranPremio(String nombre, Carrera[] carreras) {
		super();
		this.nombre = nombre;
		this.carreras = carreras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}
	
	
}

/*
Clase GranPremio
id
nombre
Carrera [] carreras
*/