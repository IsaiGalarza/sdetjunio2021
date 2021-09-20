/*Escribe un prograsma para concatenar 2 string*/

package anais_pinpingos.laboratorio7;

import java.util.Scanner;

public class Concatenar {

	static Scanner entrada = new Scanner (System.in);
	private static String cadena1, cadena2;
	
	public static void main(String[] args) {
		
		Concatenar instConcatenar = new Concatenar();
		System.out.println("Ingrese cadena 1: " );
		cadena1 = entrada.nextLine();
		System.out.println("Ingrese cadena 2: " );
		cadena2 = entrada.nextLine();
		
		instConcatenar.Unir(cadena1,cadena2);
		
	}
	
	public void Unir(String a, String b) {
		
		String cadena = a.concat(b);
		
		System.out.println("La nueva cadena concatenada es :");
		System.out.println(cadena);
	}

}
