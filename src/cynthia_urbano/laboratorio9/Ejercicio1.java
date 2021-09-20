package cynthia_urbano.laboratorio9;

import java.util.Scanner;

//Escribe un programa con try, catch y el bloque finally
public class Ejercicio1 {

	public static void main(String[] args) {
		try {
			int num1, num2, resultado;
			Scanner sc = new Scanner(System.in);

			System.out.print("Ingresa el primer n�mero: ");
			num1 = sc.nextInt();

			System.out.print("Ingresa el segundo n�mero: ");
			num2 = sc.nextInt();

			resultado = num1 / num2;

			System.out.println("La divisi�n es igual a: " + resultado);
		} catch (Exception e) {
			System.out.println("Se ha generado el siguiente error: " + e);
		} finally {
			System.out.println("Operaci�n Terminada.");
		}

	}

}
