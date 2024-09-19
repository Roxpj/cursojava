package com.curso.java.inicio.arrays.ejercicios;
import java.util.Scanner;

public class EjercicioArrays2 {

	public static void main(String[] args) {
		
		System.out.println("¿Cuántos alumnos vas a registrar?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String [] alumnos = new String[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("Introduce el nombre del alumno nº" + i);
			scan = new Scanner(System.in);
			alumnos[i] = scan.nextLine();
		}
		
		System.out.println("Hay " +alumnos.length+ " alumnos registrados:");
		for(int i=0; i<num; i++) {
			System.out.println("\t- "+alumnos[i]);
		}
		
		System.out.println("Alumnos que contienen la letra 'a':");
		int strike = 0;
		for(int i=0; i<num; i++) {
			if(alumnos[i].toLowerCase().contains("a")) {
				System.out.println("\t- "+alumnos[i]);
			}else {
				strike++;
			}
		}
		if(strike==alumnos.length) {
			System.out.println("-No hay alumnos con la letra 'a'.");
		}
		
	}

}
/*
	EjercicioArrays2
==========================================================
Definir un array de nombres de alumnos de longitud (se pregunta). Mostrar solo aquellos alumnos que contengan una a en el nombre
Longitud de un array se puede sabe con length

*/