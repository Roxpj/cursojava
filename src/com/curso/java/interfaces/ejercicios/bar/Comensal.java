package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.interfaces.ejercicios.bar.exceptions.TooColdTemperatureException;
import com.curso.java.interfaces.ejercicios.bar.exceptions.TooHotTemperatureException;

public class Comensal extends ClienteCafetero {

	private boolean tieneReserva;
	
	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
	}

	public boolean isTieneReserva() {
		return tieneReserva;
	}

	@Override
	public void tomarCafe(TazaCafe cafe) throws TooColdTemperatureException, TooHotTemperatureException {
		super.tomarCafe(cafe);
		System.out.println("El comensal "+this.getNombre()+" está tomando un café "+cafe.getTipoCafe());
	}
}
