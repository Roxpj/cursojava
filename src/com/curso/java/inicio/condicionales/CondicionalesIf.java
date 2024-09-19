package com.curso.java.inicio.condicionales;

public class CondicionalesIf {

		public static void main(String[] args) {
			
			int numero = 6;
			
			System.out.println("EMPIEZA");
			
			if(numero>10) {
				System.out.println("El número es mayor de 10");
				
			}else if(numero>=0 && numero<5) {	 // && es y
				System.out.println("El número está entre 0 y 5");
				
			}else if(numero>=5) {				 //si entra en una condicional, ya no se ejecutan las demás
				System.out.println("El número está entre 5 y 10");
				
			}else {								//el else siempre el último
				System.out.println("El número es menor de 10");
			}
			
			
			if(numero != 10) {					// ! está negando lo que tiene a continuación
				System.out.println("El número es 10");
			}
			
			System.out.println("FIN");
		}
}
