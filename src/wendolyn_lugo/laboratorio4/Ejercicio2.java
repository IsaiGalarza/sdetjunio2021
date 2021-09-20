package wendolyn_lugo.laboratorio4;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String teclado;
		System.out.println("Escriba una letra del abecedario: ");
		teclado = sc.next().toLowerCase();
		
		switch (teclado)
		{
		case "a":
		System.out.println(teclado +" es una vocal");
			break;
		case "e":
		System.out.println(teclado +" es una vocal");
			break;
		case "i":
		System.out.println(teclado +" es una vocal");
			break;
		case "o":
		System.out.println(teclado +" es una vocal");
			break;
		case "u":
		System.out.println(teclado +" es una vocal");
			break;
		default:
		System.out.println(teclado +" es una consonante");
		}
}
}