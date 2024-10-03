package com.curso.java.poo.ejercicios.tiendaonline;

public class Movil extends Producto {
	
	private String marca;
	private String modelo;

	public Movil(int ref, double precio, String marca, String modelo) {
		super(ref, precio);
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return getRef() + "   -   " + marca + "      " + modelo + "  -  "+getPrecio() + "€";
	}

	
}
