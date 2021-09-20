package cynthia_urbano.laboratorio8;

import java.util.Scanner;

//Escribir un programa para agregar cadenas usandos StringBuilder y StringBuffer
public class Ejercicio4 {

	public static void main(String[] args) {

		StringBuilder cadenaBL = new StringBuilder();
		StringBuffer cadenaBF = new StringBuffer();

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la cadena StringBuilder");

		cadenaBL.append(sc.next());
		System.out.println("Ingrese la cadena StringBuffer ");

		cadenaBF.append(sc.next());

		System.out.println("La cadena StringBuilder es: " + cadenaBL);
		System.out.println("La cadena StringBuffer es: " + cadenaBF);

	}

}
