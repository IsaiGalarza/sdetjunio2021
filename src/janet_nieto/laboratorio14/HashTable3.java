package janet_nieto.laboratorio14;
//3.Eliminar el par llave-valor de una HashTable
import java.util.Hashtable;
import java.util.TreeMap;


public class HashTable3 {
	
public static void main(String[] args) {
		Estudiante objEstudiante1 = new Estudiante(1, "JUAN PEREZ", 18, "M");
		Estudiante objEstudiante2 = new Estudiante(2, "CALOS DAMIAN", 19, "M");
		Estudiante objEstudiante3 = new Estudiante(3, "ANA PEREZ", 20, "M");
		
		TreeMap<String, Estudiante> tmEstudiantes = new TreeMap<>();
		tmEstudiantes.put(objEstudiante1.getNombre(), objEstudiante1);
		tmEstudiantes.put(objEstudiante2.getNombre(), objEstudiante2);
		tmEstudiantes.put(objEstudiante3.getNombre(), objEstudiante3);
		
		System.out.println(tmEstudiantes);
		
		//ELIMINAR POR LLAVE VALOR
		System.out.println("Eliminar por llave valor al estudiante : " + objEstudiante1.getNombre() +" " + tmEstudiantes.remove(objEstudiante1.getNombre(), objEstudiante1));
		//Mostrar nuevo Hashtable
		System.out.println("Nuevo HashTable: " + tmEstudiantes);

     
	}
}
