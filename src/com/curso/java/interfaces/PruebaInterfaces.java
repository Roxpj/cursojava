package com.curso.java.interfaces;

import com.curso.java.poo.ejercicios.bandamusica.Guitarra;
import com.curso.java.poo.ejercicios.bandamusica.Instrumento;
import com.curso.java.poo.ejercicios.carreracaballos.Caballo;

public class PruebaInterfaces {

	public static void main(String[] args) {
		Saxofon saxo = new Saxofon("Saxo1", "");
		Guitarra guitarra = new Guitarra("Guitarra1", 6);
		Caballo vaca1 = new Caballo("Lola", 14, 0, 78, 55, 55);
		
		Vendible vendible1 = new Saxofon("Saxo2", ""); // Podemos hacer esto porque Saxofon tiene implementada la interfaz Vendible
		//hacemos esto cuando nos interesan los métodos de la interfaz, quizá para meterlos en un mismo array
		
		PruebaInterfaces pi = new PruebaInterfaces();
		pi.limpiar(saxo);
		pi.limpiar(guitarra);
		
		pi.vender(vaca1);
	}
	
	public void limpiar (Instrumento instrumento) {
		instrumento.limpiar();
	}
	
	
	public void vender (Vendible vendible) {
		vendible.vender();
	}
	
}
