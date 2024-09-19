package com.curso.java.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioWhilePintarCuadrado {

	public static void main(String[] args) {
		
		
		System.out.println("Vamos a pintar un cuadrado. ¿De qué tamaño quieres que sea su lado?");
		Scanner scan = new Scanner(System.in);
		int lado = scan.nextInt();
		String horizontal = "";
		int vertical = lado;
		String horizontalHueca = "";
		int loop1 = lado;
		
		//Cuadrado sólido
		/*while(lado>0) {
			horizontal+= "*  ";
			lado--;
		}

		while(vertical>0) {
			System.out.println(horizontal);
			vertical--;
		}
		*/
		
		//Cuadrado hueco
		while(lado>0) {
			while(loop1>0) {
				horizontal+= "*  ";
				loop1--;
			}
			horizontalHueca+= "*  ";
			lado--;
			while(lado>1) {
				horizontalHueca+= "   ";
				lado--;
			}
			horizontalHueca+= "*";
			lado--;
			
		}
		while(vertical>0) {
			System.out.println(horizontal);
			vertical--;
			while(vertical>1) {
				System.out.println(horizontalHueca);
				vertical--;
			}
		}
		
		//profe
		
		System.out.println("Vamos a pintar un cuadrado. ¿De qué tamaño quieres que sea su lado?");
		scan = new Scanner(System.in);
		int tamanio = scan.nextInt();
		
		int fila = 0;
		while(tamanio>fila) {
			int columna = 0;
			while (tamanio>columna) {
				if (fila==0 || fila==(tamanio-1) || columna==0 || columna==(tamanio-1)) {
					System.out.println("*  ");
				}else {
					System.out.println("   ");
				}
				columna++;
			}
			fila++;
			System.out.println();
		}
	}

}

/*
Ejercicio pintar cuadrado
===============================================================
Pedir el tamaño de un lado de un cuadrado: 

*  *  *  *
*  *  *  *
*  *  *  *
*  *  *  *


*  *  *  *
*        *
*        *
*  *  *  *

*/