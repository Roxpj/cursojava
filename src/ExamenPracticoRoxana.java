import com.curso.java.utils.Utilidades;

public class ExamenPracticoRoxana {

	public static void main(String[] args) {
		
		System.out.print("Bienvenido. ");
		String [] menu = {
				"¿Qué desea hacer?",
				"\t1. Contar letras de una palabra.",
				"\t2. ¿Es vocal la inicial de una palabra?",
				"\t3. Contar las palabras de una frase.",
				"\t4. Reordenar las palabras de una frase.",
				"\t5. ¿Es palíndromo esta palabra o frase?",
				"\t6. Salir.",
		};
		
		int seleccion=0;
		do {
			Utilidades.pintaMenu(menu);
			seleccion = Utilidades.pideDatoNumerico("Introduzca el número de su selección:");
			
			switch(seleccion) {
			case 1: contarLetras();break;
			case 2: esInicialVocal();break;
			case 3: contarPalabras();break;
			case 4: reordenarFrase();break;
			case 5: esPalindromo();break;
			}
		}while(seleccion!=6);
		
		System.out.println("Adios.");
	}

	//1. Introduzca una palabra y luego muestre cuántas letras tiene esa palabra (sin contar espacios).
	static void contarLetras() {
		String palabra = Utilidades.pideDatoString("Introduzca una palabra:");
		System.out.println("La palabra tiene " + palabra.length() + " letras.");
	}
	
	//2. Verifique si la primera letra es una vocal. Muestra un mensaje indicando si es o no una vocal.
	static void esInicialVocal() {
		String palabra = Utilidades.pideDatoString("Introduzca una palabra:").toLowerCase();
		String[] vocales = {"a", "e", "i", "o", "u"};
		boolean esPar = false;
		for (String vocal : vocales) {
			if(palabra.indexOf(vocal)==0) {
				esPar = true;
			}
		}
		System.out.println(esPar?"La inicial es una vocal." : "La inicial no es una vocal.");
	}
	
	
	//3. Pide al usuario una frase y cuente cuántas palabras hay en esa frase. 
	static void contarPalabras() {
		String frase = Utilidades.pideDatoString("Introduzca una frase:").trim();
		System.out.println("La frase tiene "+(frase.split(" ").length)+" palabras.");
		
		/*
		int palabras = 1;
		do {
			frase=frase.replaceFirst(" ", "");
			palabras++;
			
		}while(frase.contains(" "));
		System.out.println("La frase tiene "+palabras+" palabras.");*/
	}
	
	//4. Pide al usuario una frase y luego muestre la misma frase con las palabras en orden inverso.
	static void reordenarFrase() {
		String frase = Utilidades.pideDatoString("Introduzca una frase:").trim();
		String nuevaFrase = "";
		String[] palabras = frase.split(" ");
		for(String palabra : palabras) {
			nuevaFrase = palabra+" "+nuevaFrase;
		}
		System.out.println(nuevaFrase);
	}
	
	//5. Pide al usuario una palabra o frase y determine si es un palíndromo.
	static void esPalindromo() {
		String frase = Utilidades.pideDatoString("Introduzca una palabra o frase:").trim();
		frase=frase.replace(" ", "");
		String nuevaFrase = "";
		for(int i=0; i<frase.length(); i++) {
			nuevaFrase = frase.charAt(i) + nuevaFrase;
		}
		System.out.println(frase.equalsIgnoreCase(nuevaFrase)? "Es un palíndromo.":"No es un palíndromo.");
	}
	
}
