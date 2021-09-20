/**
 * 
 */
package wendolyn_lugo.laboratorio14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wendolyn.lugo
 * Iterar de llaves a traves de un Hashtable
 */
public class Ejercicio2 {

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
		
		System.out.println(htPermiso.toString());
		
		//ITERAR UNA HASHTABLE
		Set<Integer> llaves = htPermiso.keySet();
		Iterator<Integer> it = llaves.iterator();
		Integer key = 0;
		while(it.hasNext()) {
			key = it.next();
			System.out.println("Llave: " + key + " , Valor: " + htPermiso.get(key).toString());
		}
	}

}
