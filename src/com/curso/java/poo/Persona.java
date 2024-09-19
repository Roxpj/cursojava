package com.curso.java.poo;

//POJO: Plain Old Java Object
public class Persona {
	
	//PROGRAMACIÓN ORIENTADA A OBJETOS (OOP)
	
	///Variables de instancia o atributos. Siempre privadas. //*variables estáticas en clase Alumno//
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	
	///Constructor -  si en la clase existe algun constructor, desaparece el constructor por defecto. Inicializa las variables de instancia de la clase.
	///se realiza con la misma estructura que un metodo, y el mismo nombre que la clase. Se puede sobrecargar los constructores. Se puede crear el constructor vacío(igual que el por defecto).
	///si se crea un constructor vacío, perdemos encapsulación al tener que crear getters y setters.
	
	/*public Persona(String nombre, String apellidos, int edad, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}*/
	
	
	///Métodos getter y setter (get y set)
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	///Métodos (acciones) - no son static
	public void correr() {
		System.out.print("La persona "+nombre+" está corriendo");
		if(edad<20) {
			System.out.println(" muy rápido.");
		}else if(edad<40) {
			System.out.println(" rápido.");
		}else {
			System.out.println(" lento.");
		}
	}
	
	public void comer() {
		System.out.println("La persona "+nombre+" está comiendo.");
	}
	
	//Los 4 pilares de OOP
	/// Herencia - Las clases hijas heredan las propiedades (atributos y métodos) de su clase padre.
	/// Encapsulación - 
	/// Abstracción - 
	/// Polimorfismo - 
	
	
}
