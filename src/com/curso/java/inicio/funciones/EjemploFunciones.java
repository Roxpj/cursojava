package com.curso.java.inicio.funciones;

public class EjemploFunciones {

	public static void main(String[] args) {
		
		//Bloque de código que vamos a reutilizar en la aplicación
		
		//SINTAXIS
		///1. Modificador de acceso: indica la visibilidad de ese método.Ejemplos (de mas abierto a más restrictivo):
		//// -public --Se puede acceder desde cualquier paquete
		//// -protected --Pueden acceder a él métodos de clases hijas o que están en clases dentro del mismo paquete
		//// -(package) no es necesario escribir nada --Acceden métodos que están en clases dentro del mismo paquete
		//// -private --Solo se puede acceder desde la misma clase donde está definida
		
		///2. [static]
		
		///3. Tipo de dato que devuelve:
		//// -void --No devuelve nada
		//// -tipo de dato que devuelve el método (int, String, etc.)
		////		La última línea que se ejecuta es palabra reservada return y una variable del tipo de dato indicado, es obligatoria.
		
		///4. Nombre del método. en notación camelCase.
		
		///5. ([Parámetros]) que pasamos a la función.
		
		metodo0();
		metodo1();
		metodo2();
		metodo3();
	}	
	
	//SOBRECARGAR un método. El nombre es igual pero tienen distinto tipo o número de parámetros
	public static boolean esPar(int numero) {
		boolean esPar = numero%2==0;
		return esPar;
	}
	public static boolean esPar() {
		int numero = (int)Math.random()*100;
		boolean esPar =  numero%2==0;
		return esPar;
	}
	public static boolean esPar(String numeroStr) {
		int numero = Integer.parseInt(numeroStr);
		boolean esPar =  numero%2==0;
		return esPar;
	}
	public static boolean esPar(int numero, String nombre) {
		boolean esPar = true;
		return esPar;
	}
	//---------------------------------------------
	
//VARARGS -- tienen que estar al final, permite pasar un número indeterminado de parámetros de un mismo tipo.
	public static int operacionNumerosIndefinidos(int... numeros) {
		int resultado=0;
			for(int numero : numeros) {
				resultado+=numero;break;
			}
		return resultado;
	}
	//---------------------------------------------
	
  //  1		 2	   3	  4	  5
	public static void metodo0() {
		System.out.println("hola método 0");
	}
	
	protected static void metodo1() {
		System.out.println("hola mundo");
	}
	
	static void metodo2() {
		System.out.println("hola método 2");
	}
	
	private static void metodo3() {
		System.out.println("hola método 3");
	}
}
