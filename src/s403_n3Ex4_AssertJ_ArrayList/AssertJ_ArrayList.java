package s403_n3Ex4_AssertJ_ArrayList;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class AssertJ_ArrayList {
	    //Contiene los métodos de prueba que verifican el orden y la frecuencia de elementos en una lista
        @Test
	    public void testOrden() {
	        ArrayList<String> lista = new ArrayList<>();
	        lista.add("hey");
	        lista.add("you");
	        assertEquals("hey", lista.get(0));
	        assertEquals("you", lista.get(1));
	    }

	    @Test
	    public void testFrecuencia() {
	        ArrayList<String> lista = new ArrayList<>();
	        lista.add("hey");
	        lista.add("hey");
	        lista.add("you");
	        assertEquals(2, lista.lastIndexOf("hey") - lista.indexOf("hey"));
	        assertEquals(1, lista.lastIndexOf("you") - lista.indexOf("you"));
	    }
	}

