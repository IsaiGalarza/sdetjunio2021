package adan_rodriguez.laboratorio6;

import java.util.Scanner;

public class Lab6Ejercicio2 {

	public static void main(String[] args) {
		String aIdiomas [][] = new String [2][2];
			
	aIdiomas[0][0]="Inglaterra";
	aIdiomas[0][1]="Ingles";
	aIdiomas[1][0]="España";
	aIdiomas[1][1]="Español";
		
		for (int i=0;i<aIdiomas.length;i++) {
			for (int j=0;j<aIdiomas[i].length;j++) {
				System.out.println(aIdiomas[i][j]);
			}
			
		}


	}

}
