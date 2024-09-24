package com.curso.java.poo.ejercicios.bandamusica;

public class BandaMusica {

	public static void main(String[] args) {
		
		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto();
		
	}
	
	
	public void empezarConcierto() {
		
		Instrumento guitarra1 = new Guitarra("GuitarraClasica", 6);
		Instrumento guitarra2 = new GuitarraElectrica("GuitarraElectr", 6, 45);
		Instrumento piano1 = new Piano("Piano1", 7, "de cola");
		Instrumento tambor1 = new Tambor("Tambor1", "hojalata");
		
		Instrumento [] instrumentos = {
				guitarra1,
				guitarra2,
				piano1,
				tambor1
		};
		
		afinarInstrumentos(instrumentos);
		tocarInstrumentos(instrumentos);
	}

	public void afinarInstrumentos(Instrumento[] instrumentos) {
		for(Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
	}
	
	public void tocarInstrumentos(Instrumento[] instrumentos) {
		System.out.println("｡ ♪ ♩ ♫ ｡ ♪ ♩ ♫ ｡");
		boolean desafinados = false;
		for(Instrumento instrumento : instrumentos) {
			if(instrumento.toString().contains("Tambor")) {
				Tambor tamborcito = (Tambor)instrumento;
				tamborcito.aporrear();
			}else {
				instrumento.tocar();				
			}
			if(!instrumento.isAfinado() && !desafinados) {
				desafinados = true;
			}
		}
		System.out.println("｡ ♫ ♩ ♪ ｡ ♫ ♩ ♪ ｡\n");
		System.out.println(desafinados? "La banda suena fatal. ヽ(´Д｀)人(´Д｀)人(´Д｀ )ノ〜♪" : "La banda suena angelicalmente. ( ♥ᴗ♥)♬♩♪");
		
	}
	
}

/*
clase Instrumento
nombre
tipo
afinado

afinar() --> Afinando instrumento nombre, se afina o no de manera aleatoria
	Math.random()> 0.4 --> El instrumento está afinado
tocar() --> Tocando instrumento nombre

Clase Guitarra hereda de Instrumento
numCuerdas

afinar() --> Hace lo del padre + afinando guitarra	

Clase GuitarraElectrica hereda de Guitarra
potencia

tocar () --> Tocando muy alto //

Clase Piano hereda de Instrumento
numeroOctavas
tipoPiano

afinar() --> Hace lo del padre + Afinando Piano

Clase Tambor hereda de Instrumento
material

afinar() --> Afinando Tambor (siempre afinado)

aporrear() --> Aporreando Tambor


BandaMusica
main ()--> empezarConcierto()//No puede ser estático 
	+ se crea un objeto de cada tipo

	+afinarInstrumentos(), 
		+ se ponen todos los instrumentos a afinar
	
	+tocarInstrumentos(), se le pasan todos los instrumentos en un único parámetro
		+ se ponen todos los instrumentos a tocar excepto el tambor que se aporrea
		+ Si algún instrumento no está afinado, se indica que la banda suena mal
*/