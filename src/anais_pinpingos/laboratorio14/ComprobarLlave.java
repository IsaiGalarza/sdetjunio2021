//Compruebe que existe una llave en particular en HashMasp

package anais_pinpingos.laboratorio14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ComprobarLlave {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<Integer, String> hmColores = new HashMap<>();
		int clave;
		
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
		
		Set<Integer> llaves = hmColores.keySet();
		
		Iterator<Integer> itera = llaves.iterator();
		Integer key = 0;
		while(itera.hasNext()) {
			key = itera.next();
			System.out.println("Llave: " + key + " , Valor: " + hmColores.get(key));
		}
		
		System.out.print("\n");
		System.out.println("Ingrese un LLAVE a verificar su existencia:");
		clave = Integer.parseInt(entrada.nextLine());	
			
			if(hmColores .containsKey(clave)) {
				System.out.print("La llave " + clave + " SI se encuentra enter las llaves ");
				System.out.println(llaves);
			}else {
				System.out.print("La llave " + clave + " NO se encuentra entre las llaves ");
				System.out.println(llaves);
			}
			
	}

}
