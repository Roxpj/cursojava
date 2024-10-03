package com.curso.java.poo.ejercicios.tiendaonline;

public class Producto {

	private int ref;
	private double precio;
	
	public Producto(int ref) {
		super();
		this.ref = ref;
	}
	public Producto(int ref, double precio) {
		super();
		this.ref = ref;
		this.precio = precio;
	}
	
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [ref=" + ref + ", precio=" + precio + "]";
	}

}
