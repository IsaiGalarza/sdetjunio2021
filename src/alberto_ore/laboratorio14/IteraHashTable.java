package alberto_ore.laboratorio14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class IteraHashTable {

	public static void main(String[] args) {

		Map<Integer, String> jugadores = new Hashtable<Integer, String>();
		jugadores.put(2, "Alberto");
		jugadores.put(3, "Pedro");
		jugadores.put(5, "Juan");

		Iterator<Integer> it = jugadores.keySet().iterator();
		while (it.hasNext()) {
			Integer llave = (Integer) it.next();
			System.out.println("Clave: " + llave + " Valor: " + jugadores.get(llave));

		}

	}

}
