package com.curso.java.poo.ejercicios.carreracaballos;

import com.curso.java.utils.Utilidades;

public class CasaDeApuestas {

	public static void main(String[] args) {
	
		// Caballo(String nombre, int numero, int edad, int velocidad, int peso, int recorrido)
		Caballo caballo1 = new Caballo("Sopita", 1, 6, 55, 220, 0);
		Caballo caballo2 = new Caballo("Marmelada", 5, 9, 60, 300, 0);
		Caballo caballo3 = new Caballo("Tornado", 7, 18, 58, 310, 0);
		Caballo caballo4 = new Caballo("Tornado Jr.", 77, 12, 61, 290, 0);
		Caballo caballo5 = new Caballo("Tornado Jr. Jr.", 777, 5, 72, 230, 0);
		Caballo caballo6 = new Caballo("Rojo", 8, 7, 46, 210, 0);
		Caballo caballo7 = new Caballo("Habichuelita", 88, 18, 56, 260, 0);
		Caballo caballo8 = new Caballo("Macarrón", 12, 13, 62, 310, 0);
		Caballo caballo9 = new Caballo("Velocirraptor", 66, 8, 71, 350, 0);
		Caballo caballo10 = new Caballo("PatasLargas", 11, 16, 64, 240, 0);
		Caballo caballo11 = new Caballo("Juanete", 63, 11, 54, 290, 0);
		Caballo caballo12 = new Caballo("Borracho", 22, 16, 60, 315, 0);
		Caballo caballo13 = new Caballo("Azulito", 4, 6, 51, 210, 0);
		Caballo caballo14 = new Caballo("Mantecado", 56, 14, 63, 330, 0);
		
		//Carrera(int nombre, Caballo[] participantes, int distancia)
		Caballo[] participantesJunior = {
				caballo1,
				caballo2,
				caballo4,
				caballo5,
				caballo6,
				caballo9,
				caballo11,
				caballo13
		};
		Carrera carrera1 = new Carrera("Carrera de Jóvenes", participantesJunior, 500);
		
		Caballo[] participantesSenior = {
				caballo3,
				caballo7,
				caballo8,
				caballo10,
				caballo12,
				caballo14
		};
		Carrera carrera2 = new Carrera("Carrera de Mayores", participantesSenior, 400);
		
		//Gran Premio
		Carrera[] carreras = {
				carrera1,
				carrera2
		};
		GranPremio granPremio1 = new GranPremio("Super Premio 2024", carreras);
		
		//Apostante(String nombre, int saldo, int apuesta)
		Apostante apostante1 = new Apostante("Pepito", 1000, 0);
		Apostante apostante2 = new Apostante("Margarito", 1200, 0);
		Apostante[] apostantes = { apostante1, apostante2};
		
		empezarPremio(granPremio1, apostantes);
	}
	
	
	static int[][] recogerApuestas(Apostante[] apostantes) {
		int apuestas[][] = new int [apostantes.length] [2];
		for(int i=0; i<apostantes.length; i++) {
			apuestas[i][0] = Utilidades.pideDatoNumerico("Hola "+apostantes[i].getNombre()+", ¿cuánto quieres apostar?");
			apuestas[i][1] =  Utilidades.pideDatoNumerico("Hola "+apostantes[i].getNombre()+", indica el dorsal del caballo al que quieres apostar.");
		}
		return apuestas;
	}
	
	static void mostrarSaldo(Apostante[] apostantes) {
		for(int i=0; i<apostantes.length; i++) {
			System.out.println(apostantes[i].getNombre()+" tienes "+apostantes[i].getSaldo()+" de saldo final.");
		}
	}
	
	static void calcularApuestas(Apostante[] apostantes, int [][] apuestas, Caballo caballoGanador) {
		for(int i=0; i<apostantes.length; i++) {
			if(caballoGanador.getNumero()==apuestas[i][1]) {
				apostantes[i].setSaldo(apostantes[i].getSaldo()+apuestas[i][0]*5);
				System.out.println("¡"+apostantes[i].getNombre()+", tu apuesta ha ganado! Ahora tienes "+apostantes[i].getSaldo()+" de saldo.");
			}else {
				apostantes[i].setSaldo(apostantes[i].getSaldo()-apuestas[i][0]);
				System.out.println(apostantes[i].getNombre()+", tu apuesta ha perdido. Ahora tienes "+apostantes[i].getSaldo()+" de saldo.");
			}
		}
	}
	
	static void empezarPremio(GranPremio evento, Apostante[] apostantes) {
		System.out.println("\t✧♞✧ Bienvenidos a el "+evento.getNombre()+" ✧♞✧");
		System.out.println();
		System.out.println("En esta edición contamos con "+evento.getCarreras().length+" carreras:");
		System.out.println();
		for(Carrera carrera : evento.getCarreras()) {
			System.out.println("\t✧🏁 "+carrera.getNombre()+" 🏁✧");
			System.out.println("\tEn esta carrera competirán "+carrera.getParticipantes().length+" caballos corredores:");
			for(Caballo caballo : carrera.getParticipantes()) {
				System.out.println("\t✧♞ "+caballo.getNumero()+" - "+caballo.getNombre());
			}
			System.out.println();
			int [][] apuestas =recogerApuestas(apostantes);
			
			System.out.println();
			Caballo caballoGanador = carrera.iniciarCarrera();
			System.out.println();
			calcularApuestas(apostantes, apuestas, caballoGanador);
		}
		
		mostrarSaldo(apostantes);
	}
	
}

/*
Casa de apuestas
main()
	Crear Caballos
	Crear Carreras
	Crear Gran Premio
	
	//Mas sencillo
	Mostrar todos los datos del gran premio,
		+ Nombre
		+ Numero de carreras
		+ Por cada carrera 
			- Cuantos caballos participan
			- Nombre y dorsal de todos los caballos
	
	//Mas compleja
	Dos apostantes, 
		+ por cada carrera que apueste por un caballo
		+ importe que quiere apostar
		+ Se inicia la carrera
		+ Se indica el caballo ganador de la carrera
		+ si el apostante gana se multiplica x5 lo que ha apostado
	
	Cuando terminan todas las carreras indicamos el saldo de cada apostante
*/