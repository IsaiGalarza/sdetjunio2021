package adan_rodriguez.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;

public class L12E2 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona(1, "Bety", 185));
		listaPersonas.add(new Persona(2, "Elena", 190));
		listaPersonas.add(new Persona(3, "Lupe", 170));

		Collections.sort(listaPersonas);

		System.out.println("Personas Ordenadas por orden natural: " + listaPersonas);

		Collections.sort(listaPersonas, new OrdenarPersonaPorAltura());
		System.out.println("Personas Ordenadas por orden total: " + listaPersonas);

	}

}
