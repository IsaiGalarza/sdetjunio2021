package adan_rodriguez.laboratorio6;

import java.util.Scanner;

public class Lab6Ejercicio1 {

	public static void main(String[] args) {
		double promedio=0;
		double aPromedio [] = new double [5];
		Scanner read = new Scanner(System.in);
		
		for (int i=0;i<aPromedio.length;i++) {
			System.out.println("Inserte valor en indice [" + i +"] del arreglo");
			aPromedio[i]=read.nextDouble();
			promedio=(promedio+aPromedio[i]);
		}
		System.out.println("Promedio "+ (promedio/5));
		read.close();

	}

}
