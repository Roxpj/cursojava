package com.curso.java.poo.ejercicios.alumnos;

public class AlumnoMain {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		alumno1.setApellidos("Camacho");
		alumno1.setDni("321A");
		alumno1.setMayorEdad(true);
		alumno1.setNombre("Amanda");
		alumno1.setNota(10);
		
		// VARIABLES ESTÁTICAS - son var globales para todos los objetos de la clase. Cualquier objeto puede modificarla.
		alumno1.contador = 3;
		// y no es necesario un objeto para modificarla.
		Alumno.contador = 7;
		
		Alumno alumno2 = new Alumno("654B", "Naty", "Rojas");
		alumno2.setMayorEdad(true);
		alumno2.setNota(7);
		
		Alumno alumno3 = new Alumno("967C", "Mario", "Fernandez", 3);
		alumno3.setMayorEdad(true);
		
		Alumno alumno4 = new Alumno("147N", "Conchita", "Perez", 6, true);
		
		
		Alumno[] claseA = {
				alumno1,
				alumno2,
				alumno3,
				alumno4
		};
		
		// cualquier objeto de la clase puede acceder a la variable estática.
		System.out.println(alumno2.contador);
		
		//De esta manera podemos usar el método no estático de abajo, a pesar de ser de la propia clase, necesita un objeto
		AlumnoMain alumnoMain = new AlumnoMain();
		alumnoMain.aprobados(claseA);
	}
	
	public void aprobados(Alumno[] alumnos) {
		for(Alumno alumno : alumnos) {
			int nota = alumno.getNota();
			if(nota>=5) {
				System.out.println(alumno.getNombre()+" "+alumno.getApellidos()+" ha sacado un "+alumno.getNota());
			}
		}
	}

}

/*
Clase AlumnoMain
main ()
	4 objetos de tipo alumno
		+ 1 usando el const. vacio --> luego dar la informacion
		+ 1 usando (dni, nombre, apellidos)
		+ 1 usando (dni, nombre, apellidos, nota)
		+ 1 usando (dni, nombre, apellidos, nota, mayorEdad)
		
Sencilla:	Llamar de cada objeto al metodo estudiar

Complicada: Meter a todos los alumnos en un array, 
	crear método que reciba un array de alumnos y muestre la información (nombre y apellidos y nota) de todos los que han aprobado 
*/