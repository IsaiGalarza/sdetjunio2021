package cynthia_urbano.laboratorio14;

import java.util.LinkedHashMap;
import java.util.Set;

//Iterar e imprimir los nodos de in LinkedHashMap
public class Ejercicio5 {

	public static void main(String[] args) {

		LinkedHashMap<String, String> lhsAnimal = new LinkedHashMap<String, String>();

		lhsAnimal.put("Uno", "Leon");
		lhsAnimal.put("Dos", "Tortuga");
		lhsAnimal.put("Tres", "TPollo");

		Set<String> keys = lhsAnimal.keySet();
		
		System.out.println( "-----Los elementos del LinkedHashMap son: -----" );

		for (String key : keys) {
			System.out.println(key + " -- " + lhsAnimal.get(key));

		}

	}

}
