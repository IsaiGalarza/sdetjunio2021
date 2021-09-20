package cynthia_urbano.laboratorio9;

import java.util.Scanner;

//Escribe un programa para lanzar una excepcion ArrayOutOfBoundsException
public class Ejercicio2 {

	public static void main(String[] args) {

		double promedio = 0;
		int posc;
		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("¿Qué posición desae obtener?: ");
			posc = sc.nextInt();

			System.out.println("La posición " + posc + " es: " + array1[posc]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se ha generado el siguiente error: " + e);
		} finally

		{
			System.out.println("Operación Terminada.");
		}

	}
}
