package com.curso.java.colecciones.ejercicios.naves;

import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxBoardingLimitException;
import com.curso.java.colecciones.ejercicios.naves.excepciones.MaxPointsLimitException;
import com.curso.java.colecciones.ejercicios.naves.individuos.Marciano;

public class GuerraMain {

	public static void main(String[] args) {
		
		Guerra guerra = new Guerra();
		Ufo ufo1 = new Ufo("Chihuahua gigante de guerra");
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
		}catch(MaxBoardingLimitException mble) {
			System.out.println(mble.getMessage());
		}catch(MaxPointsLimitException mple) {
			System.out.println(mple.getMessage());
		}
		
		guerra.iniciarGuerra(ufo1);
		
		//guerra.iniciarGuerraAutomatica();
		
		
	}

}
