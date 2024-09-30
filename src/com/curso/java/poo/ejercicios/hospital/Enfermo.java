package com.curso.java.poo.ejercicios.hospital;

public class Enfermo extends Persona {

	private String enfermedad;
	
	public Enfermo() {
	}
	
	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}
	
	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public void comer() {
		System.out.println("El enfermo "+super.getNombre()+" está comiendo en la habitación.");
	}

}
