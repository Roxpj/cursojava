package com.curso.java.colecciones.ejercicios.jugueteria;

public class Munieca extends Juguete {

	private String color;
	
	public Munieca(String nombre, double precio, String marca, String color) {
		super(nombre, precio, marca);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
