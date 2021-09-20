package alberto_ore.laboratorio4;

import java.util.Scanner;

public class Lab4Ejercicio3 {
	private static double num;
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escribe un numero positivo o negativo");
		num=read.nextDouble();
		read.close();
		
		if (num<0)
			System.out.println("Número negativo");
		else if (num>=0)
			System.out.println("Número positivo");
	}

}
