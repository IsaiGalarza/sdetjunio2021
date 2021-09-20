package cynthia_urbano.laboratorio8;

import java.util.Scanner;

//Escribe un programa para comparar dos Strings, comprobar si son iguales
public class Ejercicio1 {

	public static void main(String[] args) {
		String cadena1;
		String cadena2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la cadena 1: ");
		cadena1 = sc.nextLine();
		System.out.println("Ingrese la cadena 2: ");
		cadena2 = sc.nextLine();

		if (cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son diferentes");
		}
	}

}
