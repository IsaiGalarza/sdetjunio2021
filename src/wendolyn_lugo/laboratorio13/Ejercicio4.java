/**
 * 
 */
package wendolyn_lugo.laboratorio13;

import java.util.TreeSet;

/**
 * @author wendolyn.lugo
 * Obtener el valor más bajo y más alto guardado en un TreeSet
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> tsetEstaciones = new TreeSet<>();
		tsetEstaciones.add("Rosarito");
		tsetEstaciones.add("La Mision");
		tsetEstaciones.add("El Sauzal");
		tsetEstaciones.add("Marina Coral");
		tsetEstaciones.add("Ensenada");
		
		System.out.println("Lista completa: " + tsetEstaciones.toString());
		System.out.println("Primer elemento de la lista: " + tsetEstaciones.first());
		System.out.println("Ultimo elemento de la lista: " + tsetEstaciones.last());
	}

}
