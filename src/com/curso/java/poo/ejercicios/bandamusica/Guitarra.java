package com.curso.java.poo.ejercicios.bandamusica;

public class Guitarra extends Instrumento {

	private int numeroCuerdas;

	public Guitarra(String nombre, int numeroCuerdas) {
		super(nombre, "cuerda");
		this.numeroCuerdas = numeroCuerdas;
	}

	
	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}
	public void setNumeroCuerdas(int numeroCuerdas) {
		this.numeroCuerdas = numeroCuerdas;
	}
	
	
	@Override
	public void afinar() {
		System.out.println("Afinando la guitarra...");
		super.afinar();
		System.out.println();
	}
	
	@Override
	public void limpiar() {
		System.out.println("Limpiando la guitarra.");
	}
	
}
