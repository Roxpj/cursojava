package com.curso.java.colecciones.ejercicios.naves;

import java.util.List;

import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxPointsLimitException;
import com.curso.java.colecciones.ejercicios.naves.individuos.Guerrero;
import com.curso.java.colecciones.ejercicios.naves.interfaces.Tripulable;

public class Ufo extends VehiculoGuerra implements Tripulable{


	public Ufo(String nombre, int ataque, int defensa, List<Guerrero> guerreros) throws MaxPointsLimitException {
		super(nombre, ataque, defensa, guerreros);
	}

	public Ufo(String nombre, int ataque, int defensa) throws MaxPointsLimitException {
		super(nombre, ataque, defensa);
	}

	public Ufo(String nombre, List<Guerrero> guerreros) {
		super(nombre, guerreros);
	}

	public Ufo(String nombre) {
		super(nombre);
	}

}
