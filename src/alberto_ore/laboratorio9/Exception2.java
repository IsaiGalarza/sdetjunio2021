package alberto_ore.laboratorio9;

public class Exception2 {

	public static void main(String[] args) {

		String[] letras = new String[5];
		letras[0] = "Pedro";
		letras[1] = "Maria";
		letras[2] = "Aaron";
		letras[3] = "Micaela";
		letras[4] = "Alberto";

		try {

			for (int i = 0; i < letras.length; i++) {

				System.out.println("Mostrando valores: " + letras[i]);

			}

			System.out.println("Mostrando valor de la posición 5: " + letras[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ejecutándose siempre.");
		}

	}

}
