package alberto_ore.laboratorio7;

public class MayusculasMinusculas {

	public static void main(String[] args) {

		String characters = "AbCdefGHijklMNOpqRstUVwxyZ@%234";
		String letras = characters.substring(0, 26);

		System.out.println(letras);

		char[] chares = letras.toCharArray();
		String mayusculas = "";
		String minusculas = "";

		/*
		 * for (char letra : chares) { if (Character.isUpperCase(letra)) { mayusculas +=
		 * letra; } else { minusculas += letra; } }
		 */

		for (char letra : chares) {
			if (!Character.isLowerCase(letra)) {
				mayusculas += letra;
			} else {
				minusculas += letra;
			}
		}

		System.out.println("Mayúsculas: " + mayusculas);
		System.out.println("Minúsculas: " + minusculas);

	}

}
