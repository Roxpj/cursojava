package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioRuleta {
	
	public static void main(String[] args) {
		
		int menu = 0;
		int saldo = 500;
		int num = 0;
		
		do {
			System.out.println("Bienvenido a la Ruleta. ¿En qué modo quieres jugar?");
			System.out.println("\t1.Apostar a número.");
			System.out.println("\t2.Apostar a par o impar.");
			System.out.println("\t3.Apostar a bloque.");
			System.out.println("\t4.Salir.");
			Scanner scan = new Scanner(System.in);
		    menu = scan.nextInt();
			
			
			switch(menu) {
			case 1: 
				System.out.println("¿A qué número quieres apostar? (1-36)");
				scan = new Scanner(System.in);
				num = scan.nextInt();
				
				break;
			case 2:
				System.out.println("¿Quieres apostar por pares, o impares?");
				scan = new Scanner(System.in);
				num = scan.nextInt();
				
				break;
			case 3:
				System.out.println("¿A qué bloque quieres apostar?");
				scan = new Scanner(System.in);
				num = scan.nextInt();
				
				break;
			}
			
			System.out.println("¿Desea seguir jugando?");
			scan = new Scanner(System.in);
			String respuesta = scan.nextLine();
			if(respuesta.equalsIgnoreCase("no")) {
				menu = 4;
			}
		}while(menu!=4 && saldo!=0);
		
		if(saldo!=0) {
		System.out.println("Gracias por jugar. Te vas con un saldo de " + saldo + "€.");
		}else {
			System.out.println("No tienes más saldo. Gracias por jugar, esperamos verte pronto.");
		}
	}

}
