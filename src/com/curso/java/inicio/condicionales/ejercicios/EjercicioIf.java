package com.curso.java.inicio.condicionales.ejercicios;

public class EjercicioIf {
	
	public static void main(String[] args) {
		
		String asignatura;
		String nombreAlumno;
		int nota;
		String calificacion="";
		
		asignatura = "Matemáticas";
		nombreAlumno = "Pepe";
		nota = 3;
		
		if(nota<0 || nota>10) {
			System.out.println("La nota " + nota + " es incorrecta");
		}else if(nota<5) {
			calificacion = "Suspenso";
		}else if(nota<=6){
			calificacion = "Aprobado";
		}else if(nota<=8) {
			calificacion = "Notable";
		}else if(nota<=10) {
			calificacion = "Sobresaliente";
		}
		
		if(calificacion!= "") {
			System.out.println(nombreAlumno + " ha sacado un " + calificacion + " en " + asignatura);
		}
		
	}
}

/* 
 Crear paquete ejercicios dentro de condicionales
 Crear clase EjercicioIf
 Declarar la variables asignatura de tipo String, nombreAlumno de tipo String y nota de tipo int 
 Inicializar las variables con valores inventados
 El resultado a mostrar sería: El alumno Juan en la asignatura Matemáticas tiene un Notable */