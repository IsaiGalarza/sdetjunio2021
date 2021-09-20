package alberto_ore.laboratorio6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBidi {

	public static void main(String[] args) {

		String cadena = "";

		String[][] clientes = new String[2][3];
		Scanner ent = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Ingresa el nombre de la fila: " + i);
				clientes[i][j] = ent.nextLine();
				cadena += clientes[i][j];

			}

		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("En la posicion: " + i + " se guardó: " + clientes[i][j]);

			}

		}

	}

}
