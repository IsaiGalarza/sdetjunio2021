/**
 * 
 */
package wendolyn_lugo.laboratorio13;

import java.util.HashSet;

/**
 * @author wendolyn.lugo
 * Obtener el tamaño de un HashSet
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> lContenedor = new HashSet<>();
		lContenedor.add("Contenedor de 6.1 Mts de longitud");
		lContenedor.add("Contenedor de 12.2 Mts de longitud");
		lContenedor.add("Contenedor de 13.7 Mts de longitud");
		
		System.out.println("Longitud: " + lContenedor.size());

	}

}
