package alberto_ore.laboratorio13;

import java.util.HashSet;
import java.util.Set;

public class TamañoHashSet {

	public static void main(String[] args) {

		Set<String> listaCiudades = new HashSet<String>();
		listaCiudades.add("Lima");
		listaCiudades.add("Piura");
		listaCiudades.add("Arequipa");
		listaCiudades.add("Arequipa");

		for (String temp : listaCiudades) {
			System.out.println("Ciudades: " + temp);

		}

		System.out.println("Tamaño de HashSet: " + listaCiudades.size());

	}

}
