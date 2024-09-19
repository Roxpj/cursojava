package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioWhilePintarMenu {

	public static void main(String[] args) {
	
		int opcion = 0;
		String emailAlumno = "";
		String nombreAlumno = "";
		
		do {
			System.out.println("Bienvenido");
			System.out.println("\t1. Pintar cuadrado");
			System.out.println("\t2. Validar email");
			System.out.println("\t3. Crear alumno");
			System.out.println("\t4. Salir");
			System.out.println("\nSelecciona una opción");
			
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			
			if(opcion==1) {
				System.out.println("Vamos a pintar un cuadrado. ¿De qué tamaño quieres que sea su lado?");
				int lado = scan.nextInt();
				String horizontal = "";
				int vertical = lado;
				
				while(lado>0) {
					horizontal+= "*  ";
					lado--;
				}		

				while(vertical>0) {
					System.out.println(horizontal);
					vertical--;
				}
				
			}else if(opcion==2) {
				System.out.println("Introduzca su email:");
				scan = new Scanner(System.in);
				String verificacionEmail = scan.nextLine();
				
				if(verificacionEmail.equalsIgnoreCase(emailAlumno)) {
					System.out.println("Su email es correcto");
				}else {
					System.out.println("El email introducido no es correcto");
				}
				
			}else if(opcion==3) {
				System.out.println("Vamos a crear su usuario de alumno. Introduzca su nombre:");
				scan = new Scanner(System.in);
				nombreAlumno = scan.nextLine();
				System.out.println("Introduzca su correo electrónico:");
				scan = new Scanner(System.in);
				emailAlumno = scan.nextLine();
				System.out.println("Usuario creado");
			}
			
		}while(opcion!=4);
		System.out.println("Adiós");
		
	}

}
/*
Ejercicio pintar menu
================================================================

1. Pintar cuadrado
2. Validar email
3. Crear alumno
4. Salir

Selecciona una opción

Si se pulsa la opcion 1,2 o 3 que nos indique la opción seleccionada, y que vuelva a pintar el menú
Si se selecciona la opcion 4, me dice Adios! y no se vuelve a mostrar el menú
*/