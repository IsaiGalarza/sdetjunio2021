package cynthia_urbano.laboratorio14;

import java.util.Enumeration;
import java.util.Hashtable;

//Eliminar el par llave-valor de una HashTable
public class Ejercicio3 {

	public static void main(String[] args) {
		String eliminar;
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(1, "Alan");
		hashTable.put(2, "Cynthia");
		hashTable.put(3, "Brenda");
		hashTable.put(4, "Oliva");
		hashTable.put(5, "Armando");

		Enumeration<Integer> num = hashTable.keys();


			int key = num.nextElement();
			System.out.println("La tabla es: \n" +hashTable);
			
			eliminar = (String)hashTable.remove(5);
			
			System.out.println("-----------------------------");
			System.out.println("La tabla despues de eliminar es:-" +eliminar);
			System.out.println("\nLa tabla despues de eliminar dato anterior es: \n" +hashTable);
		
	}

}
