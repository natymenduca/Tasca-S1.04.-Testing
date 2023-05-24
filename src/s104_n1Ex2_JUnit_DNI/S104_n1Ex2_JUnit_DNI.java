package s104_n1Ex2_JUnit_DNI;

public class S104_n1Ex2_JUnit_DNI {

	public static void main(String[] args) {
		 CalculaDNI numDNI = new CalculaDNI();
	        int dni = 12345678;
	        char letra = CalculaDNI.calcularLetraDni(dni);
	        System.out.println("La letra del DNI " + dni + " es " + letra);
	    }
}


