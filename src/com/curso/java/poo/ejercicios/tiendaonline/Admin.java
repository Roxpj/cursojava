package com.curso.java.poo.ejercicios.tiendaonline;

import com.curso.java.utils.Utilidades;

public class Admin extends Usuario {

	public Admin(String nombre, String codigoUsuario, String contraseña) {
		super(nombre, codigoUsuario, contraseña);
	}

	public void crearUsuario(Usuario[] usuarios) {
		String[] tiposUsuario = { "Administrador", "Cliente", "Volver" };
		int eleccion = Utilidades.pintaMenuFormatoConRespuestaInt("Qué tipo de usuario quieres crear?", tiposUsuario);
				
		switch(eleccion) {
		case 0: Admin admin = crearAdmin();
				int indice1 = mostrarVacantesUsuario(usuarios);
				usuarios[indice1]= admin;
				break;
		case 1: Cliente cliente = crearCliente();
			int indice2 = mostrarVacantesUsuario(usuarios);
				usuarios[indice2]= cliente;
				break;
		case 2: break;
		default: System.out.println("Por favor, seleccione una de las opciones."); crearUsuario(usuarios);
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
	
	private int mostrarVacantesUsuario(Usuario[] usuarios) {
		System.out.println("Estos son los huecos libres para registrar el usuario:");
		for(int i=0; i<usuarios.length; i++) {
			if(usuarios[i]==null) {
				System.out.println("-"+(i+1));
			}
		}
		int indice = Utilidades.pideDatoNumerico("Introduce la posición donde quieres registrar el usuario.")-1;
		if(indice<usuarios.length && indice>=0 && usuarios[indice]!=null) {
			System.out.println("Usuario creado correctamente.");
		}else {
			System.out.println("Por favor, selecciona una posición válida para guardar el usuario.");
			mostrarVacantesUsuario(usuarios);
		}
		return indice;
	}
	
	public Producto[] crearProducto(Producto[] productos) {
		Producto[] productosActualizada = new Producto[productos.length + 1];
		System.arraycopy(productos, 0, productosActualizada, 0, productos.length);
		String[] tiposProducto = { "Libro", "Móvil", "Ropa", "Volver" };
		int eleccion = Utilidades.pintaMenuFormatoConRespuestaInt("Qué tipo de producto quieres crear?", tiposProducto);
		switch(eleccion) {
		case 0: Libro libro = crearLibro();
				productosActualizada[-1] = libro;
				break;
		case 1: Movil movil = crearMovil();
				productosActualizada[-1] = movil;
				break;
		case 2: Ropa ropa = crearRopa();
				productosActualizada[-1] = ropa;
				break;
		case 3: return productos;
		default: System.out.println("Por favor, seleccione una de las opciones."); crearProducto(productos);
		}
		return productosActualizada;
	}
	
	public Libro crearLibro() {
		System.out.println("Vamos a registrar un nuevo producto en la categoría Libros, por favor, introduce los siguientes campos:");
		int ref = Utilidades.pideDatoNumerico("Nº de Referencia:");
		String titulo = Utilidades.pideDatoString("Título:");
		int isbn = Utilidades.pideDatoNumerico("ISBN:");
		double precio = Utilidades.pideDatoNumericoDouble("Precio:");
		Libro libro = new Libro(ref, precio, isbn, titulo);
		return libro;
	}
	
	public Movil crearMovil() {
		System.out.println("Vamos a registrar un nuevo producto en la categoría Móviles, por favor, introduce los siguientes campos:");
		int ref = Utilidades.pideDatoNumerico("Nº de Referencia:");
		String marca = Utilidades.pideDatoString("Marca:");
		String modelo = Utilidades.pideDatoString("Modelo:");
		double precio = Utilidades.pideDatoNumericoDouble("Precio:");
		Movil movil = new Movil(ref, precio, marca, modelo);
		return movil;
	}
	
	public Ropa crearRopa() {
		System.out.println("Vamos a registrar un nuevo producto en la categoría Ropa, por favor, introduce los siguientes campos:");
		int ref = Utilidades.pideDatoNumerico("Nº de Referencia:");
		String nombre = Utilidades.pideDatoString("Nombre:");
		int talla = Utilidades.pideDatoNumerico("Talla:");
		String color = Utilidades.pideDatoString("Color:");
		double precio = Utilidades.pideDatoNumericoDouble("Precio:");
		Ropa ropa = new Ropa(ref, precio, nombre, talla, color);
		return ropa;
	}
}
