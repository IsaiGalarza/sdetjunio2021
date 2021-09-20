package alberto_ore.laboratorio14;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ImprimirNodos {

	public static void main(String[] args) {

		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "Gonzales");
		linkedHashMap.put(3, "Ramirez");
		linkedHashMap.put(2, "Perez");

		Iterator<Integer> it1 = linkedHashMap.keySet().iterator();
		while (it1.hasNext()) {
			Integer key = (Integer) it1.next();
			System.out.println("Clave: " + key + " Valor: " + linkedHashMap.get(key));
		}

	}

}
