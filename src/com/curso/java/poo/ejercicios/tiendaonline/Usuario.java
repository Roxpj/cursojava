package com.curso.java.poo.ejercicios.tiendaonline;

public class Usuario {
	
	private String nombre;
	private String codigoUsuario;
	private String contraseña;
	
	public Usuario(String nombre, String codigoUsuario, String contraseña) {
		super();
		this.nombre = nombre;
		this.codigoUsuario = codigoUsuario;
		this.contraseña = contraseña;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
