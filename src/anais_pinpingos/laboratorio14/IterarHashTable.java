//Iterar a travez de llavez de una HasTble

package anais_pinpingos.laboratorio14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

	public class IterarHashTable {

		public static void main(String[] args) {
			
		Hashtable<Integer, String> htNombres = new Hashtable<>();
		
		htNombres.put(1,"MARIA");
		htNombres.put(2,"JOSE");
		htNombres.put(3,"FELIPE");
		htNombres.put(54,"ANGELA");
		htNombres.put(5,"MIRIAM");
		htNombres.put(6, "ARIANA");
		htNombres.put(7,"ESTEBAN");
		
		System.out.println("HASTABLE NOMBRES");
		System.out.println("----------------");
		System.out.println(htNombres);
		System.out.println("\n");
		
		System.out.println("ITERAR HASTABLE NOMBRES");
		System.out.println("-----------------------");
		
		Set<Integer> llaves = htNombres.keySet();
		Iterator<Integer> it = llaves.iterator();
		Integer key = 0;
		while(it.hasNext()) {
			key = it.next();
			System.out.println("Llave: " + key + " , Valor: " + htNombres.get(key).toString());
		}
		
		
		
	}
	
	
}
