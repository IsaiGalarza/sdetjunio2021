package cynthia_urbano.laboratorio11;

import java.util.ArrayList;
import java.util.Arrays;

//Reemplaza un elemento en el índice especificado en una ArrayList
public class Ejercicio2 {
	public static void main(String[] args) {

		ArrayList<String> listaNombres = new ArrayList<String>(Arrays.asList("Oliva", "Brenda", "Alan"));

		System.out.println("Lista inicial");
		System.out.println(listaNombres);

		System.out.println("Reemplaza un indice...");
		listaNombres.set(2, "Alancito");
		System.out.println("Lista final");
		System.out.println(listaNombres);
	}

}
