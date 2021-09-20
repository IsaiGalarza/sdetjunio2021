package janet_nieto.laboratorio14;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//4.Convertir valores de una Map a una Lista
public class Map4 {

		public static void main(String[] args) {
	
			
			System.out.println("----------------------------------------------------------------------------------------------");
			///////////////////////////////////////////////////////////////////////////////////////////////////
			
			Estudiante objEstudiante1 = new Estudiante(1, "JUAN PEREZ", 18, "M");
			Estudiante objEstudiante2 = new Estudiante(2, "CALOS DAMIAN", 19, "M");
			Estudiante objEstudiante3 = new Estudiante(3, "PEDRO SUAREZ", 20, "M");
			
			Map<Integer, Estudiante> hmEstudiantes = new HashMap<>();
			hmEstudiantes.put(1, objEstudiante1);
			hmEstudiantes.put(2, objEstudiante2);
			hmEstudiantes.put(3, objEstudiante3);
			
			System.out.println(hmEstudiantes);
			
			System.out.println("-------------------------------------- MAP TO LIST ------------------------");
			//MAP TO LIST
			ArrayList<Integer> listKey = new ArrayList<Integer>(hmEstudiantes.keySet());
			ArrayList<Estudiante> listValues = new ArrayList<Estudiante>(hmEstudiantes.values());
			
			for (Estudiante temp : listValues) {
				System.out.println(temp.toString());
			}
			
			
		}

	}
