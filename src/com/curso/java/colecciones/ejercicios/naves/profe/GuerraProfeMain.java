package com.curso.java.colecciones.ejercicios.naves.profe;

import com.curso.java.guerra.Guerra;
import com.curso.java.guerra.excepciones.ExceedMaxLimitException;
import com.curso.java.guerra.excepciones.MaxGuerrerosLimitException;
import com.curso.java.guerra.guerreros.Guerrero;
import com.curso.java.guerra.vehiculos.VehiculoGuerra;

public class GuerraProfeMain {

	public static void main(String[] args) {
	
		Guerra guerra = new Guerra();
		VehiculoGuerra elefante = null;
		try {
			elefante = new DobleElefanteTelepataDeGuerra("Elefante");
		} catch (ExceedMaxLimitException e) {
			e.printStackTrace();
		}
		
		try {
			Guerrero ardilla1 = new ArdillaArmada("a1", 8,2);
			Guerrero ardilla2 = new ArdillaArmada("a2", 8,2);
			Guerrero ardilla3 = new ArdillaArmada("a3", 8,2);
			Guerrero ardilla4 = new ArdillaArmada("a4", 8,2);
			Guerrero ardilla5 = new ArdillaArmada("a5", 8,2);
			Guerrero ardilla6 = new ArdillaArmada("a6", 8,2);
			Guerrero ardilla7 = new ArdillaArmada("a7", 8,2);
			Guerrero ardilla8 = new ArdillaArmada("a8", 8,2);
			Guerrero ardilla9 = new ArdillaArmada("a9", 8,2);
			Guerrero ardilla10 = new ArdillaArmada("a10", 8,2);
			
			elefante.embarcar(ardilla1);
			elefante.embarcar(ardilla2);
			elefante.embarcar(ardilla3);
			elefante.embarcar(ardilla4);
			elefante.embarcar(ardilla5);
			elefante.embarcar(ardilla6);
			elefante.embarcar(ardilla7);
			elefante.embarcar(ardilla8);
			elefante.embarcar(ardilla9);
			elefante.embarcar(ardilla10);
			
		} catch (ExceedMaxLimitException e) {
			e.printStackTrace();
		} catch (MaxGuerrerosLimitException e) {
			e.printStackTrace();
		}
		
		guerra.iniciarGuerra(elefante);
		
	}
}
