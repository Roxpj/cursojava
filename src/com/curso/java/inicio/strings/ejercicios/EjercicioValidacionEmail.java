package com.curso.java.inicio.strings.ejercicios;

import java.util.Scanner;

public class EjercicioValidacionEmail {

	public static void main(String[] args) {

		String email = "";
		boolean isEmailValid = false;

		String mensajeError = "El correo introducido";
		int errors = 0;

		do {

			int posicionArroba = 0;
			String posteriorArroba = "";
			String anteriorArroba = "";

			System.out.println("Introduzca su email:");
			Scanner scan = new Scanner(System.in);
			email = scan.nextLine();

			if (email.isBlank()) {
				errors++;
				mensajeError += " no puede estar en blanco";
			} else {
				// 1----------------------------------------------
				String emailArrobas = email;
				int arrobas = 0;
				do {
					emailArrobas = emailArrobas.replaceFirst("@", "");
					arrobas++;
				} while (emailArrobas.contains("@"));
				
				if (arrobas > 1) {
					errors++;
					mensajeError += " solo debe contener una @";
				}
				
				// 2----------------------------------------------
				if (email.trim().contains(" ")) {
					errors++;
					if (errors > 1) {
						mensajeError += " ,";
					}
					mensajeError += " no debe contener espacios en blanco";
				}
				
				// 3----------------------------------------------
				
				if (email.contains("@") && posteriorArroba.contains(".") && !anteriorArroba.contains(".")
						&& arrobas < 2) {
					posicionArroba = email.indexOf("@");
					posteriorArroba = email.substring(posicionArroba);
					anteriorArroba = email.substring(0, posicionArroba);
					
					// 4----------------------------------------------
					int posicionPunto = email.indexOf(".");
					String entreArrobaPunto = posteriorArroba.substring(posicionArroba, posicionPunto);
					
					if (entreArrobaPunto.length() < 2) {
						errors++;
						if (errors > 1) {
							mensajeError += " ,";
						}
						mensajeError += " debe haber más de 2 caracteres entre la @ y el punto";
					}
					// 5----------------------------------------------
					int posicionPuntoFinal = posteriorArroba.lastIndexOf(".");
					String finalEmail = email.substring(posicionPuntoFinal);
					
					if (finalEmail.length() < 2 || finalEmail.length() > 5) {
						errors++;
						if (errors > 1) {
							mensajeError += " ,";
						}
						mensajeError += " debe tener entre 2 y 5 caracteres después del último punto";
					}
					
				}else if (!email.contains("@")) {
					errors++;
					if (errors > 1) {
						mensajeError += " ,";
					}
					mensajeError += " debe contener una @";
				}else if (!posteriorArroba.contains(".")) {
					errors++;
					if (errors > 1) {
						mensajeError += " ,";
					}
					mensajeError += " debe contener al menos un punto después de la @";
				}else if (anteriorArroba.contains(".")) {
					errors++;
					if (errors > 1) {
						mensajeError += " ,";
					}
					mensajeError += " no puede tener . antes de la @";
				}				
			}
			if (errors == 0) {
				isEmailValid = true;
			} else {
				System.out.println(mensajeError + ".");
				mensajeError = "El correo introducido";
			}
		} while (!isEmailValid);

		System.out.println("Su email " + email + " es valido.");

	}

}
/*
 * Validar email ==============================================================
 * Itroduce tu email (a partir de un email proporcionado). Vamos a validar si el
 * email es correcto o no. Para ello vamos a pasar las siguientes validaciones
 * asdasd@as.dasd.easdasdasdsad
 * 
 * 1. El email solo contiene una @ 2. El email no puede contener espacios en
 * blanco 3. Despues de la @ debe de haber al menos un punto 4. Entre la @ y el
 * primer punto que esté depués tiene que haber una separación de 2 caracteres
 * 5. Después del último punto tiene que haber entre 2 y 5 caracteres
 * 
 * Si no cumple validación se indica por qué
 * 
 * Más complicado =========================== Si el email es incorrecto
 * preguntarle al usuario por un nuevo email hasta que sea correcto
 * 
 */