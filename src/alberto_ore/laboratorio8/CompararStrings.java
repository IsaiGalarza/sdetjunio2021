package alberto_ore.laboratorio8;

public class CompararStrings {

	public static void main(String[] args) {

		String string1 = "Feliz Navidad";
		String string2 = "Feliz Navidad";

		System.out.println("Cadena 1: " + string1);
		System.out.println("Cadena 2: " + string2);

		if (string1.compareTo(string2) == 0) {
			System.out.println("Las cadenas son iguales.");
		} else {
			System.out.println("Las cadenas no son iguales.");
		}
	}

}
