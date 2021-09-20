/*Escribir un programa a convertir un objeto boolean a una variable boolean*/

package anais_pinpingos.laboratorio8;

import java.util.Scanner;

public class Convertir {

	static Scanner entrada = new Scanner (System.in);
		
		public static void main(String[] args) {
			
			System.out.println("Ingrese valor booleano (true o false)");
			String booleano = entrada.nextLine();
			Boolean objBooleano = new Boolean(booleano);
			boolean varBoolean = objBooleano.booleanValue();
			
			System.out.println("Objeto boolean : " );
			System.out.println(objBooleano);
			System.out.println("variable boolean : " );
			System.out.println(varBoolean);


			
		}

			

}
