package com.curso.java.inicio.strings.ejercicios;

public class EjercicioQuijote {

	public static void main(String[] args) {

		String textoQuijote = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";

		// 1
		String textoSinEspacios = textoQuijote.trim();
		System.out.println("El tamaño sin espacios del texto es: " + textoSinEspacios.length());

		// 2
		int primerPunto = textoQuijote.indexOf(".") + 2;
		String segundaFrase = textoQuijote.substring(primerPunto);
		System.out.println("La segunda frase del texto es: " + segundaFrase.trim());

		// 3
		System.out.println("¿En el texto aparece la palabra Quijote?: "
				+ (textoQuijote.toLowerCase().contains("quijote") ? "Sí" : "No"));

		// 4
		String comasQuijote = textoQuijote;
		int numeroComas = 0;
		do {
			comasQuijote = comasQuijote.replaceFirst(",", "");
			numeroComas++;
		} while (comasQuijote.contains(","));
		System.out.println("El número de comas en el texto es de: " + numeroComas);

		// 5
		String textoSinPuntuaciones = comasQuijote.replace(".", "").trim().toLowerCase();
		int tamanioPalabra = 0;
		int tamanioPalabraLarga = 0;
		String palabra = "";
		String palabraLarga = "";

		for (int i = 0; i < textoSinPuntuaciones.length(); i++) {

			if (textoSinPuntuaciones.charAt(i) != ' ') {
				tamanioPalabra++;
				palabra += textoSinPuntuaciones.charAt(i);
			} else {
				if (tamanioPalabra > tamanioPalabraLarga) {
					tamanioPalabraLarga = tamanioPalabra;
					palabraLarga = palabra;
				}
				tamanioPalabra = 0;
				palabra = "";
			}
		}
		System.out.println("La palabra más larga en el texto es: " + palabraLarga);

		// 6
		palabra = "";
		String palabraMasRepetida = "";
		String palabraNueva = "";
		int repeticiones = 0;
		int mayorRepeticiones = 0;
		
		for (int i = 0; i < textoSinPuntuaciones.length(); i++) {

			if (textoSinPuntuaciones.charAt(i) != ' ') {
				palabraNueva += textoSinPuntuaciones.charAt(i);
			} else {
				if(palabra.isBlank()) {
					palabra = palabraNueva;
				}
				if(palabraNueva.equals(palabra)) {
					repeticiones++;			
				}
				if (repeticiones > mayorRepeticiones) {
					mayorRepeticiones = repeticiones;
					palabraMasRepetida = palabra;
					palabra = "";
					repeticiones= 0;
					
				}else {
					palabra = "";
					repeticiones = 0;
				}
				palabraNueva="";
			}
		}
		System.out.println("La palabra más repetida es: " + palabraMasRepetida);

	}
}
/*
 * Ejercicio Quijote
 * ==============================================================
 * "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           "
 * 
 * -Tamaño del texto sin los espacios en blanco del principio y del final
 * -Mostrar la segunda frase del quijote -Aparece la palabra Quijote?? -Cuantas
 * comas aparecen en el texto
 * 
 * 
 * Más dificil ==============================================================
 * -Encontrar la palabra más larga: Identifica la palabra más larga en el texto.
 * -Encontrar la palabra que mas se repite en el texto -Invertir las palabras:
 * Invierte cada palabra en el texto manteniendo el orden original de las
 * palabras.
 */