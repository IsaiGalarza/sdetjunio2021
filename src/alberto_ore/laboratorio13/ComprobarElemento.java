package alberto_ore.laboratorio13;

import java.util.LinkedHashSet;
import java.util.Set;

public class ComprobarElemento {
	public static void main(String[] args) {

		Set<String> listaDias = new LinkedHashSet<String>();
		listaDias.add("Lunes");
		listaDias.add("Martes");
		listaDias.add("Miercoles");
		listaDias.add("Jueves");
		listaDias.add("Jueves");
		listaDias.add(null);

		for (String temp : listaDias) {
			System.out.println("Días: " + temp);

		}

		System.out.println("¿Se encuentra el día Lunes?");
		if (listaDias.contains("Lunes")) {

			System.out.println("Sí está el día Lunes");
		} else {
			System.out.println("No está el día Lunes");

		}

	}

}
