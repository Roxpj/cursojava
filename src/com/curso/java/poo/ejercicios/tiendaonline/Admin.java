package com.curso.java.poo.ejercicios.tiendaonline;

import com.curso.java.utils.Utilidades;

public class Admin extends Usuario {

	public Admin(String nombre, String codigoUsuario, String contraseña) {
		super(nombre, codigoUsuario, contraseña);
	}

	public void crearUsuario(Usuario[] usuarios) {
		String[] tiposUsuario = { "Administrador", "Cliente" };
		int eleccion = Utilidades.pintaMenuFormatoConRespuestaInt("Qué tipo de usuario quieres crear?", tiposUsuario);
		//TODO ver posiciones libres??
		for(Usuario i : usuarios) {
			
		}
		
		switch(eleccion) {
		case 0: Admin admin = crearAdmin();
		//TODO preguntar posicion y guardar en admin y cliente
				usuarios[0]= admin;
				break;
		case 1: Cliente cliente = crearCliente();
				usuarios[1]= cliente;
				break;
		default: System.out.println(""); crearUsuario(usuarios);
		}
	}
	
	private Admin crearAdmin() {
		System.out.println("Vamos a crear un nuevo usuario, por favor, introduce los siguientes campos:");
		String nombre = Utilidades.pideDatoString("Nombre:");
		String codigoUsuario = Utilidades.pideDatoString("Usuario:");
		String contraseña = Utilidades.pideDatoString("Contraseña:");
		Admin admin = new Admin(nombre, codigoUsuario, contraseña);
		return admin;
	}
	
	private Cliente crearCliente() {
		System.out.println("Vamos a crear un nuevo usuario, por favor, introduce los siguientes campos:");
		String nombre = Utilidades.pideDatoString("Nombre:");
		String codigoUsuario = Utilidades.pideDatoString("Usuario:");
		String contraseña = Utilidades.pideDatoString("Contraseña:");
		Cliente cliente = new Cliente(nombre, codigoUsuario, contraseña);
		return cliente;
	}
	
	public void crearProducto(Producto[] productos) {
		
	}
	
}
