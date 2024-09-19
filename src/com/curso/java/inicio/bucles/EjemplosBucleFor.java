package com.curso.java.inicio.bucles;

public class EjemplosBucleFor {

	public static void main(String[] args) {
		
		
	//ESTRUCTURA BÁSICA
		/*for( ; ; ) {
			
		  }*/
		
	//for(Declaracion e inicialización de variables de control; Condicion para que siga ejecutándose el bucle (dará true/false); Modificación de las variables para que en algún momento deje de cumplirse la condición)
		//{ acciones a repetir en el bucle }
		
		System.out.println("EMPIEZA");
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println("Hola " + i);
		}
		
		System.out.println("FIN");
		
		
		//Bucle para tabla de multiplicar del 3
		for (int i=0; i<=10; i++) {
			System.out.println("3x"+ i + ": " + 3*i);
		}
		
	//CONTINUE y BREAK
		//Ninguna de las declaraciones de los paréntesis es obligatoria, se puede crear un bucle asi:
		int i=0;
		for (  ;  ;  ) {
			
			System.out.println(i);
			if (i%2==0) {  //Si el número es par
				i+=3;
				continue; //No rompe el bucle, pero salta la siguiente iteración sin ejecutar las siguientes líneas
			}
			if (i<4) {
				break;  //Rompe el bucle for, si entra no se ejecuta lo que haya después, equivaldría a la declaración del medio
			}
			System.out.println("EJECUTA");
			i++;
		}
		System.out.println("FIN");
		
		
	}

}
