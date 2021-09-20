/**
 * 
 */
package wendolyn_lugo.laboratorio13;

import java.util.LinkedHashSet;

/**
 * @author wendolyn.lugo
 * Comprueba si existe un elemento en particular en un LinkedHashSet
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lContenedorM = new LinkedHashSet<>();
		lContenedorM.add("Contenedores refrigerados de 20FT");
		lContenedorM.add("Contenedor flat racks");
		lContenedorM.add("Contenedor Isotanque");
		lContenedorM.add("Contenedores estándar de 10FT");
		lContenedorM.add("Contenedores Open Side");
		
		System.out.println("Existe Contenedor flat racks: " + lContenedorM.contains("Contenedor flat racks"));
	}

}
