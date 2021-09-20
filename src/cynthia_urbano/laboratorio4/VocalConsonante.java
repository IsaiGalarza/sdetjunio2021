package cynthia_urbano.laboratorio4;

import java.util.Scanner;

/*Escribir un programa para comprobar si una letra es vocal o consonante utilizando la sentencia switch case*/
public class VocalConsonante {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		char letra;
		
		System.out.println("Desde su teclado ingrese una letra: ");
		letra= sc.next().charAt(0);
		switch (letra) {
				case 'A':
				case 'a':
				case 'E':
		        case 'e':
		        case 'I':
		        case 'i':
		        case 'O':
		        case 'o':
		        case 'U':
		        case 'u':
		     System.out.println("La letra " +letra + " es una vocal.");
		        	break;
		           default:
		     System.out.println("La letra "+letra + " es una consonante.");
			}	
	}
		
}
