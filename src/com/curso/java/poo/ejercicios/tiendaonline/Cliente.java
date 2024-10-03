package com.curso.java.poo.ejercicios.tiendaonline;

import com.curso.java.utils.Utilidades;

public class Cliente extends Usuario {
	
	private Producto[] carritoCompra;
	private boolean vip;

	public Cliente(String nombre, String codigoUsuario, String contraseña) {
		super(nombre, codigoUsuario, contraseña);
		this.carritoCompra = new Producto[10];
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

	public void vaciarCarrito() {
		this.carritoCompra = new Producto[10];
	}
	
	public void pagarCarrito(double total) {
		System.out.println("El total a pagar es "+total+"€");
		double pago = Utilidades.pideDatoNumericoDouble("Introduzca el pago [ej. 100]");
		if(pago==total) {
			System.out.println("Pago realizado. Recibirá su pedido en los próximos días.");
			this.vaciarCarrito();
		}else {
			System.out.println("Introduzca la cantidad exacta.");
			pagarCarrito(total);
		}
	}

	public double mostrarCarrito(){
		double total = 0;
		System.out.println("Tu Carrito de Compra");
		for(Producto producto : this.getCarritoCompra()) {
			if(producto!=null) {
				System.out.println("\t-"+producto.toString());
				total += producto.getPrecio();				
			}
		}
		System.out.println("\tTotal a pagar:\t\t\t"+total+"€");
		return total;
	}
	
}
