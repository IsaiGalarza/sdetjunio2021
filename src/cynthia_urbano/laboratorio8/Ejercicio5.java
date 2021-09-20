package cynthia_urbano.laboratorio8;


import java.util.Scanner;

//Escribir un programa para invertir un número usando recursividad

public class Ejercicio5 {
	public static void main(String[] args) {

		int num;
		int aux=0;
		int inv2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el número a invertir: " );
		num = sc.nextInt();
		
		Ejercicio5 invertido=new Ejercicio5();
		
		inv2=invertido.invertir(num, aux);
		
		System.out.println("El número invertido es: " + inv2);

	}

	int invertir (int num, int aux) {
		
		if(num > 0) {
			return invertir (num/10, num%10+aux*10);
		}else {
			return aux;
		}
	}

}
