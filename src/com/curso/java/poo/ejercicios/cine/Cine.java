package com.curso.java.poo.ejercicios.cine;

public class Cine {

	private String nombre;
	private Sala[] salas;
	
	public Cine(String nombre, Sala[] salas) {
		super();
		this.nombre = nombre;
		this.salas = salas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sala[] getSalas() {
		return salas;
	}
	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}

	public void pintarSalasDisponibles(Cine cine, int numEntradas) {
		for(Sala sala : cine.getSalas()) {
			int butacasLibres=0;
			for(int i=0; i<sala.getButacas().length; i++) {
				for(int j=0; j<sala.getButacas()[i].length; j++) {
					if(sala.getButacas()[i][j]==null) {
						butacasLibres++;
					}
				}
			}
			if(butacasLibres>=numEntradas) {
				System.out.println("-Sala "+sala.getNumero()+" - "+sala.getTituloPelicula());
			}
		}
	}
	
	public void pintarResumen(Cine cine) {
		System.out.println();
		System.out.println("Dan comienzo las sesiones de hoy en los "+cine.getNombre()+". Vayan accediendo a sus asientos."
				+ "\nLas películas de hoy son:");
		for(Sala sala : cine.getSalas()) {
			System.out.println();
			int butacasLibres=0;
			System.out.println("🌟🎥🇮 "+sala.getTituloPelicula()+" 🌟 - sala "+sala.getNumero()
				+ "\n\tAsistentes: ");
			for(int i=0; i<sala.getButacas().length; i++) {
				for(int j=0; j<sala.getButacas()[i].length; j++) {
					if(sala.getButacas()[i][j]==null) {
						butacasLibres++;
					}else {
						System.out.println("\t🍿 "+sala.getButacas()[i][j].getNombre()+" - §["+i+"-"+j+"]§");
					}
				}
			}
			System.out.println("\tAsientos vacíos: "+butacasLibres+"\n\t");
			sala.pintarButacas(sala.getButacas());
			
		}
	}
}
