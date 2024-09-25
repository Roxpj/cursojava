package com.curso.java.poo.ejercicios.bandamusica;

public class Tambor extends Instrumento {

	private String material;

	public Tambor(String nombre, String material) {
		super(nombre, "percusión");
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public void afinar() {
		System.out.println("Afinando el tambor satisfactoriamente.\n");
		this.setAfinado(true);
	}
	
	public void aporrear() {
		System.out.println("Aporreando el tambor.");
	}
	
	@Override
	public void tocar() {
		aporrear();
	}
	
	@Override
	public void limpiar() {
		System.out.println("Limpiando el tambor.");
	}
}
