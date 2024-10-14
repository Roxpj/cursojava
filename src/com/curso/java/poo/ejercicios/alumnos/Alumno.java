package com.curso.java.poo.ejercicios.alumnos;

public class Alumno {

	private String dni;
	private String nombre;
	private String apellidos;
	private boolean mayorEdad;
	private int nota;
	static int contador; //variable estática, se comparte entre todas las clases. Debe ser también privada y con sus métodos get y set tambien estáticos
	
	public Alumno() {
	}
	
	public Alumno(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Alumno(String dni, String nombre, String apellidos, int nota) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
	}
	
	public Alumno(String dni, String nombre, String apellidos, int nota, boolean mayorEdad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
		this.mayorEdad = mayorEdad;
	}
	
	public String getDni() {
		return this.dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public int getNota() {
		return this.nota;
	}
	public boolean isMayorEdad() {
		return this.mayorEdad;
	}
	
	public void setDni(String dni) {
		this.dni=dni;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public void setNota(int nota) {
		this.nota=nota;
	}
	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad=mayorEdad;
	}
	
	
	public void verNota() {
		if(this.mayorEdad) {
			int nota = this.getNota();
			switch(nota) {
			case 0: System.out.println("El alumno "+this.nombre+" no ha estudiado nada.");break;
			case 1,2,3,4: System.out.println("El alumno "+this.nombre+" ha estudiado poco.");break;
			case 5,6,7,8,9: System.out.println("El alumno "+this.nombre+" ha estudiado mucho.");break;
			case 10: System.out.println("El alumno "+this.nombre+" es un genio.");break;
			}
		}else {
			System.out.println("Debes ser mayor de edad para ver la nota.");
		}
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", mayorEdad=" + mayorEdad
				+ ", nota=" + nota + "]";
	}
	
}

/* 
Crear la clase Alumno (POJO - bean)
-Atributos de instancia:
	+ dni
	+ nombre
	+ apellidos
    + mayorEdad
	+ nota

-4 constructores
	+ 1 vacio
	+ 1 para inicializar dni, nombre y apellidos
	+ 1 para inicializar dni, nombre, apellidos, nota
	+ 1 para inicializar dni, nombre, apellidos, nota, mayorEdad
	
-Método
	+ verNota()
		//Solo si es mayor de edad
		0 -> el alumno nombre no ha estudiado nada
		<5 ha estudiado poco
		5-9 ha estudiado mucho
		10 	Es un genio
		-En caso contrario indicar que no hay permisos para mostrar la nota
	
========================================
Clase AlumnoMain
main ()
	4 objetos de tipo alumno
		+ 1 usando el const. vacio --> luego dar la informacion
		+ 1 usando (dni, nombre, apellidos)
		+ 1 usando (dni, nombre, apellidos, nota)
		+ 1 usando (dni, nombre, apellidos, nota, mayorEdad)
		
Sencilla:	Llamar de cada objeto al metodo estudiar

Complicada: Meter a todos los alumnos en un array, 
	crear método que reciba un array de alumnos y muestre la información (nombre y apellidos y nota) de todos los que han aprobado 
*/