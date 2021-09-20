package anais_pinpingos.laboratorio4;

import java.util.Scanner;

public class ComprobarLetra {
	
	static Scanner var = new Scanner(System.in);
	
	public static void main(String[] args) {

		String letra;
		
		System.out.println("Ingrese letra:");
		letra = var.nextLine();
		letra = letra.toLowerCase();
		
		//switch case
		switch (letra) {
		case "a":
			System.out.println("La letra es una vocal");
			break;
		case "e":
			System.out.println("La letra es una vocal");
			break;
		case "i":
			System.out.println("La letra es una vocal");
			break;
		case "o":
			System.out.println("La letra es una vocal");
			break;
		case "u":
			System.out.println("La letra es una vocal");
			break;
			
		default:
			System.out.println("La letra es una consonante");
			break;
		}
	}

}
