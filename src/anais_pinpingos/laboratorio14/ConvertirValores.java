//Convertir valores de una Map a una lista

package anais_pinpingos.laboratorio14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertirValores {

	public static void main(String[] args) {

		HashMap<Integer, String> hmColores = new HashMap<>();
		
		hmColores.put(0, "BLANCO");
		hmColores.put(2, "AZUL");
		hmColores.put(3, "AMARAILLO");
		hmColores.put(4, "MORADO");
		hmColores.put(6, "ESMERALDA");
		hmColores.put(7, "ANARANJADO");
		hmColores.put(5, "PLOMO");
		hmColores.put(1, "NEGRO");
		
		System.out.println("HASHMAP DE COLORES");
		System.out.println("-------------------");
		
		System.out.println(hmColores);
		
		List<String> listValues = new ArrayList<String>(hmColores.values()); //llaves del map a lista
		System.out.print("\n");
		System.out.println("VALORES DEL MAP a LISTA");
		System.out.println("------------------------");
		for (String temp : listValues) {
			System.out.println(temp);
		}
		
		
	}
	
}
