//3. Buscar un elemento en la ArrayList de Java

package anais_pinpingos.laboratorio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscarElemento {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<String> colores = new ArrayList<>();
		
		colores.add("BLANCO");   //0
		colores.add("AZUL");      //1
		colores.add("AMARAILLO");    //2
		colores.add("ANARANJADO");    //3
		colores.add("MORADO");  //4
		colores.add("NEGRO");   //5
		colores.add("ESMERALDA");    //6
		colores.add("PLOMO");    //7
			
		System.out.println("LISTA DE COLORES");
		System.out.println("----------------");
		for(int i = 0; i < colores.size(); i++) {
			System.out.println((i+1) + " " + colores.get(i));
		}
		System.out.println("\n");
		System.out.println("Ingrese un color a buscar:");
		String color = entrada.nextLine();
	
		if(colores.contains(color.toUpperCase())) {
			int  indice = colores.indexOf(color.toUpperCase());
			System.out.println("El color buscado existe en la lista y esta en la posición " + (indice+1));
		}else{
			System.out.println("El color ingresado no se encuentra en la lista");
			}

	}
	
}
