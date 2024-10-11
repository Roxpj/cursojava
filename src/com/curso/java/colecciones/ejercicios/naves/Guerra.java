package com.curso.java.colecciones.ejercicios.naves;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxBoardingLimitException;
import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxPointsLimitException;
import com.curso.java.colecciones.ejercicios.naves.individuos.Guerrero;
import com.curso.java.colecciones.ejercicios.naves.individuos.Marciano;

public class Guerra {
	
	public void iniciarGuerra(VehiculoGuerra bandoUsuario) {
		Map<String, VehiculoGuerra> contrincantes = new HashMap();
		
		Ufo ufo1 = this.crearBandoMarciano();
		contrincantes = this.crearContrincantes(ufo1, bandoUsuario);
		
		VehiculoGuerra perdedor = null;
		System.out.println("Comienza la batalla.");
		do {
			this.batalla(contrincantes);
			perdedor = this.comprobarVidas(contrincantes);
		}while(perdedor==null);
		
		if(perdedor==bandoUsuario) {
			System.out.println("\033[41m\033[1;97m¡Tus guerreros han sido derrotados!\033[0m");
		}else {
			System.out.println("\033[44m\033[1;97m¡¡Has derrotado a los Marcianos!!\033[0m");			
		}
		
	}
	
	private Ufo crearBandoMarciano() {
		Ufo ufo1 = new Ufo("Ovnicito");
		try {
			Marciano marc1 = new Marciano("M1", "Almirante", 5, 5, "Jupiter");
			Marciano marc2 = new Marciano("M2", "Tripulante", 2, 3, "Mercurio");
			Marciano marc3 = new Marciano("M3", "Comandante", 8, 2, "Jupiter");
			Marciano marc4 = new Marciano("M4", "Artillero", 7, 3, "Plutón");
			Marciano marc5 = new Marciano("M5", "Soldado", 4, 3, "Jupiter");
			Marciano marc6 = new Marciano("M6", "Soldado", 4, 3, "Jupiter");
			Marciano marc7 = new Marciano("M7", "Soldado", 4, 3, "Jupiter");
			Marciano marc8 = new Marciano("M8", "Soldado", 4, 3, "Jupiter");
			Marciano marc9 = new Marciano("M9", "Soldado", 4, 3, "Jupiter");
			int poderEspecial = (int)(Math.random()*11);
			Marciano marc10 = new Marciano("M10", "Berserker", poderEspecial, 10-poderEspecial, "Kripton");
			
			System.out.println("Embarcando guerreros marcianos...");
			ufo1.embarcar(marc1);
			ufo1.embarcar(marc2);
			ufo1.embarcar(marc3);
			ufo1.embarcar(marc4);
			ufo1.embarcar(marc5);
			ufo1.embarcar(marc6);
			ufo1.embarcar(marc7);
			ufo1.embarcar(marc8);
			ufo1.embarcar(marc9);
			ufo1.embarcar(marc10);
		}catch(MaxPointsLimitException mple) {
			System.out.println(mple.getMessage());
		}catch(MaxBoardingLimitException mble) {
			System.out.println(mble.getMessage());
		}
		return ufo1;
	}
	
	private Map<String, VehiculoGuerra>  crearContrincantes(VehiculoGuerra...naves) {
		Map<String, VehiculoGuerra> contrincantes = new HashMap();
		for (VehiculoGuerra nave : naves) {
			contrincantes.put(nave.getNombre(), nave);
		}
		return contrincantes;
	}
	
	private void batalla(Map<String, VehiculoGuerra> contrincantes) {
		int num = (int)(Math.random()*11);
		Set<String> keys = contrincantes.keySet();
		String bandoUsuario = "";
		for (String key : keys) {
			bandoUsuario = key;
		}
		if(num%2==0) {
			System.out.println("\nLa nave \033[0;36mMarciana\033[0m ataca primero.");
			this.ataque(contrincantes, "Ovnicito", bandoUsuario);
			this.ataque(contrincantes, bandoUsuario, "Ovnicito");
		}else {
			System.out.println("\n\033[0;92mTu nave\033[0m ataca primero.");
			this.ataque(contrincantes, bandoUsuario, "Ovnicito");
			this.ataque(contrincantes, "Ovnicito", bandoUsuario);
		}
	}
	
	private void ataque(Map<String, VehiculoGuerra> contrincantes, String primeros, String segundos) {
		int ataque = contrincantes.get(primeros).atacar();
		System.out.println("\nLa nave "+primeros+" realiza un ataque de "+ataque+" puntos de fuerza.");
		int defensa = contrincantes.get(segundos).defender();
		System.out.println("La nave "+segundos+" se defiende con "+defensa+" puntos de defensa.");
		int danioFinal = ataque-defensa;
		if(danioFinal<=0) {
			System.out.println("La nave "+segundos+" se ha defendido completamente del ataque.");
		}else {
			contrincantes.get(segundos).setPuntosVida(contrincantes.get(segundos).getPuntosVida()-danioFinal);
			System.out.println("\033[0;91mLa nave "+primeros+" ha hecho "+danioFinal+" puntos de daño a la "+segundos+".\033[0m");			
		}
	}
	
	private void pintarVidas(Collection<VehiculoGuerra> vehiculos) {
		System.out.println();
		for (VehiculoGuerra vehiculoGuerra : vehiculos) {
				System.out.println("-La vida restante de la nave "+vehiculoGuerra.getNombre()+" es de "+vehiculoGuerra.getPuntosVida()+".");
		}
		System.out.println();
	}
	
	private VehiculoGuerra comprobarVidas(Map<String, VehiculoGuerra> contrincantes) {
		Collection<VehiculoGuerra> vehiculos = contrincantes.values();
		VehiculoGuerra bandoPerdedor = null;
		for (VehiculoGuerra vehiculoGuerra : vehiculos) {
			if(vehiculoGuerra.getPuntosVida()<=0) {
				bandoPerdedor = vehiculoGuerra;
				System.out.println("\nLa nave "+vehiculoGuerra.getNombre()+" ha caído.");
			}else {
			}
		}
			pintarVidas(vehiculos);
		return bandoPerdedor;
	}
}
