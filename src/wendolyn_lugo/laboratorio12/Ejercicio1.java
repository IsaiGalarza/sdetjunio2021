/**
 * 
 */
package wendolyn_lugo.laboratorio12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wendolyn.lugo
 *Unir dos listas usando addAll
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Lista Uno de Figura transporte
		List<String> lFiguraTransporte = new ArrayList<>();
		
		lFiguraTransporte.add("Operador");
		lFiguraTransporte.add("Notificado");
		lFiguraTransporte.add("Arrendatario");
		lFiguraTransporte.add("Propietario");
		
//Lista Dos de Elementos en Figura Transporte		
		List<String> lAtributosFT = new ArrayList<>();
		
		lAtributosFT.add("RFC");
		lAtributosFT.add("Nombre"); 
		lAtributosFT.add("NumRegTrib"); 
		lAtributosFT.add("NumEstacion");
		
		System.out.println("Lista Uno:" + lFiguraTransporte.toString());
		System.out.println("Lista Dos:" + lAtributosFT.toString());
	
	System.out.println("Union de listas: " + lFiguraTransporte.addAll(lAtributosFT));
	System.out.println("Impresion de lista:" + lFiguraTransporte.toString());
	}

}
