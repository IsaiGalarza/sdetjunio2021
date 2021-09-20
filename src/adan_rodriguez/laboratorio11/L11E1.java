package adan_rodriguez.laboratorio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L11E1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		List<String> listaIdiomas = new ArrayList<>();

		listaIdiomas.add("Español"); // 0
		listaIdiomas.add("Inglés"); // 1
		listaIdiomas.add("Aleman"); // 2
		listaIdiomas.add("Francés"); // 3

		for (String temp : listaIdiomas) {
			System.out.println("Idiomas: " + temp);
		}

		System.out.println("-----------------------------");

		System.out.println("Inserta un valor para la lista");
		listaIdiomas.add(read.next());

		int s = listaIdiomas.size() - 1;

		// Busca r elemento por indice
		System.out.println("Index Ultimo valor ingresado: " + s);

		// BUSCAR ELEMENTO POR INDICE
		System.out.println("Indice " + s + ": " + listaIdiomas.get(s));

		for (String temp : listaIdiomas) {
			System.out.println("Idiomas: " + temp);
		}
		
		read.close();
	}

}
