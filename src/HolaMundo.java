//Clase
public class HolaMundo {
	//Método
	public static void main(String[] args) {

		System.out.println("Hola Mundo");

		// VARIABLES-------------------------

		/// declarar
		int number1;
		int number2, number3, number4; // no muy correcto iniciar varias en la misma línea
		/// inicializar
		number1 = 3;
		//inicializar vacio al menos para poder usarla mas adelante

		//// Tipos
		
		///// Object/Array . Empiezan en mayúscula. Por defecto son null.
		String saludo = "Hola"; // dentro de paquete java.lang, donde se encuentran clases base
		
		///// Primitive . Empiezan en minúscula. Sí tienen valores por defecto.
		//Enteros
		byte numero1 = 127; //-128 a 127
		short numero2 = 32767; // -32767 a 32767
		int numero = 1; // mucho  // = Integer.MAX_VALUE (Propiedad de la clase wrapper Integer para usar el máximo valor de un número entero)
		long numero3 = 3; // mucho mucho, se usan en bbdd
		
		// Decimales
		float decimal1 = 1.1f;
		double decimal2 = 9.7; // mas común de decimales
		
		// Caracter
		char caracter = 'c'; // comillas simples y un sólo caracter, aunque sea un espacio
		char caracterVacio = ' '; 
		
		// Booleanos
		boolean esMayorEdad = true;
		boolean esMenorEdad = 3>7;
		
		//----------------------------------j
		
		
		System.out.println(saludo + " " + numero);

		String name = "Roxana";
		String lastname = "Paredes";
		int age = 31;

		System.out.println(saludo + " " + name + " " + lastname + ", " + "tienes " + (age + 1) + " años." + (esMayorEdad ? "mayor" : "menor"));
	}

}
