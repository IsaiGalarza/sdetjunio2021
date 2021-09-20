/**
 * 
 */
package wendolyn_lugo.laboratorio11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wendolyn.lugo
 *Buscar un elemento de la ArrayList de Java
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se crea objeto de lista
				List<String> listaRemolque = new ArrayList<>();
				// Se agregan valores a la lista
				listaRemolque.add("Caja refrigerada");
				listaRemolque.add("Caja Cerrada");
				listaRemolque.add("Caja");
				listaRemolque.add("Caballete");
				listaRemolque.add("Jaula");
				listaRemolque.add("Semicaja");
				
				System.out.println("Existe: " + listaRemolque.contains("Caja"));
				System.out.println("Buscando: " + listaRemolque.get(listaRemolque.indexOf("Caja")));
				System.out.println("Posicion: " + listaRemolque.indexOf("Caja"));

	}

}
