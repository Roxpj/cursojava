package com.curso.java.poo.ejercicios.bandamusica;

public abstract class Instrumento {

	private String nombre;
	private String tipo;
	private boolean afinado;
	
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
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
	
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", afinado=" + afinado + "]";
	}
	
	public void afinar() {
		afinado= Math.random()>0.4;
		System.out.println("Afinando el intrumento "+this.nombre+(afinado ? " satisfactoriamente." : " catastróficamente."));
	}
	
	public void tocar() {
		System.out.println("Tocando el intrumento "+this.nombre+".");
	}

	public abstract void limpiar();
	
}
