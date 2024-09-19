package com.curso.java.poo.ejercicios.maniqui;

public class Vestido {

	private String color;
	private int talla;
	private double precio;
	
	public Vestido(String color, int talla, double precio) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
