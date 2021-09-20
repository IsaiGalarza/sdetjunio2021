package janet_nieto.laboratorio14;
//2.Iterar a través de llaves de una HashTable

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class HashTable2 {


	public static void main(String[] args) {

		HashMap<Integer, String> hmPaises = new HashMap<>();
		for (int i=1; i<=3; i++) {
			System.out.println("Ingresa nombre de pais: ");
			Scanner st = new Scanner(System.in);
			String Pais = st.nextLine();
			hmPaises.put(i,Pais);
	    }
		
		
		System.out.println(hmPaises);
		
		System.out.println("--------------------------------ITERAR UNA HASHTABLE----------------------------------------");
	
		Set<Integer> llaves = hmPaises.keySet();
		Iterator<Integer> it = llaves.iterator();
		Integer key = 0;
		while(it.hasNext()) {
			key = it.next();
			System.out.println("Llave: " + key + " , Valor: " + hmPaises.get(key).toString());
		}

	}

}
