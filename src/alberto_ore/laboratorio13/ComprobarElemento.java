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
			System.out.println("D�as: " + temp);

		}

		System.out.println("�Se encuentra el d�a Lunes?");
		if (listaDias.contains("Lunes")) {

			System.out.println("S� est� el d�a Lunes");
		} else {
			System.out.println("No est� el d�a Lunes");

		}

	}

}
