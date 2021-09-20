package alberto_ore.laboratorio10;

import java.io.FileNotFoundException;

public class MultiplesException {

	public static void main(String[] args) throws NullPointerException, FileNotFoundException {

		int num1 = 10;
		int num2 = 0;
		int resultado;

		try {

			resultado = num1 / num2;

			System.out.println("Resultado Division: " + resultado);

		} catch (Exception e) {
			System.out.println("Error aritmetico : " + e.getMessage());
			e.printStackTrace();

		}

	}

}
