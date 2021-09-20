package anais_pinpingos.laboratorio4;

import java.util.Scanner;

public class ComprobarNumero {
	
	static Scanner lee = new Scanner(System.in);
		
	public static void main(String[] args) {

		double num1;
		
		System.out.println("Ingrese numero:");
		num1 = Double.parseDouble(lee.nextLine());
		
		if(num1>0)
			System.out.println(num1 + " Es un numero POSITIVO");
		else
			System.out.println(num1 + " Es un numero NEGATIVO");
		
			
	}

}

