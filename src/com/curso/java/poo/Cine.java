package com.curso.java.poo;

public class Cine {

	public static void main(String[] args) {

		//INSTANCIAR UN OBJETO
		
		///-Constructor por defecto. Las variables de instancia se inicializan solas.
		Persona persona1 = new Persona();
		
		///Dar valor a los atributos. Ya que el constructor por defecto inicializa las variables con null/0;
		
		persona1.setNombre("Eva");
		persona1.setApellidos("García");
		persona1.setEdad(24);
		
		///-Constructor personalizado. Crea ya el objeto con los valores que asignamos.
		//Persona persona1 = new Persona("Eva", "García", 28, "A1");
		
		
		///Usamos uno de sus métodos llamando al objeto.método();
		persona1.correr();
		persona1.comer();
		///Diferencias en el resultado de los métodos según los atributos.
		Persona persona2 = new Persona();
		persona2.setNombre("Luz");
		persona2.setEdad(41);
		
		Persona persona3 = new Persona();
		persona3.setNombre("Elvis");
		persona3.setEdad(18);
		
		persona1.correr(); //"La persona Eva está corriendo rápido."
		persona2.correr(); //"La persona Luz está corriendo lento."
		persona3.correr(); //"La persona Elvis está corriendo muy rápido."
		
		///¡Cuidado! Al crearlo de esta manera NO estamos creando un objeto nuevo (no usamos new), por lo que al cambiar el nombre de persona4 tambien cambiamos el de persona3
		/// son dos variables apuntando al mismo objeto.
		Persona persona4 = persona3;
		persona4.setNombre("Carlos");
		System.out.println(persona3.getNombre()); //"Carlos"
	}

}
