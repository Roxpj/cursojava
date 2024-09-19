package com.curso.java.poo.ejercicios.cine;

import com.curso.java.utils.Utilidades;

public class Sala {

	private int numero;
	private String tituloPelicula;
	private Espectador[][] butacas;
	
	public Sala(int numero, String tituloPelicula, Espectador[][] butacas) {
		super();
		this.numero = numero;
		this.tituloPelicula = tituloPelicula;
		this.butacas = butacas;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTituloPelicula() {
		return tituloPelicula;
	}
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
	public Espectador[][] getButacas() {
		return butacas;
	}
	public void setButacas(Espectador[][] butacas) {
		this.butacas = butacas;
	}
	
	
	public void pintarButacas(Espectador[][] butacas) {
		int[] columnas = Utilidades.crearIndiceNum(butacas[0].length);
		int[] filas = Utilidades.crearIndiceNum(butacas.length);
		for(int i: columnas) {
			System.out.print("  "+i);
		}
		System.out.println();
		for(int a=0; a<butacas.length; a++) {
			System.out.print(filas[a]+"|");
			for(int b=0; b<butacas[a].length; b++) {
				if(butacas[a][b]!=null) {
					System.out.print(" X|");
				}else {
					System.out.print("  |");					
				}
			}
			System.out.println();
		}
		System.out.println("---Pantalla---");
	}
	
	public void seleccionarButacas(int numEntradas, Espectador[][] butacas, Espectador espect) {
		String[] entradas = new String [numEntradas];
		for(int i=0; i<numEntradas; i++) {
			String input = Utilidades.pideDatoString("Seleccione la fila y columna para su entrada nº"+(i+1)+". [fila-colum]");
			//TODO comprobar sea num, sea 3 long
			if(input.length()!=3 || !input.contains("-") || input.charAt(0)!=0) {
				
			}
			String [] filaYColum = input.split("-");
			int fila = Integer.parseInt(filaYColum[0])-1;
			int colum = Integer.parseInt(filaYColum[1])-1;
			
			if(butacas[fila][colum]==null) {
				entradas[i] = input;
				butacas[fila][colum]=espect;
			}else {
				System.out.println("La butaca seleccionada no está disponible, vuelva a seleccionar su entrada.");
				i--;
			}
		}
		System.out.println("Has reservado las siguientes entradas:");
		for(String entrada : entradas) {
			System.out.println("\t §["+entrada+"]§");
		}
	}
	
}
