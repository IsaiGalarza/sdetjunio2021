package cynthia_urbano.laboratorio4;

import java.util.Scanner;

//Escribir un programa para comprobar si el n�mero ingresado por el usuario es positivo o negativo
public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Ingrese un n�mero: ");
		num= sc.nextInt();
		
			if(num>0) {
				System.out.println("El n�mero es positivo");
			}else System.out.println("El n�mero es negativo");

	}

}
