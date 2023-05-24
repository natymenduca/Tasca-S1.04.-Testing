package s104_n1Ex2_JUnit_DNI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

  public class CalculoDniTest {
	
	private int dni;
    private char letra;

    public CalculoDniTest(int dni, char letra) {
        this.setDni(dni);
        this.setLetra(letra);
    }
    public int getDni() {
		return dni;
	}
	public char getLetra() {
		return letra;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	@Test
	@Parameters(name = "getData")
	public void CalcularLetraDni(int numeroDni, char letraEsperada) {
		assertEquals(letraEsperada, CalculaDNI.calcularLetraDni(numeroDni));
	}
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			{ 12345678, 'Z' }, 
			{ 87654321, 'S' },
			{ 98765432, 'T' },
			{ 34567890, 'R' },
			{ 19876543, 'W' },
			{ 29384756, 'A' },
			{ 12398764, 'G' },
			{ 91823746, 'M' },
			{ 67583392, 'Y' },
			{ 65432178, 'F' }
		};
		return Arrays.asList(data);
	}
	@Test
    public void testCalcularLetraDni() {
	    for (Object[] datos : data()) {
	        int dni = (int) datos[0];
	        char letra = (char) datos[1];
	        assertEquals(letra, CalculaDNI.calcularLetraDni(dni));
	    }
   }
}





