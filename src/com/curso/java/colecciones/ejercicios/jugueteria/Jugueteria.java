package com.curso.java.colecciones.ejercicios.jugueteria;

import java.util.ArrayList;
import java.util.List;

import com.curso.java.utils.Utilidades;

public class Jugueteria {
	
	private String nombre;

	public Jugueteria(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	public static void main(String[] args) {
		Jugueteria jugueteria = new Jugueteria("Toyss");
		jugueteria.abrirJugueteria();
		
	}
	
	private void abrirJugueteria() {
		System.out.println("Abriendo la juguetería "+this.nombre);
		
		List<Juguete> stock = crearJuguetes();
		mostrarValorStock(stock);
		mostrarModeloTren(stock);
		eliminarMuniecasPorColor(stock);
	}
	
	private List<Juguete> crearJuguetes(){
		Tren tren1 = new Tren("trenecito1", 20.00, "Marca1", "M1");
		Tren tren2 = new Tren("trenecito2", 60.75, "Marca2", "M2");
		Munieca munieca1 = new Munieca("muñequita1", 15.99, "Marca1", "Verde");
		Munieca munieca2 = new Munieca("muñequita2", 50.99, "Marca2", "Roja");
		Munieca munieca3 = new Munieca("muñequita3", 15.99, "Marca1", "Verde");
		Munieca munieca4 = new Munieca("muñequita4", 15.99, "Marca1", "Naranja");
		
		List<Juguete> stock = new ArrayList<Juguete>();
		//	List<Juguete> stock = new CopyOnWriteArrayList<Juguete>(); ---Para poder modificar la lista mientras la recorremos.
		stock.add(tren1);
		stock.add(tren2);
		stock.add(munieca1);
		stock.add(munieca2);
		stock.add(munieca3);
		stock.add(munieca4);
		
		return stock;
	}
	
	
	private void mostrarValorStock(List<Juguete> stock ) {
		double valorStock = 0;
		for (Juguete juguete : stock) {
			valorStock += juguete.getPrecio();
		}
		System.out.println("El valor del stock de la tienda es:");
		System.out.println(valorStock+"\n");
	}

	private void mostrarModeloTren(List<Juguete> stock ) {
		System.out.println("Los modelos de Tren en stock son:");
		for (Juguete juguete : stock) {
			if(juguete instanceof Tren) {
				Tren tren = (Tren)juguete;
				System.out.println(tren.getModelo());
			}
		}
		System.out.println();
	}
	
	
	private void eliminarMuniecasPorColor(List<Juguete> stock) {
		String color = Utilidades.pideDatoString("Introduzca el color del que desea eliminar las muñecas del stock:");
		List<Munieca> muniecasColor = new ArrayList<Munieca>();
		
		for (Juguete juguete : stock) {
			if(juguete instanceof Munieca) {
				Munieca munieca = (Munieca)juguete;
				String colorMunieca = munieca.getColor();
				
				if(colorMunieca.equalsIgnoreCase(color)) {
					muniecasColor.add(munieca);
				}
				
//				if(colorMunieca.equalsIgnoreCase(color)) {
//				stock.remove(munieca);
//				}
				
			}
		}
		for (Munieca munieca : muniecasColor) {
			stock.remove(munieca);
		}
		
		for (Juguete juguete : stock) {
			System.out.println(juguete.getNombre());
		}
	}
	
}
