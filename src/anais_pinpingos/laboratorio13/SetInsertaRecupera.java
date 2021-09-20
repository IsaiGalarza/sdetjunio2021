//Crea un Set e inserta y recupera los valores
package anais_pinpingos.laboratorio13;

import java.util.HashSet;
import java.util.Scanner;

public class SetInsertaRecupera {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HashSet<String> colores = new HashSet<>();
		String reemplazo;
			
		colores.add("BLANCO");   
		colores.add("AZUL");      
		colores.add("AMARAILLO");    
		colores.add("ANARANJADO");  
		colores.add("MORADO");  
		colores.add("NEGRO");  

		System.out.println("LISTA DE COLORES");
		System.out.println("----------------");	
		/*for(int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i) + "....... indice " + i);
		}*/
		for (String temp : colores) {
			System.out.println("nombres:" + temp);
		}
		
		System.out.print("\n");
		System.out.println("Ingrese un nuevo color:");
		reemplazo = entrada.nextLine();
		colores.add(reemplazo);
		System.out.print("\n");
		System.out.println("LISTA DE COLORES ACTUALIZADA");
		System.out.println("----------------");
		for (String temp : colores) {
			System.out.println("nombres:" + temp);
		}
		
		
	}
	
}
