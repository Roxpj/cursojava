package com.curso.java.poo.ejercicios.maniqui;

public class Escaparate {

	public static void main(String[] args) {
		
		Boton botonPant1 = new Boton("Redondo", "Plateado", 2);
		Boton botonPant2 = new Boton("Redondo", "Negro", 1);
		Boton botonPant3 = new Boton("Cuadrado", "Rosa", 3);
		Boton botonCam1 = new Boton("Redondo", "Blanco", 1);
		Boton botonCam2 = new Boton("Redondo", "Blanco", 1);
		Boton botonCam3 = new Boton("Redondo", "Blanco", 1);
		Boton botonCam4 = new Boton("Redondo", "Blanco", 1);
		Boton botonCam5 = new Boton("Redondo", "Blanco", 1);
		Boton[] botonesCam = { botonCam1, botonCam2, botonCam3, botonCam4, botonCam5};
		
		Pantalon pantalon1 = new Pantalon("Azul", 40, 20.5, botonPant1);
		Pantalon pantalon2 = new Pantalon("Negro", 38, 30.99, botonPant2);
		Pantalon pantalon3 = new Pantalon("Multicolor", 12, 15.60, botonPant3);
		Pantalon pantalon4 = new Pantalon("Gris", 42, 22.5, botonPant2);
		
		Camisa camisa1 = new Camisa("Blanco", 40, 15.20, botonesCam);
		Camisa camisa2 = new Camisa("Negro", 44, 15.20, botonesCam);
		Camisa camisa3 = new Camisa("Floreado", 36, 25.90, botonesCam);
		Camisa camisa4 = new Camisa("Cuadros", 38, 25.90, botonesCam);
		
		Vestido vestido1 = new Vestido("Blanco", 38, 20.95);
		Vestido vestido2 = new Vestido("Negro", 36, 40.95);
		Vestido vestido3 = new Vestido("Floreado", 44, 22.20);
		Vestido vestido4 = new Vestido("Amarillo", 40, 30.12);
		
		Maniqui maniqui1 = new Maniqui(camisa2, pantalon4);
		Maniqui maniqui2 = new Maniqui(vestido3);
		
		Maniqui maniqui3 = new Maniqui(null);
		Maniqui maniqui4 = new Maniqui(camisa3, pantalon1);
		
		maniqui3.vestir(camisa4, pantalon2);
		maniqui4.desvestir();
		
		Maniqui[] maniquies = { maniqui1, maniqui2, maniqui3, maniqui4};
		
		Escaparate escaparate = new Escaparate();
		escaparate.mostrarEscaparate(maniquies);
	}

	private void mostrarEscaparate(Maniqui[] maniquies) {
		for(Maniqui maniqui : maniquies) {
			System.out.print("El maniquí 🧍 ");
			if(maniqui.getVestido()!=null) {
				System.out.println("lleva puesto un vestido 👗 de color "+maniqui.getVestido().getColor()+" de la talla "+maniqui.getVestido().getTalla()+".");
				mostrarPrecioRopa(maniqui);
			}else if(maniqui.getCamisa()==null && maniqui.getPantalon()==null) {
				System.out.print(" no tiene ropa.");
			}else {
				System.out.print("lleva puesto una camisa 👚 de color "+maniqui.getCamisa().getColor()+" de la talla "+maniqui.getCamisa().getTalla());
				System.out.println(" y un pantalón 👖 de color "+maniqui.getPantalon().getColor()+" de la talla "+maniqui.getPantalon().getTalla()+".");
				mostrarPrecioRopa(maniqui);
			}
			System.out.println();
		}
	}
	
	private void mostrarPrecioRopa(Maniqui maniqui) {
		if(maniqui.getVestido()!=null) {
			System.out.println("El precio del vestido es "+maniqui.getVestido().getPrecio()+"€.");
		}else {
			double precioConjunto = maniqui.getCamisa().getPrecio()+maniqui.getPantalon().getPrecio();
			System.out.println("El precio del conjunto es "+precioConjunto+"€.");
		}
	}
}

/*
Clase Boton
+ id
+ forma
+ color
+ tamanio

Clase Pantalon
+ id
+ color
+ talla
+ precio
+ Boton


Clase Camisa
+ id
+ color
+ talla
+ precio
+ [] Boton

Clase Vestido
+ id
+ color
+ talla
+ precio

Clase Maniqui
+ id
+ Vestido
+ Pantalon
+ Camisa


===============================================================
desvestir () en el cual le quitarías toda la ropa

vestir() -> con camisa y pantalón o con vestido
===============================================================


Clase escaparate
+ main () --> 2 maniquies 
	Maniqui1: 1 pantalon y 1 camisa
	Maniqui2: Vestido

===============================================================
	- desnudo --> vestir()
	- vestido --> Camisa y pantalón

				
+ mostrarEscaparate() al cual hay que pasar los maniquies 
	y tenemos que mostrar por cada maniqui la ropa que llevan
	
	
+ mostrarPrecioDeLaRopa	

=============================================================== */