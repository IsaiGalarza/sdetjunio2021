package cynthia_urbano.laboratorio4;

import java.util.Scanner;

//Escribir un programa para comprobar si el número ingresado por el usuario es positivo o negativo
public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Ingrese un número: ");
		num= sc.nextInt();
		
			if(num>0) {
				System.out.println("El número es positivo");
			}else System.out.println("El número es negativo");

	}

}
