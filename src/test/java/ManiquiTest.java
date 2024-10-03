//package test.java;
//
//
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//
//import org.junit.Test;
//
//import com.curso.java.poo.ejercicios.maniqui.Boton;
//import com.curso.java.poo.ejercicios.maniqui.Camisa;
//import com.curso.java.poo.ejercicios.maniqui.Maniqui;
//import com.curso.java.poo.ejercicios.maniqui.Pantalon;
//import com.curso.java.poo.ejercicios.maniqui.Vestido;
//
//public class ManiquiTest {
//	Maniqui maniqui1;
//	Maniqui maniqui2;
//	Maniqui maniqui3;
//	
////	@Before
////	public void metodo0() {
////		Boton boton1 = new Boton("redondo", "negro1","mediano");
////		Boton boton2 = new Boton("redondo", "negro2","mediano");
////		Boton boton3 = new Boton("redondo", "negro3","mediano");
////		
////		Boton[] botones = {boton2,boton3};
////		
////		Pantalon pantalon1 = new Pantalon("vaquero","L",30, boton1);
////		Camisa camisa1 = new Camisa("Blanco","L",25, botones);
////	
////		Vestido vestido1 = new Vestido("Verde","L",40);
////		
////		maniqui1 = new Maniqui(1);
////		maniqui2 = new Maniqui(2, vestido1);
////		maniqui3 = new Maniqui(3, camisa1, pantalon1);
////	}
////	
////	@Test
////	public void vestirConVestidoTest() {
////		Vestido vestidoRojo = new Vestido("Rojo","L",40);
////		maniqui1.vestir(vestidoRojo);
////		
////		assertNotNull(maniqui1.getVestido());
////	}
//	
//	@Test
//	public void desvestirTest() {
//		maniqui2.desvestir();
//		
//		assertNull(maniqui2.getVestido());
//		assertNull(maniqui2.getPantalon());
//		assertNull(maniqui2.getCamisa());
//	}
//	
//	@Test
//	public void camisaConBotonesTest() {
//		
//		assertNotEquals(0, maniqui3.getCamisa().getBotones().length);
//
//	}
//	
//}
//
