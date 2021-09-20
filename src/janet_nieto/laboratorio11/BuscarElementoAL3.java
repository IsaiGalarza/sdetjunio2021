package janet_nieto.laboratorio11;
import java.util.ArrayList;
import java.util.List;

//Buscar un elemento de la ArrayList de java
public class BuscarElementoAL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonaAL3 personaYsai = new PersonaAL3(4, "YSAI GALARZA", 35);
		List<PersonaAL3> listaPersona = new ArrayList<>();
		
		listaPersona.add(new PersonaAL3(1, "JUAN PEREZ", 20));
		listaPersona.add(new PersonaAL3(2, "PEDRO FLOR", 45));
		listaPersona.add(new PersonaAL3(3, "CARLA RAMIREZ", 30));
		listaPersona.add(personaYsai); //3
		
		//for (Persona persona : listaPersona) {
		//	System.out.println("Persona: " + persona.toString());
		//}
		
		//BUSCAR OBJETO POR INDICE
		System.out.println("Persona x Indice: " + listaPersona.get(2).toString());
			
	}

}
