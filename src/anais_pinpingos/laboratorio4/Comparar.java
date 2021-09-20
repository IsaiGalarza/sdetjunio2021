package anais_pinpingos.laboratorio4;

import java.util.Scanner;

public class Comparar {
	
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
	Comparar instCompara= new Comparar();
	Numero numero= new Numero();

	System.out.println("Ingrese valor 1:");
	numero.setNum1(Integer.parseInt(entrada.nextLine()));
	System.out.println("Ingrese valor 2:");
	numero.setNum2(Integer.parseInt(entrada.nextLine()));
	System.out.println("Ingrese valor 3:");
	numero.setNum3(Integer.parseInt(entrada.nextLine()));
	
	instCompara.numMayor(numero.getNum1(),numero.getNum2(),numero.getNum3());
	
	}
	
	public void numMayor(int a, int b, int c) {
		
		if(a > b) {
			if (a > c) {
				System.out.println("El numero mayor es :" + a);
			}else {
				System.out.println("El numero mayor es :" + c);
			}
		}else if (b > c) {
			System.out.println("El numero mayor es :" + b);
		}else {
			System.out.println("El numero mayor es :" + c);
		}
	}

}
