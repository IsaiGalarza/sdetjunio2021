package alberto_ore.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnirListas {

	public static void main(String[] args) {

		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Alberto");
		listaNombres.add("Pablo");
		listaNombres.add("Jorge");
		listaNombres.add("Diego");

		String[] colecionAdicional = { "JUAN", "PEDRO", "ZILA", "ADAN" };
		Collections.addAll(listaNombres, colecionAdicional);

		for (String nombre : listaNombres) {
			System.out.println(nombre);
		}

	}
}
