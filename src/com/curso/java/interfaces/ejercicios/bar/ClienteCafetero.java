package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.interfaces.ejercicios.bar.exceptions.TooColdTemperatureException;
import com.curso.java.interfaces.ejercicios.bar.exceptions.TooHotTemperatureException;

public class ClienteCafetero extends Cliente implements ServibleCafe {

	public ClienteCafetero(String nombre) {
		super(nombre);
	}

	@Override
	public void tomarCafe(TazaCafe cafe) throws TooColdTemperatureException, TooHotTemperatureException{
		System.out.println("El cliente "+this.getNombre()+" ha pedido un café.");
		System.out.println("El café está a "+cafe.getTemperatura());
		
		if(cafe.getTemperatura()<20) {
			throw new TooColdTemperatureException("El café está frío.");
		}else if (cafe.getTemperatura()>80) {
			throw new TooHotTemperatureException("El café está demasiado caliente.");
		}
	}

}
