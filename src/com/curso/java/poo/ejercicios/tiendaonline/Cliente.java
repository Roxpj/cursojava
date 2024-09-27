package com.curso.java.poo.ejercicios.tiendaonline;

public class Cliente extends Usuario {
	
	private Producto[] carritoCompra;
	private boolean vip;

	public Cliente(String nombre, String codigoUsuario, String contraseña) {
		super(nombre, codigoUsuario, contraseña);
		// TODO Auto-generated constructor stub
	}

	public Producto[] getCarritoCompra() {
		return carritoCompra;
	}
	public void setCarritoCompra(Producto[] carritoCompra) {
		this.carritoCompra = carritoCompra;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public void pagar() {
		
	}
	
	
}
