package alberto_ore.laboratorio13;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ValorAltoBajo {

	public static void main(String[] args) {

		Set<String> listaNombres = new TreeSet<String>();
		listaNombres.add("Alberto");
		listaNombres.add("Mario");
		listaNombres.add("Pedro");
		listaNombres.add("Jose");

		for (String temp : listaNombres) {
			System.out.println("Los nombres son: " + temp);

		}

		System.out.println("El último nombre: " + Collections.max(listaNombres));
		System.out.println("El primer nombre: " + Collections.min(listaNombres));

	}

}
