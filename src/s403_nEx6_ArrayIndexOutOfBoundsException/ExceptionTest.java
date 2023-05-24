package s403_nEx6_ArrayIndexOutOfBoundsException;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ExceptionTest {
	// Contiene los métodos de prueba que verifican el lanzamiento de excepciones
    @Test
    public void testArrayIndexOutOfBoundsException() {
        int[] arr = {1, 2, 3};

        // Verificar si se lanza una excepción al acceder a un índice que no existe
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int x = arr[3];
        });
    }

}
