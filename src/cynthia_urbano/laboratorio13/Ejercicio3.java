package cynthia_urbano.laboratorio13;

import java.util.LinkedHashSet;

//Comprueba si existe un elemento en particular en un LinkedHashSet

public class Ejercicio3 {

	public static void main(String[] args) {

		LinkedHashSet<String> lhsAnimal = new LinkedHashSet<String>();

		lhsAnimal.add("Leon");
		lhsAnimal.add("Tortuga");
		lhsAnimal.add("Pollo");

		System.out.println(lhsAnimal.contains("Tortuga"));

		System.out.println(lhsAnimal.contains("Elefante"));
	}

}
