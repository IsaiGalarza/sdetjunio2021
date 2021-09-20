package adan_rodriguez.laboratorio9;

import java.util.Scanner;

public class L9E1 {

	public static void main(String[] args) {

		int num;
		Scanner read = new Scanner(System.in);
		
		try {
			System.out.println("Ingresa un numero, se imprimiran sus divisores");
			num = read.nextInt();
			for (int i = 1; i <= num; i++) {
				if(num%i==0)
					System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" Excepcion :( ");
		} finally {
			System.out.println(" Finally :) ");
		}
		read.close();

	}

}
