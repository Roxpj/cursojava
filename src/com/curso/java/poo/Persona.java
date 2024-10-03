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
	
	//Los 4 pilares de OOP----
	/// Herencia - Las clases hijas heredan las propiedades (atributos y métodos) de su clase padre.
		//Es única o simple, sólo pueden heredar de una clase padre. Todas vienen de Object por defecto, de donde sacan toString(), y el constructor vacío por defecto.
		//Si el padre tiene un constructor, los hijos tienen que tener un constructor que llame al de la clase padre(Object-Animal-Vaca) con super() en la primera línea del constructor.
		//Una clase hija hereda todos los atributos y métodos no privados de la clase padre.
		//public class Vaca extends Animal{
		//Sobreescribir - modificar el comportamiento de un método del padre en la clase hija.
		//-@Override anotación que funciona en tiempo de compilación, comprueba que se sobreescribe correctamente un método.
		//Sólo se puede acceder a los métodos de la clase de la variable con la que accedemos al objeto.
		//Hacer cast o casting, es convertir un objeto de clase hija en objeto de clase padre. Así ya accedemos a los métodos propios de su clase. No puedes convertir algo superior en algo inferior.
		//Si una clase es abstracta no se pueden generar objetos de ese tipo. Un método abstracto no tiene funcionalidad y obliga a que su clase sea abstracta. (public abstract void blabla();)
		//Puede haber padre e hija abstractos, los métodos abstractos se tendrán que definir obligatoriamente en las clases nietas que no sean abstractas.
		//Para limitar la herencia ponemos 'final' en la declaración de la clase que no pueda tener clases hijas. ( public final class blabla extends blibli{ )
	
	
	/// Encapsulación - 
	/// Abstracción - 
	/// Polimorfismo - 
	
	
	// USO DE PARÁMETROS PARA APLICACIÓN
//	if(args.length==3) {
//		String nombre = args[0];
//		String apellidos = args[1];
//		System.out.println(nombre);
//		System.out.println(apellidos);
//		System.out.println(args[2]);
//	}else {
//		System.out.println("Debes mandarme 3 parámetros <nombre apellidos texto>");
//		System.exit(1); // Sale de la aplicación
//	}
	
}
