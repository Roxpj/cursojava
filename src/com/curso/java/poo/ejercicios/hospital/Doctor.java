package com.curso.java.poo.ejercicios.hospital;

public class Doctor extends EmpleadoHospital {

	private String especialidad;
	
	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Enfermo diagnosticarPaciente(Paciente paciente) {
		int gravedad = (int)(Math.random()*11);
		Enfermo enfermo = new Enfermo();
		
		String[] enfermedades = { "escoliosis", "migrañas", "sarpullido", "caspa", "anginas", "cojera", "tinitus", "escorbuto"};
		
		System.out.println("👩‍⚕️ Le atiende el Doctor "+this.getNombre()+".");
		if(gravedad>8) {
			enfermo = new Enfermo(paciente.getNombre(), paciente.getEdad(), enfermedades[(int)(Math.random()*8)]);
			System.out.println("🤒 El paciente "+paciente.getNombre()+" está muy malito, va a ser ingresado por su ataque de "+enfermo.getEnfermedad()+".\n");
		}else {
			System.out.println("🏠 El paciente "+paciente.getNombre()+" solo tiene "+enfermedades[(int)(Math.random()*8)]+", no está tan mal, se puede ir a casa.");
		}
		return enfermo;
	}
	
}
