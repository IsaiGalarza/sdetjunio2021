package adan_rodriguez.laboratorio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L11E3 {
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
		
		try {
			System.out.println("Inserta un valor para buscar en la lista");
			String buscarElemento=read.next();
			
			System.out.println("Existe: " + listaIdiomas.contains(buscarElemento));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		read.close();
	}

}
