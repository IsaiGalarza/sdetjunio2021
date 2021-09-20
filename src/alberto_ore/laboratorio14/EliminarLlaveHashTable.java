package alberto_ore.laboratorio14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class EliminarLlaveHashTable {

	public static void main(String[] args) {

		Map<Integer, String> jugadores = new Hashtable<Integer, String>();
		jugadores.put(2, "Juana");
		jugadores.put(4, "Maria");
		jugadores.put(8, "Luz");
		System.out.println("Longitud antes de eliminar: " + jugadores.size());
		Iterator<Integer> it1 = jugadores.keySet().iterator();

		while (it1.hasNext()) {
			Integer llave = (Integer) it1.next();
			System.out.println("Clave: " + llave + " Valor: " + jugadores.get(llave));

		}

		System.out.println("Eliminando un elemento: Clave 2");

		jugadores.remove(2);
		System.out.println("Longitud después de eliminar: " + jugadores.size());

		Iterator<Integer> it2 = jugadores.keySet().iterator();

		while (it2.hasNext()) {
			Integer llave = (Integer) it2.next();
			System.out.println("Clave: " + llave + " Valor: " + jugadores.get(llave));

		}

	}

}
