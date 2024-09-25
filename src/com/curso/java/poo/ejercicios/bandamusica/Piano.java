package com.curso.java.poo.ejercicios.bandamusica;

public class Piano extends Instrumento {
	
	private int numeroOctavas;
	private String tipoPiano;
	
	public Piano(String nombre, int numeroOctavas, String tipoPiano) {
		super(nombre, "cuerda pulsada");
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
	}
	
	public int getNumeroOctavas() {
		return numeroOctavas;
	}
	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}
	public String getTipoPiano() {
		return tipoPiano;
	}
	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}
	
	
	@Override
	public void afinar() {
		System.out.println("Afinando el piano...");
		super.afinar();
		System.out.println();
	}

	@Override
	public void limpiar() {
		System.out.println("Limpiando el piano.");
	}
}
