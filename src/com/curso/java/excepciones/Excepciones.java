package com.curso.java.excepciones;
import com.curso.java.poo.Persona;

public class Excepciones {

	public static void main(String[] args) {
		System.out.println("Empieza");
		Persona alumno = null;
		int[] numeros = { 1, 2, 3, 4 };
		
		//CONTROL DE EXCEPCIONES
		// Código susceptible a que genere una excepción lo controlamos con try/catch
		// con finally podemos definir código que siempre se ejecute
		try {
			Thread.sleep(10000); //Detiene el hilo de ejecución en milisegundos, necesita controlarse
			System.out.println(7/0); //Aritmetic exception
			System.out.println(alumno.getNombre()); //Null pointer exception
			System.out.println(numeros[4]); // ArrayIndexOutOfBoundException
			// "Hola".charAt(7); // StringIndexOutOfBoundException
			//throw new NullPointerException("NullPointer creado por mi"); // se pueden lanzar excep ya existentes
			//pintaNombre(alumno);
			
		}catch(ArithmeticException ae) {
			System.out.println("No puedes dividir entre 0.");
		}catch(NullPointerException npe) {
			System.out.println("Has intentado acceder a un objeto que no existe: "+npe.getMessage());
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Has intentado acceder a una posición de un array que no existe: "+aiobe.getMessage());
		}catch(Exception e) {
			System.out.println("Error desconocido: "+e.getMessage()); //catch general con sólo Exception
		}finally {
			System.out.println("Esto se va a ejecutar siempre"); //finally se ejecuta siempre, incluso si no se llega a recoger la excepción correctamente.
		}
		
		
		
		try {
			metodo1();
		} catch (MiExcepcion e) {
			System.out.println("Error en metodo1 ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin");
	}
	
	
	public static void metodo1() throws MiExcepcion{ //necesitamos controlar la excepcion, así obligamos a la llamada a controlar
		if(Math.random()>0.5) {
			MiExcepcion me = new MiExcepcion("Esto es un error propio");
			throw me;
			
		}
	}
	
	//Unchecked Exceptions - No estás obligado a controlarlas. Heredan de Error y RuntimeException.
	//Checked Exceptions - Sí es obligatorio controlarlas. Heredan de Exception excepto RunTime.
	
	public static void pintaNombre (Persona alumno) {
		if (alumno!=null) {
			alumno.getNombre();
		}
		else {
			throw new NullPointerException("El alumno no existe.");
		}
	}
}
