package com.curso.java.inicio.funciones;

import com.curso.java.utils.Utilidades;

public class TestFunciones {

	public static void main(String[] args) {
		
		EjemploFunciones.metodo0();
		EjemploFunciones.metodo1();
		EjemploFunciones.metodo2();
		//EjemploFunciones.metodo3(); este es private, no se puede llamar aquí, fuera de su clase

		String [] menus = {"A","B","C","D","E"};
		Utilidades.pintaMenu(menus);
		
		int [][] mapa = new int [5] [5];
		String [] filas = {"A","B","C","D","E"};
		String [] columnas = {"1","2","3","4","5"};
		Utilidades.pintaMatrizBiInt(mapa, columnas, filas);
		
		Utilidades.pintaMenuFormato(filas);
		
	}

}
