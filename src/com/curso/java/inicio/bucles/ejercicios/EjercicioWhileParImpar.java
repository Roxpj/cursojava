package com.curso.java.inicio.bucles.ejercicios;

public class EjercicioWhileParImpar {

	public static void main(String[] args) {
		
		int par = 0;
		int impar = 101;
		
		
		while(par<100 && impar>1) {
			par += 2;
			impar -=2;
			
			System.out.println(par + ", " + impar);		
		}
	}

}
/*
EjercicioForParImpar
============================================================
Mostra los numero pares del 2 al 100 y los impares del 99 al 1
2,99
4,97
6,95
....
98,1
*/