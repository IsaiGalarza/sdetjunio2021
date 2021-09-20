package alberto_ore.laboratorio5;

public class NumeroPrimo {

	public static void main(String[] args) {

		int min = 1;
		int max = 500;

		for (int i = min; i < max; i++) {
			if (validarPrimo(i)) {
				System.out.println("El número " + i + " es primo.");
			}

		}

	}

	public static boolean validarPrimo(int num) {
		if (num < 1) {
			return false;
		}

		int cantidad_divisores = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cantidad_divisores++;
			}

		}

		if (cantidad_divisores == 2) {
			return true;
		} else {
			return false;
		}

	}

}
