package adan_rodriguez.laboratorio14;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class L14E5 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhmPaises = new LinkedHashMap<>();
		lhmPaises.put(1, "ARGENTINA");
		lhmPaises.put(2, "BOLIVIA");
		lhmPaises.put(3, "PERU");
		lhmPaises.put(4, "MEXICO");

		// iterar
		Set<Integer> llaves = lhmPaises.keySet();

		Iterator<Integer> it = llaves.iterator();
		Integer key = 0;

		while (it.hasNext()) {
			key = it.next();
			if (key != null) {
				String aux = lhmPaises.get(key);
				if (aux != null) {
					System.out.println("Llave: " + key + " Valor: " + aux);
				} else {
					System.out.println("null");
				}

			}

		}
	}

}
