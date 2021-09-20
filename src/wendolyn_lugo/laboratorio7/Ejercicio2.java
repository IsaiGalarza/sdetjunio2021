package wendolyn_lugo.laboratorio7;

public class Ejercicio2 {
	// Escribe un programa para encontrar las mayusculas y minúsculas en la cadena
	// AbCdefHijklMNOpqstUVwxyZ@%*234
	// utilia char.isUpperCase y char.isLoweCase
	public static void main(String[] args) {

		String characters = "AbCdefHijklMNOpqstUVwxyZ@%*234";
		// String mayuscula = Character.isUpperCase(cadena);
		int longitud = characters.length();
		for (int i=0; i< longitud ; i++) {
			if (Character.isUpperCase(characters.charAt(i)) == true) {
				System.out.println("La letra:" + characters.charAt(i) + " es mayúscula");
			}
			else
			{
				System.out.println("La letra:" + characters.charAt(i) + " es minúscula");
			}
		}
	}

}
