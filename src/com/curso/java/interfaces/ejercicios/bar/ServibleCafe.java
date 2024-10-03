package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.interfaces.ejercicios.bar.exceptions.TooColdTemperatureException;
import com.curso.java.interfaces.ejercicios.bar.exceptions.TooHotTemperatureException;

public interface ServibleCafe {

	public void tomarCafe(TazaCafe cafe) throws TooColdTemperatureException, TooHotTemperatureException;
}
