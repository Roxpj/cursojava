package com.curso.java.poo.ejercicios.tiendaonline;

public class Libro extends Producto {
	
	private int isbn;
	private String titulo;

	public Libro(int ref, double precio, int isbn, String titulo) {
		super(ref, precio);
		this.isbn = isbn;
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
}
