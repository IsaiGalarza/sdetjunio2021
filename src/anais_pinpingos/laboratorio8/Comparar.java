/*Escribir un programa para comparar dos Strings comprobar si son iguales */

package anais_pinpingos.laboratorio8;

import java.util.Scanner;

public class Comparar {

	static Scanner entrada = new Scanner (System.in);
	private static String cadena1, cadena2;
	
	public static void main(String[] args) {
		
		Comparar instComparar = new Comparar();
		
		System.out.println("Ingrese cadena 1: " );
		cadena1 = entrada.nextLine();
		System.out.println("Ingrese cadena 2: " );
		cadena2 = entrada.nextLine();
		System.out.println('\n');
		System.out.println("Comparando cadenas . . .  " );
		System.out.println('\n');
		instComparar.Compara(cadena1,cadena2);
		
	}
	
	public void Compara(String a, String b) {
	
	  	if(a.equals(b)) {
	  		System.out.println("Las cadenas son iguales");

	   	}
	   	else{
	  		System.out.println("Las cadenas son diferentes");

	   	}
		
		
		
	}


}
