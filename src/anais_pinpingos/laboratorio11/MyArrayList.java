//1. Crea un ArrayList e insertar y recuperar un valor en un indice especificado. 

package anais_pinpingos.laboratorio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArrayList {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<String> colores = new ArrayList<>();
			
		System.out.println("LISTA DE COLORES");
		System.out.println("----------------");
		System.out.println("Ingrese un color:");
		String color = entrada.nextLine();
		System.out.println("Ingrese posici�n donde insertar el elemento:");
		int  indice1 = entrada.nextInt();
				
		for(int i = 0; i < indice1+1; i++) {
			
			if(i==indice1) {
				colores.add(i,color);
				System.out.println(".... color insertado en el indice "+ indice1 + " / posici�n " + (indice1+1));
			}else {
				colores.add(i,"");
			}
			
		}		
		
		System.out.println("\n");
		System.out.println("Ingrese posici�n del elemento a recuperar:");
		int  indice2 = entrada.nextInt();
			
		if(indice2 >= colores.size()) {
			System.out.println(".... la posici�n ingresada no existe");
		}else if (colores.get(indice2)==""){
				System.out.println(".... la posici�n ingresada no contiene datos");
			}else {
				String colorRecuperado=colores.get(indice2);
				System.out.println("El color recuperado es : " + colorRecuperado);
			}
		

	}

}
