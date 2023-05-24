package s403_n3Ex2_AssertJ_Obj_Referencia;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayTest {
	// Contiene los métodos de prueba que verifican la igualdad de arreglos
	@Test
	    public void testIgualdad() {
	        String[] array1 = {"hey", "you"};
	        String[] array2 = {"hey", "you"};
	        assertArrayEquals(array1, array2);
	    }
	}

