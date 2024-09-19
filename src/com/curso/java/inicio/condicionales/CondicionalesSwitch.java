package com.curso.java.inicio.condicionales;

public class CondicionalesSwitch {

	public static void main(String[] args) {

		//Permite controlar/evaluar el valor de una sola variable
		
		int nota = 7;
		
		//versiones anteriores a la 11 aprox.
		switch(nota) {
		case 1:
		case 2: 
		case 3:
		case 4: System.out.println("Suspenso");break; //sigue ejecutando hasta que encuentra un break,si no, si un caso es cierto entrará automáticamente en los siguientes aunque sean falsos
		case 5: 
		case 6: System.out.println("Aprobado");break;
		case 7: 
		case 8: System.out.println("Notable");break;
		case 9: 
		case 10: System.out.println("Sobresaliente");break;
		default: System.out.println("Nota incorrecta"); //el default se comporta como un else
		}
		
		//versión comprimida 
		switch(nota) {
		case 1,2,3,4: System.out.println("Suspenso");break;
		case 5,6: System.out.println("Aprobado");break;
		case 7,8: System.out.println("Notable");break;
		case 9,10: System.out.println("Sobresaliente");break;
		default: System.out.println("Nota incorrecta");
		
		}
	}

}
