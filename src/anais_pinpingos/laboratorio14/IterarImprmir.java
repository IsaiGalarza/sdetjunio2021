//Iterar e imprimir los nodos de un LinkedHashMap

package anais_pinpingos.laboratorio14;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class IterarImprmir {

	
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhmAnimales = new LinkedHashMap<>();
		
		lhmAnimales.put(0, "LORO");
		lhmAnimales.put(2, "ASNO");
		lhmAnimales.put(3, "ARMADILLO");
		lhmAnimales.put(4, "MONO");
		lhmAnimales.put(6, "ELEFANTE");
		lhmAnimales.put(7, "ARAÑA");
		lhmAnimales.put(5, "PERRO");
		lhmAnimales.put(1, "NUTRIA");
		
		System.out.println("LINKEDHASHMAP DE ANIMALES");
		System.out.println("-------------------------");
		System.out.println(lhmAnimales);
		System.out.print("\n");

		System.out.println("ITERACION E IMPRESION DE LINKEDHASHMAP DE ANIMALES");
		System.out.println("---------------------------------------------------");
		Set<Integer> llaves = lhmAnimales.keySet();
		Iterator<Integer> it = llaves.iterator();
		Integer key = 0;
		while(it.hasNext()) {
			key = it.next();
			if(key != null) {
				String aux = lhmAnimales.get(key);
				if(aux != null) {
					System.out.println("Llave: " + key + " , Valor: " + aux);
				}else {
					System.out.println("null");
				}
				
			}
			
		}
		
		
		
	}
	
}
