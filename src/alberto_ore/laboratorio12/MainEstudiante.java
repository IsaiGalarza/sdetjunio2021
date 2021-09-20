package alberto_ore.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;

public class MainEstudiante {

	public static void main(String[] args) {

		ArrayList<Estudiante> listaNombres = new ArrayList<Estudiante>();
		listaNombres.add(new Estudiante(101, "Alberto", 23));
		listaNombres.add(new Estudiante(102, "Pedro", 25));
		listaNombres.add(new Estudiante(103, "Juan", 26));

		Collections.sort(listaNombres);
		for (Estudiante e : listaNombres) {

			System.out.println(e.num + " " + e.nombre + " " + e.edad);
		}

	}

}
