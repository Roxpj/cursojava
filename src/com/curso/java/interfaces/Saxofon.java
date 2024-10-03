package com.curso.java.interfaces;

import com.curso.java.poo.ejercicios.bandamusica.Instrumento;

public class Saxofon extends Instrumento implements Vendible, Interfaz3, Interfaz1{

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub

	}

	public Saxofon(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public Saxofon(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void metodo6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vender() {		// Sobreescribimos el método que implementamos con la interfaz Vender
		System.out.println("Vendiendo Saxofon");
		
	}
	
	
	

}
