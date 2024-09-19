package com.curso.java.inicio.condicionales.ejercicios;

public class EjercicioCosteLlamada {
	
	public static void main(String[] args) {
		
		double tiempoLlamada = 11;
		String diaSemana = "martes";
		int hora = 8;
		
		int impuesto = 0;
		double costeLlamada = 0.0;
		double costeFinal = 0.0;
		
		//Cálculo coste por duración de la llamada
		if(tiempoLlamada>0) {
			costeLlamada = costeLlamada + 1.0; //costeLlamada += 1.0 sería mas resumido, mejor // costeLlamada++ añade 1 // igual -= y -- // se pueden poner delante o detrás variando el orden de ejecución
		}
		if (tiempoLlamada>=5) {
			costeLlamada = costeLlamada + 0.8;
		}
		if (tiempoLlamada>=8) {
			costeLlamada = costeLlamada + 0.7;
		}
		if(tiempoLlamada>10) {
			costeLlamada = costeLlamada + (tiempoLlamada-10)/2; //o *0.5 sería mas legible para seguir la idea de precio/minuto
		}
		System.out.println(costeLlamada);
		
		//Cálculo de impuesto
		if(diaSemana == "domingo") {
			impuesto = 3;
		}else if(hora<0 || hora>=25){
			System.out.println("Hora no válida");
		}else if(hora>=6 && hora<12){
			impuesto = 15;
		}else if(hora>=12 && hora<23) {
			impuesto = 10;
		}else if(hora>=23 || hora<6) {
			impuesto = -10;
		}
		System.out.println(impuesto);
		
		//Cálculo del coste final
		costeFinal = costeLlamada + ((costeLlamada*impuesto)/100);
		System.out.println(costeFinal);
	}
}

/*Herramienta para calcular el precio de una llamada
Cuando se realiza una llamada, el cobro es por el tiempo que esta dura,
de tal forma que:

+ los primeros cinco minutos cuestan 1€, 
+ los siguientes 3 minutos, 80 céntimos, 
+ los siguientes dos minutos a 70 céntimos 
+ y a partir del décimo minuto, 50 céntimos cada minuto.

Se carga un impuesto del 3% cuando es domingo, 
y si es otro día, 
	en turno de mañana 15% (6-12)
	y en turno de tarde 10%. (12-23)
	y en turno de noche -10%. (23-6)

Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada*/