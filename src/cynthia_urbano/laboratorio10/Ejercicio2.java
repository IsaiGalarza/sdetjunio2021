package cynthia_urbano.laboratorio10;

import java.util.Scanner;

//Escribe un programa para manejar multiples excepciones
public class Ejercicio2 {

	public static void main(String[] args) {

		{
			int a, b;
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Ingresa el primer n�mero");
				a= Integer.parseInt(sc.nextLine());
				System.out.println("Ingresa el segundo n�mero");
				b = Integer.parseInt(sc.nextLine());

				double division= (double) a/b;
				
				System.out.println("El resultado de dividir es: " + division);
			} catch (ArithmeticException ae) {
				System.out.println("Un n�mero no se puede dividir entre 0");
				System.out.println("Exception thrown: " + ae);
			} catch (NumberFormatException nfe) {
				System.out.println("El n�mero ingresado no es v�lido, debe ser entero");
				System.out.println("Excepci�n: " + nfe);
			} catch (RuntimeException re) {
				System.out.println("Excepci�n: " + re);
			}
			System.out.println("Proceso Finalizado...");
		}
	}
}

//Escribe un programa donde una subclase y una superclase lanzan excepciones
