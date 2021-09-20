/**
 * 
 */
package wendolyn_lugo.laboratorio9;

/**
 * @author wendolyn.lugo Escribe un programa para lanzar una excepción
 *         ArrayOutOfBoundsExcepction
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Anitalavalatina";
		String cadena2 = "";
		char[] arregloUno = cadena.toCharArray();

		try {
			for (int i = arregloUno.length; i >= 0; i--) {
				cadena2 = cadena2 + arregloUno[i - 1];

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Excepción controlada: " + e.getMessage());
			e.getStackTrace();
		}
		System.out.println(cadena + " reves " + cadena2);

		if (cadena.toUpperCase().equals(cadena2.toUpperCase())) {
			System.out.println("Palindromo");
		} else {
			System.out.println("No es palindromo");
		}

	}
}