//Obtener el tamaño de un HasSet

package anais_pinpingos.laboratorio13;

import java.util.HashSet;
import java.util.Scanner;

public class TamanioHashSet {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {

		HashSet<String> colores = new HashSet<>();
			
		colores.add("BLANCO");   
		colores.add("AZUL");      
		colores.add("AMARAILLO");    
		colores.add("ANARANJADO");  
		colores.add("MORADO");  
		colores.add("NEGRO");
		colores.add("FUXIA");
		colores.add("NEGRO");

		System.out.println("LISTA DE COLORES");
		System.out.println("----------------");	
		for (String temp : colores) {
			System.out.println("nombres:" + temp);
		}
		
		System.out.print("\n");
		System.out.print("El tamaño de la lista es:  ");
		int tamanio = colores.size();
		
		System.out.print(tamanio);

		
	}

}
