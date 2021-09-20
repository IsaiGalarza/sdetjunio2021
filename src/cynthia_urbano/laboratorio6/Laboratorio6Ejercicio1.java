package cynthia_urbano.laboratorio6;

public class Laboratorio6Ejercicio1 {

	public static void main(String[] args) {

		double promedio = 0;
		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };

		for (int i = 0; i < array1.length; i++) {
			promedio += array1[i];
		}
		System.out.println("El promedio es: " + (promedio / array1.length));

	}

}
