package test.java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import excepciones.MaxBoardingLimitException;
import individuos.Guerrero;
import individuos.Marciano;
import naves.VehiculoGuerra;

public class VehiculoGuerraTest {

    private VehiculoGuerra vehiculo;

    @Before
    public void setUp() {
        vehiculo = new VehiculoGuerra("TestVehiculo");
    }

    @Test
    public void testConstructorDefault() {
        assertEquals("TestVehiculo", vehiculo.getNombre());
        assertEquals(100, vehiculo.getPuntosVida());
        assertEquals(5, vehiculo.getAtaque());
        assertEquals(5, vehiculo.getDefensa());
        assertNotNull(vehiculo.getGuerreros());
    }

    @Test
    public void testConstructorWithGuerreros() {
        List<Guerrero> guerreros = new ArrayList<>();
        guerreros.add(new Marciano("TestGuerrero","Soldado", 4, 3, "Jupiter"));
        vehiculo = new VehiculoGuerra("TestVehiculo", guerreros);
        assertEquals(1, vehiculo.getGuerreros().size());
    }

    @Test
    public void testEmbarcar() throws Exception {
        List<Guerrero> guerreros = new ArrayList<>();
        guerreros.add(new Marciano("TestGuerrero","Soldado", 4, 3, "Jupiter"));
        vehiculo.setGuerreros(guerreros);
        vehiculo.embarcar(new Marciano("TestGuerrero","Soldado", 4, 3, "Jupiter"));
        assertEquals(2, vehiculo.getGuerreros().size());
    }

    @Test(expected = MaxBoardingLimitException.class)
    public void testEmbarcarMaximo() throws Exception {
        List<Guerrero> guerreros = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            guerreros.add(new Marciano("Guerrero" + i,"Soldado", 4, 3, "Jupiter"));
        }
        vehiculo.setGuerreros(guerreros);
        vehiculo.embarcar(new Marciano("GuerreroExtra","Soldado", 4, 3, "Jupiter"));
    }

    @Test
    public void testAtacar() {
        Guerrero guerrero = new Marciano("TestGuerrero","Soldado", 4, 3, "Jupiter");
        guerrero.setFuerza(10);
        vehiculo.setGuerreros(Collections.singletonList(guerrero));
        int ataque = vehiculo.atacar();
        assertTrue(ataque > 0 && ataque <= 200);
    }

    @Test
    public void testDefender() {
    	  Guerrero guerrero = new Marciano("TestGuerrero","Soldado", 4, 3, "Jupiter");
          guerrero.setResistencia(10);
          vehiculo.setGuerreros(Collections.singletonList(guerrero));
          int defensa = vehiculo.defender();
          assertTrue(defensa > 0 && defensa <= 200);
    }
}
