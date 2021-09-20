/*Escribir un programa para invertir una cadena usando recursividad */

package anais_pinpingos.laboratorio8;

import java.util.Scanner;

public class InvertirNumero {

	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {		
			
			int numero;
			StringBuffer cadenaBuffer1 = new StringBuffer();
			StringBuffer cadenaBuffer2 = new StringBuffer();
			
			System.out.println("Ingrese numero " );
			numero = Integer.parseInt(entrada.nextLine());
			
			cadenaBuffer2 = new StringBuffer();
			cadenaBuffer1.append(numero);
			cadenaBuffer2.append(numero);
			cadenaBuffer2.reverse();
			
			System.out.println("Cadena Original :");
			System.out.println(cadenaBuffer1);
			System.out.println("Cadena Invertida :");
			System.out.println(cadenaBuffer2);
	}
}
