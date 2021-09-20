package wendolyn_lugo.laboratorio4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int edad1, edad2, edad3;
	System.out.println("Edad 1: ");
	edad1 = sc.nextInt();
	
	System.out.println("Edad 2: ");
	edad2 = sc.nextInt();

	System.out.println("Edad 3: ");
	edad3 = sc.nextInt();

	if (edad1 > edad2) {
		System.out.println("El mayor es: "+ edad1);
	}
	else if (edad2 > edad3) {
		System.out.println("El mayor es: "+ edad2);
		}
	else{
		System.out.println("El mayor es: "+ edad3);
	}
}
}