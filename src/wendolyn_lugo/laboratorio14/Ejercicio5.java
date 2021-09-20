/**
 * 
 */
package wendolyn_lugo.laboratorio14;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author wendolyn.lugo
 * Iterar e imprimir los nodos de un LinkedHash
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lhmAnimales = new LinkedHashMap<>();
		lhmAnimales.put(1, "GATO");
		lhmAnimales.put(2, "PERRO");
		lhmAnimales.put(3, "PEZ");
		lhmAnimales.put(4, "LAGARTIJA");
		
		//ITERAR E IMPRIMIR LOS NODOS DE UN LINKEDHASHMAP
		Set<Integer> llaves = lhmAnimales.keySet();
		Iterator<Integer> it = llaves.iterator();
		Integer key = 0;
		while(it.hasNext()) {
			key = it.next();
			if(key != null) {
				String aux = lhmAnimales.get(key);
				if(aux != null) {
					System.out.println("Llave: " + key + ", Valor: " + aux);
				}else {
					System.out.println("null");
				}
				
			}
			
		}
	}

}
