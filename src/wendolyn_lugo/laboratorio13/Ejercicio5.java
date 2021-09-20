/**
 * 
 */
package wendolyn_lugo.laboratorio13;

import java.util.TreeSet;

/**
 * @author wendolyn.lugo
 * Convertir TreeSet a un Array de enteros
 */
public class Ejercicio5 {

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
		tsetEstaciones.add("Punta China");
		tsetEstaciones.add("San Quintín");
		
		System.out.println("Lista completa: " + tsetEstaciones.toString());
		
		
		System.out.println("Lista completa: " + tsetEstaciones.toArray().length);
	}

}
