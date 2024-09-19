package com.curso.java.inicio.arrays.ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EjercicioMatricesHundirFlota {

	public static void main(String[] args) {
		/*System.setProperty("file.encoding", "UTF-8");*/

		int [][] mapa = new int [5] [5];
		/*
		mapa[3][0] = 2;
		mapa[1][1] = 1;
		mapa[1][2] = 1;
		mapa[3][3] = 3;
		mapa[0][4] = 2;
		*/
		
		mapa[(int)(Math.random()*5)][(int)(Math.random()*5)] = 1;
		mapa[(int)(Math.random()*5)][(int)(Math.random()*5)] = 1;
		mapa[(int)(Math.random()*5)][(int)(Math.random()*5)] = 2;
		mapa[(int)(Math.random()*5)][(int)(Math.random()*5)] = 2;
		mapa[3][3] = 3;
		
		
		String [] filas = {"A","B","C","D","E"};
		
		int vidas = 10;
		String pulpito = "🐙";
		
		System.out.println("Bienvenido a Hundir la Flota. \nEste es el mapa de juego.\nPara jugar diga primero la letra de la fila, y después el número de columna.");
		System.out.println();
		
		do {
			//MAPA
			System.out.println("  1 2 3 4 5");
			for(int a=0; a<mapa.length; a++) {
				System.out.print(filas[a]+"|");
				for(int b=0; b<mapa[a].length; b++) {
					if(mapa[a][b]==0) {
						System.out.print(" |");					
					}else if(mapa[a][b]==9) {
						System.out.print("O|");	
					}else if(mapa[a][b]==7) {
						System.out.print("X|");	
					}else if(mapa[a][b]==8){
						System.out.print(pulpito+"|");
					}else {
						System.out.print(" |");
					}
				}
				System.out.println();
			}
			
			//Recoge datos
			String fila;
			List<String> filasList = Arrays.asList(filas);
			do {
				System.out.println("Indique fila:");
				Scanner scan = new Scanner(System.in);
				fila = scan.nextLine().toUpperCase();
			}while(!fila.isBlank() && fila.length()>1 &&!filasList.contains(fila));
			
			int numFila = 0;
			switch(fila) {
			case "A": numFila=0;break;
			case "B": numFila=1;break;
			case "C": numFila=2;break;
			case "D": numFila=3;break;
			case "E": numFila=4;break;
			}
			
			int columna;
			do {
				System.out.println("Indique columna:");
				Scanner scan = new Scanner(System.in);
				columna = scan.nextInt()-1;
			}while(columna<0 || columna>4);
			//int columna = Integer.parseInt(""+posicion.charAt(1))-1; --Para convertir en int un caracter de un string, si se recogen fila y columna juntos
			
			
			
			if(mapa[numFila][columna]==0) {
				System.out.println("~~Agua~~");
				mapa[numFila][columna]=9;
				vidas--;
			}else if(mapa[numFila][columna]==1) {
				System.out.println("--Tocado el acorazado--");
				mapa[numFila][columna]=7;
			}else if(mapa[numFila][columna]==2) {
				System.out.println("--Tocado el destructor--");
				mapa[numFila][columna]=7;
			}else if(mapa[numFila][columna]==3){
				System.out.println("--Tocado el submarino--");
				mapa[numFila][columna]=8;
			}else {
				vidas--;
			}
			
			//arreglar, contar aciertos
			if(		mapa[3][0]==7 &&
					mapa[1][1] == 7 &&
					mapa[1][2] == 7 &&
					mapa[3][3] == 7 &&
					mapa[0][4] == 7) {
				System.out.println("¡Felicidades! Has destruido todos los barcos. Has ganado.");
				break;
			}
			
			System.out.println("Te quedan "+vidas+" intentos.");		
		}while(vidas!=0);
		
		if(vidas==0) {
			System.out.println("Ya no te quedan vidas. Has perdido.");		
		}
		
		//MAPA
		System.out.println("  1 2 3 4 5");
		for(int a=0; a<mapa.length; a++) {
			System.out.print(filas[a]+"|");
			for(int b=0; b<mapa[a].length; b++) {
				if(mapa[a][b]==0) {
					System.out.print(" |");					
				}else if(mapa[a][b]==9) {
					System.out.print("O|");	
				}else if(mapa[a][b]==7) {
					System.out.print("x|");	
				}else {
					System.out.print("X|");
				}
			}
			System.out.println();
		}
		
	}

}
/* 
	Ejercicio Matrices Hundir la Flota
==========================================================
+ Definir array bidimensional de enteros de 5x5
+ 1 acorazado(1), 2 destructores(2), 1 submarino(3)
+ 10 oportunidades, si pasadas las diez algún barco sigue en el agua el usuario pierde
+ Indicar la posición que quieres atacar
+ Ej. A-1: Agua, B-2: Tocado el acorazado

*/