package com.curso.java.inicio.condicionales.ejercicios;

import java.util.Scanner; //Ctrl + Shift + O te rellena las importaciones automáticamente, también borra las no utilizadas

public class EjercicioEstacionesAnio {

	public static void main(String[] args) {
		
		String mes = ""; 
		System.out.println("Escribe un mes");
		Scanner scan = new Scanner(System.in); // Crea objeto de la clase escaner 
		mes = scan.nextLine(); //Utiliza su método para recoger el input y guardarlo en la variable mes
			//scan.nextInt(); Para recoger números enteros
			//scan.nextLine().toLowerCase(); Convertiría todo el string a minúsculas, pero modifica el input
		System.out.println(mes);
		
		
		String estacion = "";
		
		//ejemplo con equals
		if(mes.equals("Enero") || mes.equals("Febrero") || mes.equals("Marzo")) { //Para comparar Strings utilizamos su método equals(), no ==
			estacion = "Invierno";
		}else if(mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Junio")) { //equalsIgnoreCase() para no diferenciar mayus y minus
			estacion = "Primavera";
		}else if(mes.equals("Julio") || mes.equals("Agosto") || mes.equals("Septiembre")) {
			estacion = "Verano";
		}else if(mes.equals("Octubre") || mes.equals("Noviembre") || mes.equals("Diciembre")) {
			estacion = "Otoño";
		}
		
		
		//ejemplo con switch
		switch(mes) {
		case "Enero":
		case "Febrero":
		case "Marzo": estacion = "Invierno";break;
		case "Abril": 
		case "Mayo": 
		case "Junio": estacion = "Primavera";break;
		case "Julio":
		case "Agosto": 
		case "Septiembre": estacion = "Verano";break;
		case "Octubre":
		case "Noviembre": 
		case "Diciembre": estacion = "Otoño";
		}
		//switch comprimido
		switch(mes.toLowerCase()) {                                       //De esta manera no modificamos la variable pero podemos pasar la diferencia de mayus y minus
		case "enero", "febrero", "marzo": estacion = "Invierno";break;
		case "abril","mayo", "junio": estacion = "Primavera";break; 
		case "julio", "agosto", "septiembre": estacion = "Verano";break;
		case "octubre", "noviembre", "diciembre": estacion = "Otoño";
		}
		
		
		if(mes.equals("")) {
			System.out.println("Mes introducido erroneo");
		}else {
			System.out.println("La estación es " + estacion);
		}
		
	}
	
}

/* Teniendo en cuenta que || sirve para ver si una condición cumple un valor u otro, hacer lo siguiente:

Declarar una variable para guardar un nombre de un mes
Indicar con que estación del año se corresponde

Enero, Febrero, marzo --> Invierno
Abril, mayo, Junio --> Primavera
Julio, Agosto, septiembre --> Verano
octube, noviembre, diciembre --> Otoño */