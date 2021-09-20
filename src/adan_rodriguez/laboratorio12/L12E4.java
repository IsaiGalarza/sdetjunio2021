package adan_rodriguez.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L12E4 {

	public static void main(String[] args) {
		List<Integer> listaEdades = new ArrayList<>();
		listaEdades.add(90);
		listaEdades.add(60);
		listaEdades.add(2);
		listaEdades.add(18);

		for (Integer edad : listaEdades) {
			System.out.println(edad);
		}

		System.out.println("----------------------------------------------------------------");
		System.out.println("La edad maxima es: " + Collections.max(listaEdades));
		System.out.println("La edad minima es: " + Collections.min(listaEdades));
		System.out.println("----------------------------------------------------------------");

		
	}

}
