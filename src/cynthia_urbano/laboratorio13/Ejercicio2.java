package cynthia_urbano.laboratorio13;

import java.util.HashSet;
import java.util.Set;

//Obtener el tamaño de un Hash Set
public class Ejercicio2 {

	public static void main(String[] args) {

		 Set<String> set = new HashSet<String>();
		 
	        set.add("Palabra 1");
	        set.add("Palabra 2");
	        set.add("Palabra 3");
	        set.add("Palabra 2");
	        set.add("Palabra 4");
	 
	        System.out.println("El tamaño del HashSet sin duplicados es: \n"+set.size());
	}

}
