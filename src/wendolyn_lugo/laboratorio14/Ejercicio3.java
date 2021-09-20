/**
 * 
 */
package wendolyn_lugo.laboratorio14;

import java.util.Hashtable;

/**
 * @author wendolyn.lugo
 * Eliminar el par llave-valor de un HashTable
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> htPermiso = new Hashtable<>();
		htPermiso.put(4, "TPAF01");
		htPermiso.put(15, "TPAF02");
		htPermiso.put(23, "TPAF03");
		htPermiso.put(5, "TPAF04");
		htPermiso.put(29, "TPAF05");
		
		System.out.println("Completa" + htPermiso.toString());
		
		htPermiso.remove(1, "TPAF01");
		System.out.println("Par (1, \"TPAF01\") no encontrado " + htPermiso.toString());
		
		htPermiso.remove(4, "TPAF01");
		System.out.println("Par (4, \"TPAF01\") encontrado " + htPermiso.toString());
	}

}
