/**
 * 
 */
package wendolyn_lugo.laboratorio12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author wendolyn.lugo Añadir libros a una Lista y luego, leer la lista de
 *         libros usando ListIterator, en ambas direcciones hacia atrás y adelante
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lUnidadPeso= new ArrayList<>();
		lUnidadPeso.add("Contenedor externo");
		lUnidadPeso.add("Tambor de acero");
		lUnidadPeso.add("Tambor de alumninio");
		lUnidadPeso.add("Bolsa de plástico");
		lUnidadPeso.add("Caja de cartón");
		lUnidadPeso.add("Madera Flejada");
		lUnidadPeso.add("Pallet o empaquetado");
		lUnidadPeso.add("Aerosol");
		
		
		ListIterator<String> li = lUnidadPeso.listIterator();
		System.out.println("--------------- navegar hacia adelante-------------------");
		while(li.hasNext()) {
			System.out.println("Unidad Peso: " + li.next());
		}
		

		System.out.println("--------------- navegar hacia atras-------------------");
		while(li.hasPrevious()) {
			System.out.println("Unidad Peso: " + li.previous());
		}
		
		
	}

}
