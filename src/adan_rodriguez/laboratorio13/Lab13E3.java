package adan_rodriguez.laboratorio13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Lab13E3 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		LinkedHashSet<String> listaNombre = new LinkedHashSet<>();

		listaNombre.add("JUAN");
		listaNombre.add("PEDRO");
		listaNombre.add("CARLOS");
		listaNombre.add("ADAN");
		
		try {
			System.out.println("Inserta un valor para buscar en la lista");
			String buscarElemento = read.next();

			System.out.println("Existe: " + listaNombre.contains(buscarElemento.toUpperCase()));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		read.close();
	}
}
