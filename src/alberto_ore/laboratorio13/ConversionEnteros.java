package alberto_ore.laboratorio13;

import java.util.Set;
import java.util.TreeSet;

public class ConversionEnteros {

	public static void main(String[] args) {

		Set<Integer> tSetNumeros = new TreeSet<Integer>();
		tSetNumeros.add(23);
		tSetNumeros.add(34);
		tSetNumeros.add(28);
		tSetNumeros.add(27);

		System.out.println("TreeSet\n");
		for (Integer numero : tSetNumeros) {
			System.out.println("El número es: " + numero);

		}

		Integer[] intArray = new Integer[tSetNumeros.size()];

		intArray = tSetNumeros.toArray(intArray);
		System.out.println("Array\n");

		for (Integer numero : intArray) {
			System.out.println("El número es: " + numero);

		}

	}

}
