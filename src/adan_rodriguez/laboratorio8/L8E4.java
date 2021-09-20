package adan_rodriguez.laboratorio8;

import java.util.Scanner;

public class L8E4 {

	public static void main(String[] args) {

		StringBuilder cadenaBl = new StringBuilder("Ejemplo Cadena Builder ");
		StringBuffer cadenaBf = new StringBuffer("Ejemplo Cadena Buffer ");
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("¿Cuantas cadenas agregaras?");
		int num=read.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("Cadena Builder[" + (i+1) + "]: " );
			cadenaBl.append(read.next());
			
			System.out.println("");
			
			System.out.println("Cadena Buffer[" + (i+1) + "]: " );
			cadenaBf.append(read.next());
			System.out.println("");
		}
		
		System.out.println(cadenaBl);
		System.out.println(cadenaBf);
		
	}

}
