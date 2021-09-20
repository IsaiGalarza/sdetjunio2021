/*Escribe un programa para recortar el String*/

package anais_pinpingos.laboratorio7;

import java.util.Scanner;

public class RecortarString {

		static Scanner entrada = new Scanner (System.in);
		private static String cadena = " She sells sea shells on the sea shore ";

		public static void main(String[] args) {
		
			RecortarString instRecortar = new RecortarString();
			int inicio, fin;
			System.out.println("Cadena: '' She sells sea shells on the sea shore ''" );
			System.out.println("Ingrese posición de inicio de recorte: " );
			inicio = Integer.parseInt(entrada.nextLine());
			System.out.println("Ingrese posición de fin de recorte: " );
			fin = Integer.parseInt(entrada.nextLine());
			
			instRecortar.Recorte(inicio, fin);
		
		}
	
		public void Recorte(int inicio, int fin) {
		
			String cadRecortada = cadena.substring(inicio-1, fin);
		
			System.out.println("La cadena recortada es :");
			System.out.println(cadRecortada);
		}


}
