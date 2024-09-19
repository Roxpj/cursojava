package com.curso.java.poo.composicion;

public class Universidad {
	
	//COMPOSICIÓN
	private String nombre;
	private String direccion;
	private Cafeteria cafeteria;
	private Departamento[] departamentos;
	
	public Universidad(String nombre, String direccion, Cafeteria cafeteria, Departamento[] departamentos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.cafeteria = cafeteria;
		this.departamentos = departamentos;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cafeteria getCafeteria() {
		return cafeteria;
	}
	public void setCafeteria(Cafeteria cafeteria) {
		this.cafeteria = cafeteria;
	}

	public Departamento[] getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}
	
	

}
