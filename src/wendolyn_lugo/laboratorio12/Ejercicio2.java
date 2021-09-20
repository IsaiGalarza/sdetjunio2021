/**
 * 
 */
package wendolyn_lugo.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wendolyn.lugo Ordenar una ArrayList usando Comparable y Comparator
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lista Clave Tipo Carga
		List<String> lTipoCarga = new ArrayList<>();

		lTipoCarga.add("Gran Mineral");
		lTipoCarga.add("Carga General Suelta");
		lTipoCarga.add("Pretóleo  y Derivados");
		lTipoCarga.add("Granel Agrícola");
		lTipoCarga.add("Otros Fluidos");
		lTipoCarga.add("Carga General Contenerizada");

		System.out.println("Orden orginal " + lTipoCarga.toString());
		// Ordenando la coleccion
		Collections.sort(lTipoCarga);
		// Imprime la lsita ordenada por defecto usa l Comparable para ordenar
		System.out.println("Orden Collections " + lTipoCarga.toString());
		
	}

}
