package cynthia_urbano.laboratorio14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Convertir valores de una Map a una Lista

public class Ejercicio4 {

	public static void main(String[] args) {
		
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
		
		ArrayList<Integer> id = new ArrayList<Integer>(idNombre.keySet());
	      ArrayList<String> nombre = new ArrayList<String>(idNombre.values());

	      System.out.println("\nId´s del mapa en un arreglo:" + id);
	      System.out.println("Nombres del mapa en un arreglo:" + nombre);
	}

}
