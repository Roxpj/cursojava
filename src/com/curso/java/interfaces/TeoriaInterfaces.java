package com.curso.java.interfaces;

public class TeoriaInterfaces {

	
	//Elemento de un proyecto para otorgar funcionalidad a las clases.
	//Sus métodos son públicos y abstractos.
	//Tiene métodos abstractos (sin necesidad de poner abstract) ya que su función sólo es dar funcionalidad.
	//Se IMPLEMENTA en una clase así ---> public class Saxofon extends Instrumento implements Vendible, Interfaz3, Interfaz1{
	//La herencia es única, pero podemos implementar tantas interfaces como queramos. Permite implementar el mismo método en dos clases que no tengan nada que ver.
	//Por ejemplo implementar el método limpiar() a Instrumento(s) y a Persona(s)
	//Es una manera de obligar a realizar cierta funcionalidad/es en las clases donde las implementes.
	//Las interfaces admiten herencia unas de otras.
	//Se puede definir un método default que sí lleva código.
}
