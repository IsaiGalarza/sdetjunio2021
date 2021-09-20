/**
 * 
 */
package wendolyn_lugo.laboratorio12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * @author wendolyn.lugo Ordenar una ArrayList usando Comparable y Comparator
 */
public class Ejercicio2_Comparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creamos 3 productos
		Carga objCarga = new Carga("GMN", "Gran Mineral");
		Carga objCarga1 = new Carga("CGS", "Carga General Suelta");
		Carga objCarga2 = new Carga("PYD", "Pretóleo  y Derivados");
		Carga objCarga3 = new Carga("GAG", "Granel Agrícola");
		Carga objCarga4 = new Carga("OFL", "Otros Fluidos");
		Carga objCarga5 = new Carga("CGC", "Carga General Contenerizada");
		
		// Lista Clave Tipo Carga
		List<Carga> lTipoCarga = new ArrayList<>();

		lTipoCarga.add(objCarga);
		lTipoCarga.add(objCarga1);
		lTipoCarga.add(objCarga2);
		lTipoCarga.add(objCarga3);
		lTipoCarga.add(objCarga4);
		lTipoCarga.add(objCarga5);

		System.out.println("Orden orginal " + lTipoCarga.toString());

		// Imprime la lsita ordenada
		System.out.println("Orden Collections " + lTipoCarga.toString());
		
		lTipoCarga.sort(new Comparator<Carga>() {
			@Override
			public int compare(Carga c1, Carga c2) {
				return c2.getClave().compareTo(c1.getClave()); //descendente
			}
	});
		System.out.println("Orden Comparator " + lTipoCarga.toString());
}
}
