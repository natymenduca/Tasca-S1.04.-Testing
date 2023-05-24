package s401_n3Ex3_AssertJ_ArrayEnteros;

import org.junit.Test;

public class AssertJ_ArrayEnteros {
	// Contiene los métodos de prueba que verifican la igualdad y la referencia de objetos
	 @Test
	    public void testIgualdad() {
	        String[] array1 = {"hey", "you"};
	        String[] array2 = {"hey", "you"};
	        assertArrayEquals(array1, array2);
	    }

	private void assertArrayEquals(String[] array1, String[] array2) {
		// TODO Auto-generated method stub
		
	}
}

