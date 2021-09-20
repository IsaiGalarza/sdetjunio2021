/**
 * 
 */
package wendolyn_lugo.laboratorio14;

import java.util.HashMap;

/**
 * @author wendolyn.lugo
 * Comprubeba que existe una llave en particular en HashMap
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmLocalidad = new HashMap<>();
		hmLocalidad.put(1, "Ciudad Adolfo López Mateos");
		hmLocalidad.put(2, "Apatzingán de la Constitución");
		hmLocalidad.put(3, "Cuautla (Cuautla de Morelos)");
		hmLocalidad.put(4, "Santiago Ixcuintla");
		hmLocalidad.put(5,"Ciudad Apodaca" );
		
		System.out.println(hmLocalidad.toString());
		System.out.println("Existe 6: "+ hmLocalidad.containsKey(6));
		System.out.println("Existe Santiago Ixcuintla: "+ hmLocalidad.containsValue("Santiago Ixcuintla"));
		
	}

}
