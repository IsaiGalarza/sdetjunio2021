package alberto_ore.laboratorio12_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Simple {

	public static void main(String[] args) {

		ArrayList lista1 = new ArrayList();
		lista1.add(new Estudiante(102, "María", 23));
		lista1.add(new Estudiante(104, "Jorge", 29));
		lista1.add(new Estudiante(110, "Juan", 24));

		System.out.println("Por nombres\n");

		Collections.sort(lista1, new NombreComparator());
		Iterator itr = lista1.iterator();
		while (itr.hasNext()) {
			Estudiante est = (Estudiante) itr.next();
			System.out.println(est.num + " " + est.nombre + " " + est.edad);
		}

		System.out.println("\nPor edad\n");

		Collections.sort(lista1, new EdadComparator());
		Iterator itr2 = lista1.iterator();
		while (itr2.hasNext()) {
			Estudiante est = (Estudiante) itr2.next();
			System.out.println(est.num + " " + est.nombre + " " + est.edad);
		}

	}

}
