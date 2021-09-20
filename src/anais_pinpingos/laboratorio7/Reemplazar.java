/*Escribe un programa para reemplazar el caracter P con el caracter F en el Strin: Pan Pun Prank Pit Pat */

package anais_pinpingos.laboratorio7;

import java.util.Scanner;

public class Reemplazar {

	static Scanner entrada = new Scanner (System.in);
	private static String cadena = "Pan Pun Prank Pit Pat";

	public static void main(String[] args) {
	
		Reemplazar instReemplazar = new Reemplazar();
	
		System.out.println("Cadena: ''Pan Pun Prank Pit Pat''" );
		System.out.println('\n');
		System.out.println("Reemplazando  caracter P por F. . .  " );
		System.out.println('\n');
		
		instReemplazar.Reemplaza();
	
	}

	public void Reemplaza() {
	
		String cadReemplazada = cadena.replaceAll("P","F");
	
		System.out.print("La cadena con reemplazo es :  ");
		System.out.println(cadReemplazada);
	}


}
