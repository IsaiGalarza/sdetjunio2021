package alberto_ore.laboratorio4;

import java.util.Scanner;

public class Lab4Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Ingrese por pantalla el 1er numero:");
		num1 = sc.nextInt();
		
		System.out.println("Ingrese por pantalla el 2do numero:");
		num2 = sc.nextInt();
		
		System.out.println("Ingrese por pantalla el 3er numero:");
		num3 = sc.nextInt();
		
		sc.close();
		if(num1 > num2) {
			if (num1 > num3) {
				System.out.println("El mayor es :" + num1);
			}else {
				System.out.println("El mayor es :" + num3);
			}
		}else if (num2 > num3) {
			System.out.println("El mayor es :" + num2);
		}else {
			System.out.println("El mayor es :" + num3);
		}
		
		
	}
	
}
