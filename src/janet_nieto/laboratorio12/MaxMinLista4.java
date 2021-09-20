package janet_nieto.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Encontrar el maximo y minimo de una lista usando la clase Collections ok
public class MaxMinLista4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> listaEdades = new ArrayList<>();
		listaEdades.add(35);
		listaEdades.add(20);
		listaEdades.add(50);
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
