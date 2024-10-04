package com.curso.java.colecciones.ejercicios.jugueteria;

public class Tren extends Juguete {
	
	private String modelo;

	public Tren(String nombre, double precio, String marca, String modelo) {
		super(nombre, precio, marca);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
