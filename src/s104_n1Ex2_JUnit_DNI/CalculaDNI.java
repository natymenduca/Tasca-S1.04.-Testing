package s104_n1Ex2_JUnit_DNI;

public class CalculaDNI {
	    
	public static char calcularLetraDni(int dni) { 
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23; 
        return letras.charAt(resto);
    }
}


	
	


