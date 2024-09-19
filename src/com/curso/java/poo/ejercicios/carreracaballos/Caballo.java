package com.curso.java.poo.ejercicios.carreracaballos;

public class Caballo {

	private int id;
	private String nombre;
	private int numero;
	private int edad;
	private int velocidad;
	private int peso;
	private int recorrido;
	
	
	public Caballo(String nombre, int numero, int edad, int velocidad, int peso, int recorrido) {
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
		this.recorrido = recorrido;
	}


	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumero() {
		return numero;
	}

	public int getEdad() {
		return edad;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getRecorrido() {
		return recorrido;
	}

	public void setRecorrido(int recorrido) {
		this.recorrido = recorrido;
	}


	public void correr() {
		int avance = velocidad*(int)(Math.random()*5)-peso*(int)(Math.random()*2)-edad*(int)(Math.random()*2);
		this.recorrido += avance; 
		System.out.println("-"+nombre+" avanza "+avance+" metros y lleva "+recorrido+" recorridos.");
	}
}

/*
Clase Caballo
+ id
+ nombre
+ numero
+ edad (5-20)
+ velocidad (40-80)
+ peso (200-400)
+ ??

correr 
	(simular avance del caballo)
	velocidad*(random(1-20))-peso*(random(1-3))-edad*(random(1-3))
	"Caballo x avanza z metros y lleva w recorridos"
*/