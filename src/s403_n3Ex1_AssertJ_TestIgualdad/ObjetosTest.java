package s403_n3Ex1_AssertJ_TestIgualdad;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class ObjetosTest {
	// Contiene los métodos de prueba que verifican la igualdad y la referencia de objetos
	@Test
	public void testObjIgualdad() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		assertEquals(obj1, obj2); // Verificar si obj1 y obj2 son iguales
	}
	@Test
	public void testObjReferencia() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertNotSame(obj1, obj2); //Verificar si obj1 y obj2 no son iguales
	}
}
