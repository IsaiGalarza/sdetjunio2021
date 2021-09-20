package adan_rodriguez.laboratorio13;

import java.util.HashSet;

public class Lab13E1 {

	public static void main(String[] args) {
		HashSet<String> listaNombre = new HashSet<>();

		listaNombre.add("JUAN");
		listaNombre.add("PEDRO");
		listaNombre.add("CARLOS");
		listaNombre.add("ADAN");

		for (String temp : listaNombre) {
			System.out.println("nombres " + temp);
		}

	}

}
