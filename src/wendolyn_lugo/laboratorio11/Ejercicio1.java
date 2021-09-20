package wendolyn_lugo.laboratorio11;

import java.util.ArrayList;
import java.util.List;

/*
 * Crear un ArrayList e insertar y recuperar un valor en un índice especificado
 * */
public class Ejercicio1 {

		public static void main(String[] args) {
		
			//Se crea objeto de lista
			List<String> listaCFDI = new ArrayList<>();
			// Se agregan valores a la lista
			listaCFDI.add("INGRESO");
			listaCFDI.add("EGRESO");
			listaCFDI.add("TRASLADO");
			listaCFDI.add("PAGO");
			listaCFDI.add("NOMINA");
//Buscando elemento 3, empezando de 0 el valor a recuperar debería ser PAGO
			System.out.println("El elemento 3 es: " + listaCFDI.get(3));
	}

}
