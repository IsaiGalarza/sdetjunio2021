package cynthia_urbano.laboratorio10;

import java.util.Scanner;

//Escribe un programa para manejar multiples excepciones
public class Ejercicio2 {

	public static void main(String[] args) {

		{
			int a, b;
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Ingresa el primer número");
				a= Integer.parseInt(sc.nextLine());
				System.out.println("Ingresa el segundo número");
				b = Integer.parseInt(sc.nextLine());

				double division= (double) a/b;
				
				System.out.println("El resultado de dividir es: " + division);
			} catch (ArithmeticException ae) {
				System.out.println("Un número no se puede dividir entre 0");
				System.out.println("Exception thrown: " + ae);
			} catch (NumberFormatException nfe) {
				System.out.println("El número ingresado no es válido, debe ser entero");
				System.out.println("Excepción: " + nfe);
			} catch (RuntimeException re) {
				System.out.println("Excepción: " + re);
			}
			System.out.println("Proceso Finalizado...");
		}
	}
}

//Escribe un programa donde una subclase y una superclase lanzan excepciones
