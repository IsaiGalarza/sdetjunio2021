package janet_nieto.laboratorio14;
//5.Iterar e imprimir los nodos de un LinkedHashMap
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap5 {


		public static void main(String[] args) {
			
			LinkedHashMap<Integer, String> lhmPaises = new LinkedHashMap<>();
			lhmPaises.put(1, "ARGENTINA");
			lhmPaises.put(2, "BOLIVIA");
			lhmPaises.put(3, "PERU");
			lhmPaises.put(4, "MEXICO");
			
			//mantiene el orden de insercion
			//System.out.println(lhmPaises);
			
			System.out.println("------------------------------Listar  nodos -------------------------");
			//ITERAR E IMPRIMIR LOS NODOS DE UN LINKEDHASHMAP
			Set<Integer> llaves = lhmPaises.keySet();
			Iterator<Integer> it = llaves.iterator();
			Integer key = 0;
			while(it.hasNext()) {
				key = it.next();
				if(key != null) {
					String aux = lhmPaises.get(key);
					if(aux != null) {
						System.out.println("Llave: " + key + " , Valor: " + aux);
					}else {
						System.out.println("null");
					}
					
				}
				
			}
			
		}

	}
