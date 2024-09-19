package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class EjercicioEvaluaciones {

	public static void main(String[] args) {
		//Tomar datos de los alumnos
		Scanner scan = new Scanner(System.in);
		
		String estudiante1 = "";
		double est1Examen1 = 0.0;
		double est1Examen2 = 0.0;
		double est1Proyecto1 = 0.0;
		double est1Proyecto2 = 0.0;
		double est1Participacion = 0.0;
		
		System.out.println("Introduce el nombre del primer alumno:");
		estudiante1 = scan.nextLine();
		scan = new Scanner(System.in);// no es buena practica pero de momento lo hacemos para evitar problemas
		System.out.println("Nota del primer examen de " + estudiante1 + ":");
		est1Examen1 = scan.nextInt();
		scan = new Scanner(System.in);
		System.out.println("Nota del segundo examen de " + estudiante1 + ":");
		est1Examen2 = scan.nextInt();
		scan = new Scanner(System.in);
		System.out.println("Nota del primer proyecto de " + estudiante1 + ":");
		est1Proyecto1 = scan.nextInt();
		scan = new Scanner(System.in);
		System.out.println("Nota del segundo proyecto de " + estudiante1 + ":");
		est1Proyecto2 = scan.nextInt();
		scan = new Scanner(System.in);
		System.out.println("Nota de la participacion de " + estudiante1 + ":");
		est1Participacion = scan.nextInt();

		/*String estudiante2 = "";
		int est2Examen1 = 0;
		int est2Examen2 = 0;
		int est2Proyecto1 = 0;
		int est2Proyecto2 = 0;
		int est2Participacion = 0;
		
		System.out.println("Introduce el nombre del segundo alumno:");
		estudiante2 = scan.nextLine();
		System.out.println("Nota del primer examen de " + estudiante2 + ":");
		est2Examen1 = scan.nextInt();
		System.out.println("Nota del segundo examen de " + estudiante2 + ":");
		est2Examen2 = scan.nextInt();
		System.out.println("Nota del primer proyecto de " + estudiante2 + ":");
		est2Proyecto1 = scan.nextInt();
		System.out.println("Nota del segundo proyecto de " + estudiante2 + ":");
		est2Proyecto2 = scan.nextInt();
		System.out.println("Nota de la participacion de " + estudiante2 + ":");
		est2Participacion = scan.nextInt();


		String estudiante3 = "";
		int est3Examen1 = 0;
		int est3Examen2 = 0;
		int est3Proyecto1 = 0;
		int est3Proyecto2 = 0;
		int est3Participacion = 0;
		
		System.out.println("Introduce el nombre del primer alumno:");
		estudiante3 = scan.nextLine();
		System.out.println("Nota del primer examen de " + estudiante3 + ":");
		est3Examen1 = scan.nextInt();
		System.out.println("Nota del segundo examen de " + estudiante3 + ":");
		est3Examen2 = scan.nextInt();
		System.out.println("Nota del primer proyecto de " + estudiante3 + ":");
		est3Proyecto1 = scan.nextInt();
		System.out.println("Nota del segundo proyecto de " + estudiante3 + ":");
		est3Proyecto2 = scan.nextInt();
		System.out.println("Nota de la participacion de " + estudiante3 + ":");
		est3Participacion = scan.nextInt();*/

		
		//Ver solución profe para versión mas resumida
		//Calcular nota
		double notaEstudiante1 = 0.0;
		notaEstudiante1 += (est1Examen1*25)/100;
		notaEstudiante1 += (est1Examen2*25)/100;
		notaEstudiante1 += (est1Proyecto1*20)/100;
		notaEstudiante1 += (est1Proyecto2*20)/100;
		notaEstudiante1 += (est1Participacion*10)/100;
		
		if(((est1Proyecto1 + est1Proyecto2)/2)>90 && est1Participacion>70) {
			notaEstudiante1 += (notaEstudiante1*5)/100;
			System.out.println("Bonificación por trabajo duro: 5%");
		}else if(est1Participacion<30) {
			notaEstudiante1 -= (notaEstudiante1*10)/100;
			System.out.println("Penalización por poca participación: 10%");
		}
		
		if(est1Examen1 == est1Examen2 && est1Examen2 == est1Proyecto1 && est1Proyecto1 == est1Proyecto2 && est1Proyecto2 == est1Participacion ) {
			notaEstudiante1 += 500;
			System.out.println("¡¡Bonificación super especial 500 puntos!!");
		}
		
		if(((est1Examen1 + est1Examen2)/2)<50) {
			System.out.println( estudiante1 + " falla por no llegar a la nota media mínima en los exámenes. Su nota final es: " + notaEstudiante1);
		}else if(notaEstudiante1>50){
			System.out.println("La nota final de " + estudiante1 + " es: " + notaEstudiante1 + ". " + estudiante1 + " pasa el curso.");
		}else {
			System.out.println("La nota final de " + estudiante1 + " es: " + notaEstudiante1 + ". " + estudiante1 + " falla el curso.");

		}



	}
	
}

/* 
Imagina que estás diseñando un sistema de evaluación para un curso. 
El sistema debe determinar la calificación final de un estudiante basándose en diferentes criterios. 
Cada estudiante recibe tres tipos de calificaciones:

+Exámenes: hay dos exámenes, cada uno con un peso del 25% de la nota final.
+Proyectos: hay dos proyectos, cada uno con un peso del 20% de la nota final.
+Participación: la participación en clase tiene un peso del 10% de la nota final.

Además, hay ciertos criterios adicionales que pueden afectar la nota final:

Si la nota media de los exámenes es inferior a 50, el estudiante falla automáticamente.
Si la nota media de los proyectos es superior a 90 y la participación es mayor a 70, se añade un 5% a la nota final.
Si la participación es inferior a 30, se resta un 10% de la nota final.
Tarea:

Escribe un programa en Java que:

Solicite las calificaciones de los exámenes, los proyectos y la participación de tres estudiantes.
Calcule la nota final basada en los pesos indicados.
Aplique las reglas adicionales para modificar la nota final.
Determine si el estudiante pasa o falla el curso basado en la nota final ajustada.
Imprima la nota final y el estado (pasa/falla) del estudiante. */