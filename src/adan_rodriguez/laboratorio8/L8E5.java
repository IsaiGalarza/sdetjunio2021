package adan_rodriguez.laboratorio8;

import java.util.Scanner;

public class L8E5 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num;
		int aux=0;
		int cifra;
		System.out.println("escribe el numero a invertir");
		num=read.nextInt();
		
		
		while (num!=0) {
			cifra=num%10;
			aux=(aux*10)+cifra;
			num/=10;
		}
		
		System.out.println(aux);

	}

}
