package cynthia_urbano.laboratorio14;

import java.util.Enumeration;
import java.util.Hashtable;

//Iterrar a traves de llaves de una hashTable
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();

		hashTable.put(1, "Alan");
		hashTable.put(2, "Cynthia");
		hashTable.put(3, "Brenda");
		hashTable.put(4, "Oliva");
		hashTable.put(5, "Armando");

		Enumeration<Integer> num = hashTable.keys();

		while (num.hasMoreElements()) {

			int key = num.nextElement();

			System.out.println("ID: " + key + "    Nombre: " + hashTable.get(key));
		}
	}

}
