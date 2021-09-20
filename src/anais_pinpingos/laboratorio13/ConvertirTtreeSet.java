//Convertir TreeSet a un Array de enteros

package anais_pinpingos.laboratorio13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class ConvertirTtreeSet {

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
		
		System.out.println("Ingrese cantidad de numeros ENTEROS del TreeSet a generar:");
		int cantidad = Integer.parseInt(entrada.nextLine());
		adicionar(cantidad);
		System.out.println("TREESET GENERADO");
		System.out.println("----------------");
		for (Integer temp : tsetNumeros) {
			System.out.println(temp);   // este tipo de coleccion TreeSet se ordena ascendente siempre 
		}
		
		ArrayList<Integer> listaNumeros = new ArrayList<>(tsetNumeros); //pasando el treeset a un array
		System.out.print("\n");
		System.out.println("TREESET CONVERTIDO A ARRAYLIST");
		System.out.println("------------------------------");
		for (int i = 0 ; i < cantidad; i++) {
			System.out.println(listaNumeros.get(i));
		}

	}


}
