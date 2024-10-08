package com.curso.java.utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

	/**
	 * Recoge un dato numérico entero a través de la consola y lo devuelve.
	 * @param mensaje para el usuario (String).
	 * @return valor int introducido por el usuario.
	 */
	public static int pideDatoNumerico() {
		int entero = pideDatoNumerico(null);
		return entero;
	}	
	
	/**
	 * Pide un dato numérico entero con un mensaje definido por parámetros al usuario a través de la consola y lo devuelve.
	 * @param mensaje para el usuario (String).
	 * @return valor int introducido por el usuario.
	 */
	public static int pideDatoNumerico(String mensaje) {
		if(mensaje!=null) {
			System.out.println(mensaje);			
		}
		Scanner scan = new Scanner(System.in);
		int entero = 0;
		try {
			entero = scan.nextInt();			
		}catch(InputMismatchException ime) {
			System.out.println("⚠️ Debe introducir un dato numérico.");
			pideDatoNumerico(mensaje);
		}
		return entero;
	}
	
	/**
	 * Recoge un dato numérico double a través de la consola y lo devuelve
	 * @return valor double introducido por el usuario.
	 */
	public static double pideDatoNumericoDouble() {
		double decimal = pideDatoNumericoDouble(null);
		return decimal;
	}
	
	/**
	 * Pide un dato numérico double con un mensaje definido por parámetros al usuario a través de la consola y lo devuelve.
	 * @param mensaje para el usuario (String).
	 * @return valor double introducido por el usuario.
	 */
	public static double pideDatoNumericoDouble(String mensaje) {
		if(mensaje!=null) {
			System.out.println(mensaje);			
		}
		Scanner scan = new Scanner(System.in);
		double decimal = 0;
		try {
			decimal = scan.nextInt();			
		}catch(InputMismatchException ime) {
			System.out.println("⚠️ Debe introducir un dato numérico.");
			pideDatoNumericoDouble(mensaje);
		}
		return decimal;
	}
	
	/**
	 * Recoge un dato de tipo String al usuario a través de la consola y lo devuelve.
	 * @return valor String introducido por el usuario.
	 */
	public static String pideDatoString() {
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		return texto;
	}
	
	/**
	 * Pide un dato de tipo String al usuario a través de la consola y lo devuelve.
	 * @param mensaje para el usuario (String).
	 * @return valor String introducido por el usuario.
	 */
	public static String pideDatoString(String mensaje) {
		System.out.println(mensaje);
		String texto = pideDatoString();
		return texto;
	}
	
	/**
	 * Pide una consecución de datos de texto y los almacena en un Array de Strings de la longitud establecida por parámetros.
	 * @param mensaje para el usuario (String).
	 * @param longitud del Array que se desea generar.
	 * @return Array relleno de datos String dados por el usuario de un tamaño definido.
	 */
	public static String[] pideArrayString(String mensaje, int longitud) {
		System.out.println(mensaje);
		String[] texto = new String[longitud];
		for(int i=0; i<longitud; i++) {
			texto[i] = pideDatoString();
		}
		return texto;
	}
	
	/**
	 * Pide una consecución de datos enteros al usuario (empezando desde 1) en base a un array de Strings, y genera un nuevo array de Strings con los seleccionados.
	 * @param mensaje para el usuario (String).
	 * @param longitud del array que se desea generar.
	 * @param array de Strings con las opciones.
	 * @return nuevo array de Strings con las selecciones del usuario.
	 */
	public static String[] pideArrayOpcionesMenu(String mensaje, int longitud, String[] opciones) {
		System.out.println(mensaje);
		int[] elecciones = new int[longitud];
		String[] resultado = new String[longitud];
		for(int i=0; i<longitud; i++) {
			elecciones[i] = pideDatoNumerico();
			resultado[i] = opciones[elecciones[i]-1];
		}
		return resultado;
	}
	
	/**
	 * Pide al usuario elegir entre dos opciones excluyentes y devuelve un booleano.
	 * @param mensaje para el usuario (String).
	 * @return decisión del usuario en formato boolean.
	 */
	public static boolean pideBoolean(String mensaje, String opcionAfirmativa) {
		boolean decision = pideDatoString(mensaje).equalsIgnoreCase(opcionAfirmativa)? true : false;
		return decision;
	}
	
	/**
	 * Pinta un menú con los puntos definidos por parámetros mediante un array de Strings.
	 * @param params
	 */
	public static void pintaMenu(String[] params) {
		for(String param : params) {
			System.out.println(param);
		}
	}
	
	/**
	 * Pinta un menú y le da formato con los puntos definidos por parámetros dados mediante un array de Strings.
	 * Si se aporta un mensaje como String por parámetros, la posición 0 del array es el mensaje de bienvenida, del 1 en adelante muestra los mensajes con índice numérico.
	 * @param params
	 */
	public static void pintaMenuFormato(String[] params) {
		for(int i=0; i<params.length; i++) {
			System.out.println("\t"+(i+1)+". "+params[i]);
		}
	}
	
	public static void pintaMenuFormato(String titulo, String[] params) {
		System.out.println(titulo);
		pintaMenuFormato(params);
	}
	
	/**
	 * Pinta un menú y le da formato con los puntos definidos por parámetros dados mediante un array de Strings y recoge la elección del usuario en formato String.
	 * Si se aporta un mensaje como String por parámetros, la posición 0 del array es el mensaje de bienvenida, del 1 en adelante muestra los mensajes con índice numérico.
	 * @param params
	 */
	public static String pintaMenuFormatoConRespuesta(String[] params) {
		pintaMenuFormato(params);
		int input = pideDatoNumerico();
		String eleccion = params[input-1];
		return eleccion;
	}
	
	public static String pintaMenuFormatoConRespuesta(String titulo, String[] params) {
		System.out.println(titulo);
		String eleccion = pintaMenuFormatoConRespuesta(params);
		return eleccion;
	}
	
	/**
	 * Pinta un menú y le da formato con los puntos definidos por parámetros dados mediante un array de Strings y recoge la elección del usuario en formato Int.
	 * Si se aporta un mensaje como String por parámetros, la posición 0 del array es el mensaje de bienvenida, del 1 en adelante muestra los mensajes con índice numérico.
	 * @param params
	 */
	public static int pintaMenuFormatoConRespuestaInt(String[] params) {
		pintaMenuFormato(params);
		int eleccion = pideDatoNumerico()-1;
		return eleccion;
	}
	
	public static int pintaMenuFormatoConRespuestaInt(String titulo, String[] params) {
		System.out.println(titulo);
		pintaMenuFormato(params);
		int eleccion = pideDatoNumerico()-1;
		return eleccion;
	}
	
	/**
	 * Pinta una matriz bidimensional que almacena números enteros, dada la matriz, y dos arrays de Strings para definir visualmente las filas y columnas.
	 * @param mapa
	 * @param filas
	 * @param columnas
	 */
	public static void pintaMatrizBiInt(int[][]mapa, String[]filas, String[]columnas) {
		for(String i:columnas) {
			System.out.print("  "+i);
		}
		System.out.println();
		for(int a=0; a<mapa.length; a++) {
			System.out.print(filas[a]+"|");
			for(int b=0; b<mapa[a].length; b++) {
					System.out.print("  |");
				}
			System.out.println();
			}
	}
	
	/**
	 * Devuelve un Array de String de la longitud indicada por parámetros relleno de valores de la A a la Z para poder usar como índice alfabético.
	 * @param longitud
	 * @return
	 */
	public static String[] crearIndiceAlfab(int longitud) {
		//TODO añadir excepcion
		String[] abecedario = {
	            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
	            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	        };
		String[] indice = new String[longitud];
		
		for(int i=0; i<longitud; i++) {
			indice[i] = abecedario[i];
		}
		return indice;
	}
	
	/**
	 * Devuelve un Array de enteros de la longitud indicada por parámetros relleno de números en orden ascendente para poder usar como índice numérico.
	 * @param longitud
	 * @return
	 */
	public static int[] crearIndiceNum(int longitud) {
		int[] indice = new int[longitud];
		
		for(int i=0; i<longitud; i++) {
			indice[i] = i+1;
		}
		return indice;
	}

}
