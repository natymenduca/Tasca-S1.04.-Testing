package s104_n1Ex1_JUnit_Posicion_8Agosto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MesesAnio {
	    /*Crea una clase llamada "MesesDelAnio" que contenga un método "insertarMeses()" que inserte los nombres de los meses
	    del año en una lista ordenada*/
	    public List<String> insertarMeses() {
	        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
	                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	        List<String> listaMeses = new ArrayList<>(Arrays.asList(meses));
	        return listaMeses;
	    }

	    @Test
	    public void pruebaTamanoLista() { //método de prueba llamado "pruebaTamanoLista()" que verifique que la lista tiene 12 posiciones
	        List<String> listaMeses = insertarMeses();
	        Assertions.assertEquals(12, listaMeses.size());
	    }

	    @Test
	    public void pruebaNoEsNula() { //un método de prueba llamado "pruebaNoEsNula()" que verifique que la lista no es nula
	        List<String> listaMeses = insertarMeses();
	        Assertions.assertNotNull(listaMeses);
	    }

	    @Test
	    public void pruebaAgosto() { // un método de prueba llamado "pruebaAgosto()" que verifique que en la posición 8 de la lista se encuentra el mes de agosto
	        List<String> listaMeses = insertarMeses();
	        Assertions.assertEquals("agosto", listaMeses.get(7));
	    }
}

