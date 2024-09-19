package com.curso.java.poo.ejercicios.maniqui;

public class Boton {

	private String forma;
	private String color;
	private int tamanio;
	
	public Boton(String forma, String color, int tamanio) {
		super();
		this.forma = forma;
		this.color = color;
		this.tamanio = tamanio;
	}

	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
}
