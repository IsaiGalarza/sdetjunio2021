package adan_rodriguez.laboratorio12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class L12E3 {

	public static void main(String[] args) {
		
		List<String> listaLibros = new ArrayList<>();
		listaLibros.add("HP 1");
		listaLibros.add("HP 5");
		listaLibros.add("HP 7");
		listaLibros.add("HP 2");
		
		
		ListIterator<String> li = listaLibros.listIterator();
		System.out.println("--------------- navegar hacia adelante-------------------");
		while(li.hasNext()) {
			System.out.println("Pais Li: " + li.next());
		}
		
		for (String libro : listaLibros) {
			System.out.println(libro);
		}
		
		System.out.println("--------------- navegar hacia atras-------------------");
		while(li.hasPrevious()) {
			System.out.println("Pais Li: " + li.previous());
		}
		
	}

}
