/**
 * 
 */
package wendolyn_lugo.laboratorio14;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author wendolyn.lugo
 * Convertir valores de una map a una lista
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Permiso objPermiso1 = new Permiso ("TPAF01","01");
		Permiso objPermiso2 = new Permiso ("TPAF02","02");
		Permiso objPermiso3 = new Permiso ("TPAF03","03");
		Permiso objPermiso4 = new Permiso ("TPAF04","04");
		Permiso objPermiso5 = new Permiso ("TPAF05","01");
		
		HashMap<Integer, Permiso> htPermiso = new HashMap<>();
		htPermiso.put(1,objPermiso1);
		htPermiso.put(2,objPermiso2);
		htPermiso.put(3,objPermiso3);
		htPermiso.put(4,objPermiso4);
		htPermiso.put(5,objPermiso5);
		
		System.out.println("Tipo HashMap" + htPermiso.toString());
		//MAP TO LIST
		ArrayList<Integer> listKey = new ArrayList<Integer>(htPermiso.keySet());
		ArrayList<Permiso> listValues = new ArrayList<Permiso>(htPermiso.values());
		
		System.out.println("Recorrido en Array" + listValues.toString());
		/*
		 * for (Permiso temp : listValues) {
		 *	System.out.println(temp.toString());
		 * }
		 */
		
	}

}
