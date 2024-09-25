package com.curso.java.poo.ejercicios.hospital;

public class Enfermero extends EmpleadoHospital {
	private int planta;

	public Enfermero(String nombre, int edad, String turno, int planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}

	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Enfermo atenderPaciente(Paciente paciente, Doctor doctor) {
		System.out.print("\n😷 Atendiendo al paciente "+paciente.getNombre()+". Dice que tiene:");		
		for(String sintoma : paciente.getSintomas()) {
			System.out.print(" -"+sintoma);	
		}
		System.out.println(".\n---Ahora le atenderá un doctor---");
		Enfermo enfermo = doctor.diagnosticarPaciente(paciente);
		return enfermo;
	}
	
	public void atenderEnfermo(Enfermo enfermo, Habitacion[] habitaciones) {
		if(enfermo.getEnfermedad()!=null) {
			int ocupadas = 0;
			for(Habitacion habitacion : habitaciones) {
				if(habitacion.getEnfermo()==null) {
					habitacion.setEnfermo(enfermo);
					System.out.println(enfermo.getNombre()+" es ingresado en la habitación "+habitacion.getNumero()+".");
					break;
				}
				ocupadas++;
				if(ocupadas>=3) {
					System.out.println("Lo sentimos "+enfermo.getNombre()+" no hay habitaciones disponibles, tendrás que ser atendido en otro hospital.");
				}
			}
		}
	}
	
}
