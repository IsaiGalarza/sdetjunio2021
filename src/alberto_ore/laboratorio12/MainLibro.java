package alberto_ore.laboratorio12;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainLibro {

	public static void main(String[] args) {

		ArrayList<Libro> libro = new ArrayList<Libro>();
		libro.add(new Libro(102, "La Odisea", 12));
		libro.add(new Libro(103, "La Iliada", 14));
		libro.add(new Libro(104, "La Libertad", 16));

		System.out.println("Leer libros hacia adelante\n");

		ListIterator<Libro> itr = libro.listIterator();
		while (itr.hasNext()) {
			Libro est = (Libro) itr.next();
			System.out.println(est.num + " " + est.nombre + " " + est.precio);
		}

		System.out.println("\nLeer libros hacia atrás\n");

		while (itr.hasPrevious()) {
			Libro est = (Libro) itr.previous();
			System.out.println(est.num + " " + est.nombre + " " + est.precio);
		}
		
	}

}
