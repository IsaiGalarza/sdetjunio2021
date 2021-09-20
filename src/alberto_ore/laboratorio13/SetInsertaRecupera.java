package alberto_ore.laboratorio13;

import java.util.HashSet;
import java.util.Set;

public class SetInsertaRecupera {

	public static void main(String[] args) {

		Set<String> listaCategoria = new HashSet<String>();
		listaCategoria.add("Excelente");
		listaCategoria.add("Bueno");
		listaCategoria.add("Regular");
		listaCategoria.add("Regular");
		listaCategoria.add(null);

		for (String temp : listaCategoria) {
			System.out.println("Marcas: " + temp);

		}

	}

}
