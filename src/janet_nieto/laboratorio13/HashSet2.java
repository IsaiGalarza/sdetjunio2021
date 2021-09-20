package janet_nieto.laboratorio13;
//2.Obtener el tamaño de un HashSet 

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {		
		
		Estudiante objEstudiante1 = new Estudiante(1, "JUAN PEREZ", 18, "M");
		Estudiante objEstudiante2 = new Estudiante(2, "CALOS DAMIAN", 19, "M");
		Estudiante objEstudiante3 = new Estudiante(3, "PEDRO SUAREZ", 20, "M");
		
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(objEstudiante1);
		listaEstudiantes.add(objEstudiante2);
		listaEstudiantes.add(objEstudiante3);
		
	
		HashSet<Estudiante> setEstudiante = new HashSet<>(listaEstudiantes);
		
		for (Estudiante temp : setEstudiante) {
			System.out.println("Estudiante: " + temp.toString());
		}
		
		System.out.println("Size: " + setEstudiante.size());
		
		
	}

}
