/*Escribir un programa para adicionar un String con un double*/

package anais_pinpingos.laboratorio8;

import java.util.Scanner;

public class Adicionar {

	static Scanner entrada = new Scanner (System.in);
	private static String cadena;
	private static double numero;
	
	public static void main(String[] args) {
		
		Adicionar instAdicionar = new Adicionar();
		System.out.println("Ingrese cadena de String: " );
		cadena = entrada.nextLine();
		System.out.println("Ingrese  numero double: " );
		numero = Double.parseDouble(entrada.nextLine());
		
		instAdicionar.Adiciona(cadena,numero);
		
	}
	
	public void Adiciona(String c, double n) {
		
		
		String temp = String.valueOf(n);
		String resultado = c+temp;
		
		System.out.println("La cadena string adicionado con double es :");
		System.out.println(resultado);
	}


}
