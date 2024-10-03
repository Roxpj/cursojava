package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.interfaces.ejercicios.bar.exceptions.TooColdTemperatureException;
import com.curso.java.interfaces.ejercicios.bar.exceptions.TooHotTemperatureException;

public class Bar {
	
	private String nombre;

	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static void main(String[] args) {
		
		Bar bar1 = new Bar("Casa Lola");
		bar1.abrirBar();
	}
	
	private void abrirBar() {
		System.out.println("Abriendo bar "+this.nombre);
		
		Huesped huesped1 = new Huesped("huesped1", "987654G");
		Comensal comensal1 = new Comensal("comensal1", true);
		ClienteAsiduo asiduo1 = new ClienteAsiduo("asiduo1", "el Wiwi");
		
		ServibleCafe[] cafeteros = { comensal1, asiduo1 };
		
		servirCafe(cafeteros);
	}
	
	private void servirCafe(ServibleCafe[] clientesBar) {
		
		for (ServibleCafe cliente : clientesBar) {
			TazaCafe cafe = new TazaCafe("Descafeinado");
			try {
				cliente.tomarCafe(cafe);					
			}catch(TooHotTemperatureException | TooColdTemperatureException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

/*
Cliente
nombre

Huesped
 	dni

Comensal
	tieneReserva

ClienteAsiduo
	mote


TazaCafe
tipoCafe
temperatura

Solo los comensales y los clientes asiduos pueden tomar café.
Si cuando un cliente se toma una taza de café el café está muy caliente (>80º) se va a lanzar la excepción TooHotTemperatureException
y si está muy frío (<20º) se va a lanza la excepción TooColdTemperatureException. Ambas excepciones heredan de TemperatureException


Bar
nombre	

main()--> abrirBar()
	1 x Huésped
	1 x Comensal
	1 x ClienteAsiduo


método para que todos los clientes que puedan tomar café lo puedan tomar
	se crean las tazas de café que se toman los clientes que pueden
*/