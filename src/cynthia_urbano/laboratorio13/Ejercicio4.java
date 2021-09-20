package cynthia_urbano.laboratorio13;

import java.util.TreeSet;

//Obtener el valor más bajo y más alto guardado en un TreeSet

public class Ejercicio4 {

	public static void main(String[] args) {

		 TreeSet elementos = new TreeSet();
		 elementos.add("Reloj");
		 elementos.add("Billetera");
		 elementos.add("Zapato");
		 elementos.add("Calcetin");
		 elementos.add("Corbata");
		 
		    System.out.println("Los elemntos del TreeSet es: \n"  + elementos);

		    System.out.println("\nEl primer elemento de un TreeSet ordenado alfabéticamente es: "
		    + elementos.first());
		  
		    System.out.println("El ultimo elementos de un TreeSet ordenado alfabéticamente es: "
		    + elementos.last());
	}

}
