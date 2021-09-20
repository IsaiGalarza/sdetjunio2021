package cynthia_urbano.laboratorio8;

import java.util.Scanner;

//Escribir un programa para adicionar un String con un double (Utilizar Clases de Envoltura)
public class Ejercicio2 {

	public static void main(String[] args) {
		String cadena, envoltura;
		Double num;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese una cadeba: ");
		cadena = sc.nextLine();
		System.out.println("Ingrese un número");
		num = Double.parseDouble(sc.nextLine());
		
		envoltura=String.valueOf(num);
		System.out.println("El string adicionado con el número double es: "+ (cadena+envoltura));
	}

}
