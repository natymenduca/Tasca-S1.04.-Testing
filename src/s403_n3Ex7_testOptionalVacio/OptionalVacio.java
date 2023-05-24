package s403_n3Ex7_testOptionalVacio;

import static org.junit.Assert.assertFalse;

import java.util.Optional;

import org.junit.Test;

public class OptionalVacio {
	//Contiene los metodos de prueba que verifican el uso de objetos Optional
	 @Test
	    public void testOptionalEmpty() {
	        Optional<Object> opt = Optional.empty();

	        // Verificar si el Optional está vacío
	        assertFalse(opt.isPresent());
	    }

}
