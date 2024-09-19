package com.curso.java.utils;

public class UtilidadesMatematicas {

	public static int sumar(int a, int b) {
		int resultado = a+b;
		return resultado;
	}
	
	public static int operacion(int a, int b, String operacion) {
		int resultado=0;
		switch(operacion.trim()) {
		case "+":
		case "suma": resultado=a+b;break;
		case "resta": resultado=a-b;break;
		case "multiplicacion": resultado=a*b;break;
		case "division": resultado=a/b;break;
		}
		return resultado;
	}
	
	//VARARGS -- tienen que estar al final
	public static int operacionNumerosIndefinidos(String operacion, int... numeros) {
		int resultado=0;
		switch(operacion.trim()) {
		case "+":
		case "suma": 
			for(int numero : numeros) {
				resultado+=numero;break;				
			}
		//case "resta": resultado=a-b;break;
		//case "multiplicacion": resultado=a*b;break;
		//case "division": resultado=a/b;break;
		}
		return resultado;
	}
	
	public static int calculaSumatorio(int[] numeros) {
		int resultado=0;
		for(int numero : numeros) {
			resultado+= numero;
		}
		return resultado;
	}
	
	public static int calculaSumatorioVARARGS(int... numeros) {
		int resultado=0;
		for(int numero : numeros) {
			resultado+= numero;
		}
		return resultado;
	}
	
	public static int calcularMedia(int[] numeros) {
		int resultado = calculaSumatorio(numeros)/numeros.length;
		return resultado;
	}
}
