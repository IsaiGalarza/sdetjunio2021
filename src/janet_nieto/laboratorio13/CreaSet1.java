package janet_nieto.laboratorio13;
//1.Crea un set e inserta y recupera los valores 

import java.util.ArrayList;
import java.util.TreeSet;

public class CreaSet1 {

	public static void main(String[] args) {

			Estudiante objEstudiante1 = new Estudiante(1, "CARLOS DAMIAN", 18, "M");
			Estudiante objEstudiante2 = new Estudiante(2, "JUAN PEREZ", 19, "M");
			Estudiante objEstudiante3 = new Estudiante(3, "PEDRO SUAREZ", 20, "M");

			ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
			listaEstudiantes.add(objEstudiante1);
			listaEstudiantes.add(objEstudiante2);
			listaEstudiantes.add(objEstudiante3);

			TreeSet<Estudiante> tsetEstudiante = new TreeSet<>(listaEstudiantes);

			for (Estudiante temp : tsetEstudiante) {
				if (temp != null) {
					System.out.println(temp.toString());
				} else {
					System.out.println(temp);
				}
			}

		}

	}
