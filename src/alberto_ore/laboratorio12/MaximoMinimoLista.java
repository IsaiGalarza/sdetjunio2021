package alberto_ore.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximoMinimoLista {

	public static void main(String[] args) {

		List<Integer> listaEdades = new ArrayList<>();

		listaEdades.add(95);
		listaEdades.add(50);
		listaEdades.add(90);
		listaEdades.add(77);

		for (Integer edad : listaEdades) {
			System.out.println("Edad: " + edad);
		}

		System.out.println("----------------------------------------------------------------");
		System.out.println("La edad máxima es: " + Collections.max(listaEdades));
		System.out.println("La edad mínima es: " + Collections.min(listaEdades));
		System.out.println("----------------------------------------------------------------");

	}

}
