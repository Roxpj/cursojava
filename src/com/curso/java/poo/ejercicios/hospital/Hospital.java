package com.curso.java.poo.ejercicios.hospital;

public class Hospital {
	
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaDeEspera;
	private Enfermero enfermero;
	private Doctor doctor;

	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		//this.habitaciones = new Habitacion[2];
		//this.salaDeEspera = new Paciente[3];
	}

	public Hospital(String nombre, Habitacion[] habitaciones, Paciente[] salaDeEspera) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.salaDeEspera = salaDeEspera;
	}

	public Hospital(String nombre, Habitacion[] habitaciones, Paciente[] salaDeEspera, Enfermero enfermero,
			Doctor doctor) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
		this.salaDeEspera = salaDeEspera;
		this.enfermero = enfermero;
		this.doctor = doctor;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	public Paciente[] getSalaDeEspera() {
		return salaDeEspera;
	}
	public void setSalaDeEspera(Paciente[] salaDeEspera) {
		this.salaDeEspera = salaDeEspera;
	}	
	public Enfermero getEnfermero() {
		return enfermero;
	}
	public void setEnfermero(Enfermero enfermero) {
		this.enfermero = enfermero;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	public static void main(String[] args) {

		Hospital hospital1 = new Hospital("Ramon y Cajal");
		hospital1.abrirHospital();
	}
	
	
	private void abrirHospital() {
		
		Habitacion habitacion1 = new Habitacion(01);
		Habitacion habitacion2 = new Habitacion(02);
		Habitacion[] habitaciones = { habitacion1, habitacion2 };
		this.setHabitaciones(habitaciones);
		
		String[] sintomas1 = {"dolor de tripa", "moqueo", "irritabilidad"};
		String[] sintomas2 = {"molestias lumbares", "afonía", "visión borrosa"};
		String[] sintomas3 = {"acúfenos", "vértigo", "picor en la cabeza"};
		
		Paciente paciente1 = new Paciente("Andrea", 22, sintomas1);
		Paciente paciente2 = new Paciente("Titus", 39, sintomas2);
		Paciente paciente3 = new Paciente("Marquitos", 14, sintomas3);
		//Paciente paciente4 = new Paciente("Pepi", 24, new String[] {"Mareos","Perdida visión"};
		Paciente[] salaDeEspera = { paciente1, paciente2, paciente3 };
		this.setSalaDeEspera(salaDeEspera);
		
		Enfermero enfermero1 = new Enfermero("Antonio", 33, "Día", 0);
		this.setEnfermero(enfermero1);
		
		Doctor doctor1 = new Doctor("Margarita", 28, "Día", "Cirugía");
		this.setDoctor(doctor1);
		
		this.turnoDia();
		
		for(int i=0; i<this.getSalaDeEspera().length; i++) {
			Paciente paciente = this.getSalaDeEspera()[i];
			Enfermo enfermo = this.getEnfermero().atenderPaciente(paciente, this.getDoctor());
			this.getSalaDeEspera()[i] = null;
			
			this.getEnfermero().atenderEnfermo(enfermo, habitaciones);
		}
		
		this.horaDeComer();
		
	}
	
	private void horaDeComer() {
		System.out.println();
		for(Habitacion habitacion : this.getHabitaciones()) {
			if(habitacion.getEnfermo()!=null) {
				habitacion.getEnfermo().comer();				
			}
		}
		for(Paciente paciente : this.salaDeEspera) {
			if(paciente!=null) {
				paciente.comer();
			}
		}
		this.getDoctor().comer();
		this.getEnfermero().comer();
	}
	
	private void turnoDia() {
		if(this.getDoctor().getTurno().equals("Día")) {
			this.getDoctor().fichar();			
		}
		if(this.getEnfermero().getTurno().equals("Día")) {
			this.getEnfermero().fichar();			
		}
		System.out.println();
	}
	private void turnoNoche() {
		if(this.getDoctor().getTurno().equals("Noche")) {
			this.getDoctor().fichar();			
		}
		if(this.getEnfermero().getTurno().equals("Noche")) {
			this.getEnfermero().fichar();			
		}
		System.out.println();
	}

}

/*
Clase Persona
+ nombre
+ edad

+ comer() abstracto

Clase Paciente hereda de Persona
+ sintomas [] String 

+ comer() --> Paciente ... comiendo en la cafetería

Clase Enfermo hereda de Persona 
+ enfermedad
+ comer() --> Enfermo ... comiendo en la habitación

Habitacion
+ numero
+ Enfermo

EmpleadosHospital hereda de Persona
+ turno

+ fichar() --> El empleado ... está fichando
+ comer() --> Empleado ... comiendo en el comedor

Enfermero hererda EmpleadosHospital
+ planta

+ atenderPaciente() {}


Doctor hereda EmpleadosHospital
+ especialidad

+ diagnosticarPaciente(Paciente)// 
		Si el paciente está enfermo --> 1-10  
		si > 8 el paciente está enfermo
			devolver un objeto Enfermo 
		
		
Hospital
+ nombre
+ habitaciones [2]
+ salaDeEspera [3]

+ main () --> abrirHospital()
+ abrirHospital()
	+ 2 objetos de tipo habitacion

	+ 3 pacientes --> Meterlos en la sala de espera
	+ 1 enfermero
	+ 1 doctor
	
	//Crear método que ponga a fichar a todos los empleados del hospital
	
	//Crear método para poner a todas las personas del hospital a comer
	

	//El enfermero atiende al paciente
		+ Sacar al paciente de la sala de espera
		+ Asignar al paciente al doctor
		+ Doctor diagnosticarPaciente
		+ Si el paciente está enfermo --> ingresa (Se le asigna habitación) se le debe asignar una habitación vacía
			- si no hay habitaciones disponibles se le indica

*/