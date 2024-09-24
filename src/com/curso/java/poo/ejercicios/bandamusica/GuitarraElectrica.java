package com.curso.java.poo.ejercicios.bandamusica;

public class GuitarraElectrica extends Guitarra {
	
	public int potencia;

	public GuitarraElectrica(String nombre, int numeroCuerdas, int potencia) {
		super(nombre, numeroCuerdas);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando muy alto "+this.getNombre()+".");
	}
	
}
