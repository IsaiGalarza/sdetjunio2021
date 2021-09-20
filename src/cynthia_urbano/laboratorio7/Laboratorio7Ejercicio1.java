package cynthia_urbano.laboratorio7;

import java.util.Scanner;

public class Laboratorio7Ejercicio1 {

	public static void main(String[] args) {
		// Escribe un programa parra ordenar los Strings del Array: (Bubble Sort)
		// String str []="Ciaz,Alto,Swift,Dezire,Bressa"

		// Valores que tiene el array A desordenado.
		Scanner n = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int tamano;

		System.out.println("Ingrese el tamaño del arreglo:"); // tamaño del arreglo
		tamano = n.nextInt();
		String[] array = new String[tamano];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Ingrese la palabra de la posición " + (i + 1) + " del arreglo:");
			array[i] = sc.nextLine();// Ingreso de cada palabra en el arreglo´{'
		}

		// Se imprime el contenido del arreglo
		System.out.println("Los datos ingresados son: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print("|" + (i + 1) + ":" + array[i]);
		}

		// Se orrdenan el arreglo por el método Bubble Sort

		String aux;

		for (int i = 1; i <= array.length; i++) {

			for (int j = 0; j < array.length - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}

		// Se imprime el contenido del arreglo ordenado
		System.out.println("\nLos datos ingresados ordenados son: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print("|" + (i + 1) + ":" + array[i]);
		}
	}
}
