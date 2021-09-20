package cynthia_urbano.laboratorio14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int key;
		Map<Integer, String> idNombre = new HashMap<Integer, String>() {
			{
				put(1, "Anali");
				put(2, "Alan");
				put(3, "Brenda");
				put(4, "Oliva");
				put(5, "Nahomi");
			}
		};
		System.out.println("Mapa:  " + idNombre);

		System.out.println("\nIngrese el id del nombre a buscar:");
		key= sc.nextInt();
		
		if (idNombre.containsKey(key)) {
			System.out.println("\nLa llave existe en el mapa.");
		} else {
			System.out.println("\nLos datos ingresados no se encuentran...");

		}
	}
}
