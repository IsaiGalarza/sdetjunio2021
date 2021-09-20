package janet_nieto.laboratorio11;
//Reemplazar un elemento en el indice especificado en un ArrayList

import java.util.ArrayList;
import java.util.Iterator;
public class ReemplazaElementoAL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add("Víctor");
		al.add("Luis");
		al.add("Elena");
		//Si recorremos el ArrayList con iterador:
		Iterator it = al.iterator();		
		while(it.hasNext())			
		System.out.println(it.next());
		//actualizando array
		al.set(2,"Teresa");
	
		//cambio de indice 2
	    Iterator indice = al.iterator();		
		while(indice.hasNext())			
			System.out.println(indice.next());
		
		
		
		
		
		
		
	}

}
