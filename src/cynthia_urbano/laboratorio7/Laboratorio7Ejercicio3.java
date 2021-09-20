package cynthia_urbano.laboratorio7;

import java.util.Scanner;

//Escribe un programa para concatenr 2 strings
public class Laboratorio7Ejercicio3 {

	public static void main(String[] args) {

		String cadena1;
		String cadena2;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cadena 1: ");
		cadena1 = sc.nextLine();
		System.out.println("Ingrese la cadena 2: ");
		cadena2 = sc.nextLine();

		System.out.println("concatenación de la cadena : " + cadena1.concat(cadena2));

	}

}
