//Obetener el valor más bajo y más alto guardado en un TreeSet

package anais_pinpingos.laboratorio13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class ValorBajoAlto {

	private static TreeSet<Integer> tsetNumeros = new TreeSet<>();
	static Scanner entrada = new Scanner(System.in);
	
	public static void adicionar(int cantidad) {
		try {
			Random random = new Random();
			
			for (int i = 0 ; i < cantidad ; i++){
				tsetNumeros.add(random.nextInt(100)); // numero random entre 0 - 100
			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		
		System.out.println("Ingrese cantidad de numeros aleatorios del TreeSet a generar:");
		int cantidad = Integer.parseInt(entrada.nextLine());
		adicionar(cantidad);
		System.out.println("TREESET GENERADO");
		System.out.println("----------------");
		for (Integer temp : tsetNumeros) {
			System.out.println(temp);   // este tipo de coleccion TreeSet se ordena ascendente siempre 
		}
		
		ArrayList<Integer> listaNumeros = new ArrayList<>(tsetNumeros);
		System.out.println("----------------------------------------------");
		System.out.println("El valor más bajo del TreeSet  es: " + Collections.min(listaNumeros));
		System.out.println("El valor más alto del TreeSet es: " + Collections.max(listaNumeros));
	}

}
