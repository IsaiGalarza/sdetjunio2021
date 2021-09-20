/*Escribe un programa para encontrar las mayusculas y las inusculas en la cadena*/

package anais_pinpingos.laboratorio7;

import java.util.Scanner;

public class Caracteres {

	static Scanner entrada = new Scanner (System.in);
	static String mayusculas="",minusculas="";

	public static void main(String[] args) {
		
		String characters = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
		
		Caracteres instChar = new Caracteres();
		
		System.out.println("CADENA: " );
		System.out.println(characters);
		instChar.Encontrar(characters);
		System.out.print('\n');
		System.out.println("MINUSCULAS: " );
		System.out.print(minusculas + '\t');
		System.out.print('\n');
		System.out.println("MAYUSCULAS: " );		
		System.out.print(mayusculas + '\t');
	}
	
	public void Encontrar(String cadena) {
		
		char[] c = cadena.toCharArray();

		for (int i = 0; i < c.length; i++) {
			
		  	if(Character.isUpperCase(c[i])) {
		  		mayusculas = mayusculas + c[i] + " ";

		   	}
		   	else if(Character.isLowerCase(c[i])){
		   		minusculas = minusculas + c[i] + " ";

		   	}
		}
	}
	
	
}
