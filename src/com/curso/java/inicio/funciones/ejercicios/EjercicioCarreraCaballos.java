package com.curso.java.inicio.funciones.ejercicios;

import com.curso.java.utils.Utilidades;

public class EjercicioCarreraCaballos {

	public static void main(String[] args) {
		int numeroCaballos = 0;
		String[] caballos = new String[0];
		String[] nombres = {
				"Sopita",
				"Marmelada",
				"Tornado",
				"Tornado Jr.",
				"Tornado Jr. Jr.",
				"Rojo",
				"Habichuelita",
				"Macarrón",
				"Velocirraptor",
				"Almaenpena",
				"PatasLargas",
				"Conchita",
				"Podredumbre",
				"Juanete",
				"Manuelita",
				"Borracho",
				"Azulito",
				"Mantecado"
		};
		
		boolean manual = Utilidades.pideBoolean("🐎 Bienvenido a las carreras de caballos.🏁 ¿Desea elegir los caballos entre una lista? [si/no]", "si");
		
		if(manual) {
			numeroCaballos = Utilidades.pideDatoNumerico("¿Cuántos caballos desea que corran?:");
			Utilidades.pintaMenuFormato("Estos son los nombres de los caballos:", nombres);
			caballos = Utilidades.pideArrayOpcionesMenu("Introduce los números de los caballos que quieres elegir de uno en uno.", numeroCaballos, nombres);
			Utilidades.pintaMenuFormato(caballos);
		}else {
			numeroCaballos = Utilidades.pideDatoNumerico("¿Cuántos caballos desea que corran?:");
			caballos = Utilidades.pideArrayString("Ahora introduce los nombres de los caballos de uno en uno.", numeroCaballos);
		}
		
		
		int[] pista = new int [numeroCaballos];
		
		System.out.println("Empieza la carrera 🏁");
		int distancia = 0;
		int enCabeza = 0;
		int podio = 0;
		for(int i=0; i<300; i++) {
			for(int j=0; j<numeroCaballos; j++) {
				pista[j]+=(int)(Math.random()*10);
				if(pista[j]>distancia) {
					distancia = pista[j];
					enCabeza = j;
				}
				if(pista[j]>=100) {
					podio++;
					pista[j]=0;
					switch(podio) {
					case 1: System.out.println("\t( •ᴗ•)人 ¡"+caballos[j]+" ha quedado en primera posición.!~~✧♞🏁🐎");break;
					case 2: System.out.println("\t~~"+caballos[j]+" gana la medalla de plata.~~");break;
					case 3: System.out.println("\t~~"+caballos[j]+" gana la medalla de bronce.~~");break;
					}
				}
			}
			if(podio<1) {
				System.out.println(caballos[enCabeza]+" va a la cabeza.");
			}
			if(podio>3) {
				break;
			}
			
		}
	}

}
/*
¿Cuántos caballos van a competir?
Nombre de cada caballo
Inicie una carrera
Declare el ganador
*/