package com.curso.java.poo.ejercicios.bandamusica;

public class Instrumento {

	private String nombre;
	private String tipo;
	private boolean afinado;
	
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = false;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isAfinado() {
		return afinado;
	}
	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}
	
	
	public void afinar() {
		afinado= Math.random()>0.4;
		System.out.println("Afinando el intrumento "+this.nombre+(afinado ? " satisfactoriamente." : " catastróficamente."));
	}
	
	public void tocar() {
		System.out.println("Tocando el intrumento "+this.nombre+".");
	}
}
