package com.curso.java.poo.ejercicios.maniqui;

public class Camisa {

	private String color;
	private int talla;
	private double precio;
	private Boton[] botones;
	
	public Camisa(String color, int talla, double precio, Boton[] botones) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botones = botones;
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
	public Boton[] getBotones() {
		return botones;
	}
	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}
	
}
