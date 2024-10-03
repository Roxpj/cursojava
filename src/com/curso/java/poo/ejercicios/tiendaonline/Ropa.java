package com.curso.java.poo.ejercicios.tiendaonline;

public class Ropa extends Producto {
	
	private String nombre;
	private int talla;
	private String color;

	public Ropa(int ref, double precio, String nombre, int talla, String color) {
		super(ref, precio);
		this.nombre = nombre;
		this.talla = talla;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return  getRef() + "   -   " + nombre + "    " + talla + "      " + color + "   -  "+getPrecio() + "€";
	}
	
}
