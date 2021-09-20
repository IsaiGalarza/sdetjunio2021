package alberto_ore.laboratorio2;

import java.util.Scanner;

public class Intercambio {

	
	public static void main(String [] args)
	{
		Intercambio();
	}
	
	public static void Intercambio() {
		float num1=0;
		float num2=0;
		float temp=0;
		
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Escribe un numero 1 tipo float ");
		num1=reader.nextFloat();
		System.out.println("Escribe un numero 2 tipo float ");
		num2=reader.nextFloat();
		reader.close();
		System.out.println("Intercambiando valores... ");
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Nuevo valor numero 1 "+ num1);
		System.out.println("Nuevo valor numero 2 "+ num2);
		
		
	}

}
