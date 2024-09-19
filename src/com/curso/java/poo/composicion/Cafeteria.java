package com.curso.java.poo.composicion;

public class Cafeteria {

	private String nombre;
	private int aforo;
	
	public Cafeteria(String nombre, int aforo) {
		super();
		this.nombre = nombre;
		this.aforo = aforo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	
	
}
