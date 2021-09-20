//Eliminar el par llave-valor de una HashTable

package anais_pinpingos.laboratorio14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class EliminarLLaveValor {

	static Hashtable<Integer, String> htPaises = new Hashtable<>();
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		EliminarLLaveValor objEliminar = new EliminarLLaveValor();
		
		int llaveBorrar;
				
		htPaises.put(1, "ARGENTINA");
		htPaises.put(2, "BOLIVIA");
		htPaises.put(3, "PERU");
		htPaises.put(4, "MEXICO");
		htPaises.put(5, "BRAZIL");
		htPaises.put(6, "ECUADOR");
		htPaises.put(7, "VENEZUELA");
		
		System.out.println("HASHTABLE  DE  PAISES");
		System.out.println("---------------------");
		objEliminar.imprimir();
			
		System.out.print("\n");
		System.out.println("Ingrese llave del elemento a eliminar:");
		llaveBorrar = Integer.parseInt(entrada.nextLine());
		
		if(htPaises.containsKey(llaveBorrar)) {
			htPaises.remove(llaveBorrar);
			System.out.println("Elemento eliminado.......");
			System.out.print("\n");
			System.out.println("HASHTABLE   DE  PAISES ACTUALIZADA");
			System.out.println("----------------------------------");
			objEliminar.imprimir();
			
		}else{
			System.out.print("No existe elemento con la llave especificada.");
		}
		
	}
	
	public void imprimir() {
		
		Set<Integer> llaves = htPaises.keySet();
		Iterator<Integer> it = llaves.iterator();
		Integer key = 0;
		while(it.hasNext()) {
			key = it.next();
			System.out.println("Llave: " + key + " , Valor: " + htPaises.get(key).toString());
		}
	}
	
}
