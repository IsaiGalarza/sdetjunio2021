package cynthia_urbano.laboratorio12;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Añadir libros a una Lista y luego, leer la lista de libros usando ListIterator, en ambas direcciones hacia atrás y adelante
public class Ejercicio3 {

public static void main(String[] args) {
		
		List<String> miListaLibros = new LinkedList<>();
		
		miListaLibros.add("Libro1");
		miListaLibros.add("Libro2");
		miListaLibros.add("Libro3");
		miListaLibros.add("Libro4");
		miListaLibros.add("Libro5");
		miListaLibros.add("Libro6");
		miListaLibros.add("Libro7");
		
		ListIterator<String> li = miListaLibros.listIterator();
		System.out.println("--------------- navegar hacia adelante-------------------");
		while(li.hasNext()) {
			System.out.println("Libro: " + li.next());
		}
		li.add("Libro8");
		li.add("Libro9");
		
		for (String libro : miListaLibros) {
			System.out.println(libro);
		}
		System.out.println("--------------- navegar hacia atras-------------------");
		while(li.hasPrevious()) {
			System.out.println("Pais Li: " + li.previous());
		}
}}
