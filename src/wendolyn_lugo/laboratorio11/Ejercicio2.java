package wendolyn_lugo.laboratorio11;

import java.util.ArrayList;
import java.util.List;

/*
 * Reemplazar un elemento en el índice especificado en una ArrayList
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se crea objeto de lista
		List<String> listaTransporte = new ArrayList<>();
		// Se agregan valores a la lista
		listaTransporte.add("MARITIMO");
		listaTransporte.add("AUTOTRANSPORTE");
		listaTransporte.add("AEREO");
		listaTransporte.add("FERROVIARIO");
		
		System.out.println("El elemento 2 es: " + listaTransporte.get(1));
		listaTransporte.set(1, "AUTOTRANSPORTE FEDERAL");
		System.out.println("El elemento 2 despues del set es: " + listaTransporte.get(1));
	}

}
