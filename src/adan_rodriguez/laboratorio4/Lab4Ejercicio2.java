package adan_rodriguez.laboratorio4;

import java.util.Scanner;

public class Lab4Ejercicio2 {
	
	private static String letra;
	
	public static void main(String [] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Escribe una letra");
		letra=read.next().toUpperCase();
		read.close();
		
		switch(letra){
		case ("A"):
			System.out.println("Vocal");
			break;
		case ("B"):
			System.out.println("Consonante");
		break;
		case ("C"):
			System.out.println("Consonante");
		break;
		case ("D"):
			System.out.println("Consonante");
		break;
		case ("E"):
			System.out.println("Vocal");
		break;
		case ("F"):
			System.out.println("Consonante");
		break;
		case ("G"):
			System.out.println("Consonante");
		break;
		case ("H"):
			System.out.println("Consonante");
		break;
		case ("I"):
			System.out.println("Vocal");
		break;
		case ("J"):
			System.out.println("Consonante");
		break;
		case ("K"):
			System.out.println("Consonante");
		break;
		case ("L"):
			System.out.println("Consonante");
		break;
		case ("M"):
			System.out.println("Consonante");
		break;
		case ("N"):
			System.out.println("Consonante");
		break;
		case ("Ñ"):
			System.out.println("Consonante");
		break;
		case ("O"):
			System.out.println("Vocal");
		break;
		case ("P"):
			System.out.println("Consonante");
		break;
		case ("Q"):
			System.out.println("Consonante");
		break;
		case ("R"):
			System.out.println("Consonante");
		break;
		case ("S"):
			System.out.println("Consonante");
		break;
		case ("T"):
			System.out.println("Consonante");
		break;
		case ("U"):
			System.out.println("Vocal");
		break;
		case ("V"):
			System.out.println("Consonante");
		break;
		case ("W"):
			System.out.println("Consonante");
		break;
		case ("X"):
			System.out.println("Consonante");
		break;
		case ("Y"):
			System.out.println("Consonante");
		break;
		case ("Z"):
			System.out.println("Consonante");
		break;
		
		default:
			System.out.println("NO es una vocal o es una cadena");

		}
	}

}
