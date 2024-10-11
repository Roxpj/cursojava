package com.curso.java.colecciones.ejercicios.naves;

import java.util.ArrayList;
import java.util.List;

import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxBoardingLimitException;
import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxPointsLimitException;
import com.curso.java.colecciones.ejercicios.naves.individuos.Guerrero;
import com.curso.java.colecciones.ejercicios.naves.interfaces.Tripulable;

public class VehiculoGuerra implements Tripulable{

	private String nombre;
	private int puntosVida;
	private int ataque;
	private int defensa;
	private List<Guerrero> guerreros;
	
	public VehiculoGuerra(String nombre) {
		super();
		this.nombre = nombre;
		this.puntosVida = 100;
		this.ataque = 5;
		this.defensa = 5;
		this.guerreros = new ArrayList();
	}
	
	public VehiculoGuerra(String nombre, List<Guerrero> guerreros) {
		super();
		this.nombre = nombre;
		this.puntosVida = 100;
		this.ataque = 5;
		this.defensa = 5;
		this.guerreros = guerreros;
	}
	
	public VehiculoGuerra(String nombre, int ataque, int defensa, List<Guerrero> guerreros) throws MaxPointsLimitException{
		super();
		if(ataque+defensa>10) {
			throw new MaxPointsLimitException("Los puntos de ataque y defensa combinados no deben ser mayores que 10.");
		}
		this.nombre = nombre;
		this.puntosVida = 100;
		this.ataque = ataque;
		this.defensa = defensa;
		this.guerreros = guerreros;
	}
	
	public VehiculoGuerra(String nombre, int ataque, int defensa)  throws MaxPointsLimitException{
		super();
		if(ataque+defensa>10) {
			throw new MaxPointsLimitException("Los puntos de ataque y defensa combinados no deben ser mayores que 10.");
		}
		this.nombre = nombre;
		this.puntosVida = 100;
		this.ataque = ataque;
		this.defensa = defensa;
		this.guerreros = new ArrayList();
	}
	
	protected int getPuntosVida() {
		return puntosVida;
	}
	void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public List<Guerrero> getGuerreros() {
		return guerreros;
	}
	public void setGuerreros(List<Guerrero> guerreros) {
		this.guerreros = guerreros;
	}
	public String getNombre() {
		return nombre;
	}
	public int getAtaque() {
		return ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	
	@Override
	public final int atacar() {
		double fuerzaGuerreros = 0.0;
		for (Guerrero guerrero : this.guerreros) {
			fuerzaGuerreros += guerrero.getFuerza();
		}
		int ataque = (int)(this.ataque*(Math.random())+fuerzaGuerreros*(Math.random()*0.5));
		
		return ataque;
	}
	@Override
	public final int defender() {
		double resistenciaGuerreros = 0.0;
		for (Guerrero guerrero : this.guerreros) {
			resistenciaGuerreros += guerrero.getResistencia();
		}
		int defensa = (int)(this.defensa*(Math.random())+resistenciaGuerreros*(Math.random()*0.5));
		
		return defensa;
	}
	
	public void embarcar(Guerrero guerrero) throws MaxBoardingLimitException {
		if(this.getGuerreros().size()>=10) {
			throw new MaxBoardingLimitException("La nave está llena, no puedes embarcar al guerrero "+guerrero.getNombre()+".");
		}else {
			this.guerreros.add(guerrero);
			
			String bando = "";
			if(this instanceof Ufo) {
				bando = "la nave marciana ";
			}else {
				bando = "tu nave ";
			}
			if(guerrero.getNombre().contains("10")) {
				System.out.println("Sube a "+bando+this.nombre+" el guerrero legendario "+guerrero.getNombre()+".\nSu inmensa fuerza es de "+guerrero.getFuerza()+" y su defensa blindada es de "+guerrero.getResistencia()+".\n");
			}else {
				System.out.println("Sube a "+bando+"el guerrero "+guerrero.getNombre());
			}
		}
	}
}
