package com.curso.java.poo.composicion;

public class Departamento {

	private String nombre;
	private String planta;
	
	public Departamento(String nombre, String planta) {
		super();
		this.nombre = nombre;
		this.planta = planta;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPlanta() {
		return planta;
	}
	public void setPlanta(String planta) {
		this.planta = planta;
	}
	
	
}
