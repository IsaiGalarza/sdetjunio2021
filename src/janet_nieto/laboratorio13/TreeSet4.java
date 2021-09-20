package janet_nieto.laboratorio13;
//4.Obtener el valor mas bajo y mas alto guardado en un TreeSet
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;


public class TreeSet4 {

	public static void main(String[] args) {

		Estudiante objEstudiante1 = new Estudiante(1, "CARLOS DAMIAN", 18, "M");
		Estudiante objEstudiante2 = new Estudiante(2, "JUAN PEREZ", 19, "M");
		Estudiante objEstudiante3 = new Estudiante(3, "PEDRO SUAREZ", 20, "M");

		ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
		listaEstudiantes.add(objEstudiante1);
		listaEstudiantes.add(objEstudiante2);
		listaEstudiantes.add(objEstudiante3);
		
		System.out.println("-------------------------Lista de productos ------------------------");	

			TreeSet<Estudiante> tsetEstudiante = new TreeSet<>(listaEstudiantes);

		for (Estudiante temp : tsetEstudiante) {
			if (temp != null) {
				System.out.println(temp.toString());
			} else {
				System.out.println(temp);
			}
			
		}

	
	System.out.println("-------------------------Registro Max. 3------------------------");
	System.out.println("Producto: " + Collections.max(listaEstudiantes));
	System.out.println("-------------------------Registro Min. 1------------------------");
	System.out.println("Producto: " + Collections.min(listaEstudiantes));

	
}









}
