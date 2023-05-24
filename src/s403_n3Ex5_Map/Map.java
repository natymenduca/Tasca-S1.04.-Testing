package s403_n3Ex5_Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class Map {
	//Contiene los métodos de prueba que verifican la existencia de claves en un mapa
	@Test
    public void testExistenciaClave() {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("clave1", "valor1");
        mapa.put("clave2", "valor2");
        assertTrue(mapa.containsKey("clave1"));
        assertFalse(mapa.containsKey("clave3"));
    }
}

