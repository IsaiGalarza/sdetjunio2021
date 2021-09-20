package alberto_ore.laboratorio14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LlaveHashMaps {

	public static void main(String[] args) {

		Map<Integer, String> jugadores = new HashMap<Integer, String>();
		jugadores.put(4, "Gonzales");
		jugadores.put(2, "Ore");
		jugadores.put(1, "Romero");

		Iterator<Integer> it = jugadores.keySet().iterator();
		while (it.hasNext()) {
			Integer llave = (Integer) it.next();
			if (llave.equals(2)) {
				System.out.println("Clave: " + llave + " Valor: " + jugadores.get(llave));
			}

		}

	}

}
