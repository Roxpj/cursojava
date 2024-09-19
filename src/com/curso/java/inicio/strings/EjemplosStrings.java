package com.curso.java.inicio.strings;

public class EjemplosStrings {

	public static void main(String[] args) {

		// COMPARACIÓN SIEMPRE CON MÉTODO EQUALS()
		String s1 = "hola";
		String s2 = "hola";
		String s3 = new String("hola"); // no es la manera recomendable, de la otra manera ahorramos memoria

		System.out.println(s1 == s2); // TRUE --------- s1 y s2 son el mismo objeto, cuando se crea s2 no se duplica ya que tienen el mismo valor
		
		System.out.println(s1 == s3); // FALSE -------- s3 sí que es un objeto distinto, al usar el método new String, le forzamos a que genere un objeto nuevo
		
		System.out.println(s1.equals(s3)); // TRUE -- Con equals comparamos los valores, con == comparamos si es el mismo objeto
		

		// INMUTABILIDAD 0123456789123 <--posiciones del String, empieza desde 0
		String nombre = " JoseTLuis  T";
		String nombreMays = nombre.toUpperCase(); // Modificamos el string, pero en realidad creamos un objeto nuevo, y en este caso lo guardamos en una variable nueva,
		// nombre = nombre.toUpperCase(); ----------- si no se va a volver a utilizar el anterior, podemos guardarlo en la variable original, y el valor original se desechará

		
		// FUNCIONES
		/// toUpperCase() toLowerCase() -- Creamos una copia del objeto pasando todos los caracteres a mayúsculas o a minúsculas

		/// contains("") -- devuelve un booleano
		System.out.println(nombre.contains("Jo")); // TRUE --- Verifica si el string contiene ciertos caracteres, es case sensitive

		/// endsWith("") -- devuelve un booleano
		String nombreFichero = "fichero.jpg";
		System.out.println(nombreFichero.endsWith(".jpg")); // TRUE --- Verifica si el string termina con ciertos caracteres, es case sensitive

		/// indexOf("") -- devuelve la primera posición en la que se encuentra un caracter
		System.out.println(nombre.indexOf("T")); // 5 --- en el caso de que haya mas de una instancia del caracter, devolverá la posicion del primero, si queremos la última, usar lastIndexOf
		System.out.println(nombre.indexOf("Z")); // -1 --- si no lo encuentra en el String, nos muestra -1

		/// lastIndexOf("") -- devuelve la última posición en la que se encuentra un caracter
		System.out.println(nombre.lastIndexOf("T")); // 12
		
		/// length() -- devuelve el número total de caracteres del String
		System.out.println(nombre.length()); // 13
		
		/// charAt() -- devuelve el caracter en la posición que le indiquemos
		System.out.println(nombre.charAt(nombre.length()-1)); // "T" --- de esta manera sacaríamos el caracter en la última posición del String
		
		/// isBlank() -- devuelven un booleano
		/// isEmty()  --
		String texto = "     ";
		System.out.println(texto.isBlank()); // TRUE --- Verifica si el String está en blanco, puede tener espacios
		System.out.println(texto.isEmpty()); // FALSE -- Verifica si no tiene ningún caracter, incluidos espacios en blanco
		
		/// trim() -- recorta los espacios en blanco al principio y al final del String 
		System.out.println("  hola   ".trim()); // "hola" 
		System.out.println(texto.trim().length()); // 0 --- en este caso como todo son espacios, nos deja el String vacío
		
		/// replace() -- reemplaza las instancias de un caracter por otro designemos
		System.out.println("  ho la   ".replace(" ", "")); // "hola"
		
		/// substring() --- genera una subcadena a partir de la que le estamos, podemos designar las posiciones
		System.out.println(nombreFichero.substring(2)); // "chero.jpg" --- podemos indicarle la posición inicial y cogerá de ahí hasta el final
		System.out.println(nombreFichero.substring(2,5)); // "che" ------- o podemos indicar la posición de inicio y final de la nueva subcadena
		
		
		
	}

}
