package com.curso.java.poo.composicion;

public class InaugurarUniversidad {

	public static void main(String[] args) {
		
		Cafeteria cafeteria = new Cafeteria("Caf1", 20);
		
		Departamento dep1 = new Departamento("Dep1", "Planta1");
		Departamento dep2 = new Departamento("Dep2", "Planta2");
		Departamento[] departamentos = {dep1, dep2};
		
		Universidad uni = new Universidad("Universidad1", "Direc1", cafeteria, departamentos);
		
		uni.getDepartamentos()[1].getPlanta(); //accediendo a valores
	}

}
