package adan_rodriguez.laboratorio5;

import java.util.Scanner;

public class Lab5Ejercicio2 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		num1=read.nextInt();
		System.out.println("Ingresa otro numero");
		num2=read.nextInt();
		read.close();
		for(int i=num1;i<=num2;i++){
			if (esPrimo(i))
			    System.out.print(i + " ");	
		}
		

	}
	
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}

}
