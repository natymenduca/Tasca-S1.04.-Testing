package s104_n1Ex1_JUnit_Posicion_8Agosto;

import java.util.Arrays;
import java.util.List;

public class s104_n1Ex1_jUnit_Posicion_AGOSTO {

	public static void main(String[] args) {
		List<String> listaMeses = insertarMeses();
        if (listaMeses.size() == 12 && listaMeses.get(7).equals("agosto")) {
            System.out.println("La lista tiene 12 posiciones y en la posición 8 se encuentra el mes de agosto.");
        } else {
            System.out.println("La lista no tiene 12 posiciones o en la posición 8 no se encuentra el mes de agosto.");
        }
    }

    public static List<String> insertarMeses() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        List<String> listaMeses = Arrays.asList(meses);
        return listaMeses;
    }

}


