//Comprueba si existe un elemento en particular en un LinkedHashSet

package anais_pinpingos.laboratorio13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ComprobarElemento {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lsetDeportes = new LinkedHashSet<>();
		String depBuscado;
		
		lsetDeportes.add("FUTBOLL");
		lsetDeportes.add("VOLEY");
		lsetDeportes.add("BASKET");
		lsetDeportes.add("NATACION");
		lsetDeportes.add("SALTO ALTO");
		lsetDeportes.add("GYMNASIA");
		lsetDeportes.add("LUCHA");
		
		System.out.println("LISTA DE DEPORTES");
		System.out.println("----------------");	

		for (String dep : lsetDeportes) {
			System.out.println(dep);
		}
		
		System.out.print("\n");
		System.out.println("Ingrese un deporte a verificar en lista:");
		depBuscado = entrada.nextLine();

			if(lsetDeportes.contains(depBuscado.toUpperCase())) {
				System.out.println("El deporte se encuentra en la lista");
			}else {
				System.out.println("El deporte no se encuentra en la lista");
			}

		
	}

}
