//4. Encontrar el maximo y minimo de una lista usando la clase collections

package anais_pinpingos.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MaxMinList {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {

		List<Integer> listaNumeros = new ArrayList<>();
		Random random = new Random();
		
		System.out.println("Ingrese cantidad de numeros a registar:");
		int cantidad = Integer.parseInt(entrada.nextLine());
		for (int i = 0 ; i < cantidad ; i++){
			listaNumeros.add(i, random.nextInt(100)); // numero random entre 0 - 100
		}
		
		System.out.println("LISTA GENERADA");
		System.out.println("--------------");
		for (int i = 0 ; i < cantidad ; i++) {
			System.out.println(listaNumeros.get(i));
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("El numero máximo de la lista es: " + Collections.max(listaNumeros));
		System.out.println("El numero mínimo de la lista es: " + Collections.min(listaNumeros));

	}
	
}
