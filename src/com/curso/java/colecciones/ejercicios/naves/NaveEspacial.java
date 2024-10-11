package com.curso.java.colecciones.ejercicios.naves;

import java.util.List;

import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxPointsLimitException;
import com.curso.java.colecciones.ejercicios.naves.individuos.Guerrero;

public class NaveEspacial extends VehiculoGuerra {
	
	public NaveEspacial(String nombre, int ataque, int defensa, List<Guerrero> guerreros) throws MaxPointsLimitException {
		super(nombre, ataque, defensa, guerreros);
	}

	public NaveEspacial(String nombre, int ataque, int defensa) throws MaxPointsLimitException {
		super(nombre, ataque, defensa);
	}

	public NaveEspacial(String nombre, List<Guerrero> guerreros) {
		super(nombre, guerreros);
	}

	public NaveEspacial(String nombre) {
		super(nombre);
	}

}
