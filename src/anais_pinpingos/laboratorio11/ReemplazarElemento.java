// 2. Reemplazar un elemento en el indice especificado en una ArrayList

package anais_pinpingos.laboratorio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReemplazarElemento {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<String> colores = new ArrayList<>();
		String reemplazo;
			
		colores.add("BLANCO");   //0
		colores.add("AZUL");      //1
		colores.add("AMARAILLO");    //2
		colores.add("ANARANJADO");    //3
		colores.add("MORADO");  //4
		colores.add("NEGRO");   //5
		colores.add("ESMERALDA");    //6
		colores.add("PLOMO");    //7
		
		
		System.out.println("Ingrese nuevo color:");
		reemplazo = entrada.nextLine();
		System.out.print("\n");
		System.out.println("LISTA DE COLORES");
		System.out.println("----------------");	
		for(int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i) + "....... indice " + i);
		}
		System.out.print("\n");
		System.out.println("Ingrese indice del color a reemplazar:");
		int  indice = entrada.nextInt();
		
		if(indice >= colores.size()) {
			System.out.println(".... indice ingresado no existe");
		}else {
				colores.remove(indice);
				colores.add(indice, reemplazo);
			    System.out.println("... color reemplazado");
			    System.out.print("\n");
				System.out.println("LISTA DE COLORES ACTUALIZADA");
				System.out.println("----------------");		
				for(int i = 0; i < colores.size(); i++) {
					System.out.println(colores.get(i) + "... indice " + i);
				}		
		
		}

	}

	
}
