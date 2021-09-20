package cynthia_urbano.laboratorio13;

import java.util.TreeSet;

//Convertir TreeSet a un Array de enteros
public class Ejercicio5 {

	public static void main(String[] args) {

		TreeSet<Integer> elementos = new TreeSet<Integer>();
		elementos.add(1);
		elementos.add(2);
		elementos.add(3);
		elementos.add(4);
		elementos.add(5);

		System.out.println("Los elementos del TreeSet es: \n" + elementos);
		Integer[] intArray = new Integer[elementos.size()];

		intArray = elementos.toArray(intArray);

		for (Integer number : intArray) {
			System.out.println(number);
		}

	}

}
