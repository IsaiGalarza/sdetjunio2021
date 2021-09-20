package cynthia_urbano.laboratorio6;

public class Laboratorio6Ejercicio2 {

	public static void main(String[] args) {

		int array1[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print("| " + array1[i][j] + " ");
			}
			System.out.print("|\n");
		}
	}
}
