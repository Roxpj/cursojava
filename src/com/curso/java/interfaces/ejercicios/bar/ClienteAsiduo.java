package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.interfaces.ejercicios.bar.exceptions.TooColdTemperatureException;
import com.curso.java.interfaces.ejercicios.bar.exceptions.TooHotTemperatureException;

public class ClienteAsiduo extends ClienteCafetero{

	private String mote;
	
	public ClienteAsiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
	}

	public String getMote() {
		return mote;
	}

	@Override
	public void tomarCafe(TazaCafe cafe) throws TooColdTemperatureException, TooHotTemperatureException {
		super.tomarCafe(cafe);
		System.out.println("El asiduo "+this.mote+" está tomando un café "+cafe.getTipoCafe());
	}
}
