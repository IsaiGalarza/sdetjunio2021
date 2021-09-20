/**
 * 
 */
package wendolyn_lugo.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wendolyn.lugo Encontrar el máximo y mínimo de una lista usando la
 *         clase Collections
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lNacionalidad = new ArrayList<>();
		lNacionalidad.add("Canadiense");
		lNacionalidad.add("Centro");
		lNacionalidad.add("Europeas");
		lNacionalidad.add("Mexicanas");
		lNacionalidad.add("Asiáticas");
		lNacionalidad.add("El Caribe");
		lNacionalidad.add("Estadounidense");

		System.out.println("Nacionalidad " + lNacionalidad.toString());
		System.out.println("Nacionalidad Max: " + Collections.max(lNacionalidad));
		System.out.println("Nacionalidad Min: " + Collections.min(lNacionalidad));
	}

}
