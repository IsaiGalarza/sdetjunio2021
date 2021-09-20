package cynthia_urbano.laboratorio7;

import java.util.Scanner;

public class Laboratorio7Ejercicio2 {

	public static void main(String[] args) {
		// Escribe un programa para encontrar las mayúsculas y minnúsculas en la cedena
		// String characteres: "AbCdefGHijklMNOpqRstUVwxyZ@%*234"
		// Utilizar char.isUpperCase (char c) y char.isLowerCase (Char c)

		String mayus = "";
		String minus = "";

		String characteres = "AbCdefGHijklMNOpqRstUVwxyZPOOOOrrr@%*234";

		System.out.println("La cadena ingresada es: " + characteres);

		char[] cad = characteres.toCharArray();

		for (int i = 0; i < cad.length; i++) {

			if (Character.isUpperCase(cad[i])) {
				mayus = mayus + cad[i] + " ";

			} else if (Character.isLowerCase(cad[i])) {
				minus = minus + cad[i] + " ";

			}
		}
		System.out.println("---------------------------------------------------------- ");
		System.out.println("Las mayúsculas son: " + mayus);
		System.out.println("Las minúsculas son: " + minus);

	}

}
