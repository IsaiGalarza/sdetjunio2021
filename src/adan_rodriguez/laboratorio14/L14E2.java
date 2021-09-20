package adan_rodriguez.laboratorio14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class L14E2 {

	public static void main(String[] args) {

		Hashtable<Integer, String> htPaises = new Hashtable<>();
		htPaises.put(1, "ARGENTINA");
		htPaises.put(2, "PERU");
		htPaises.put(3, "BOLIVIA");
		htPaises.put(0, "ARGELIA");
		htPaises.put(100, "ESPAÑA");

		System.out.println("-------------------------");

		// iterar
		Set<Integer> llaves = htPaises.keySet();

		Iterator<Integer> it = llaves.iterator();
		Integer key = 0;

		while (it.hasNext()) {
			key = it.next();
			System.out.println("Llave: " + key + " Valor: " + htPaises.get(key).toString());
		}

	}

}
