/*Escriba un programa para ordenar los String del Array (bubble sort)*/

package anais_pinpingos.laboratorio7;

import java.util.Scanner;

public class OrdenarString {
	
	static Scanner entrada = new Scanner (System.in);
	private static String[] marca;

	public static void main(String[] args) {
		
		String opcion;
		int n;
		
		OrdenarString instMarca = new OrdenarString();
		
		System.out.println("Seleccione Opción " );
		System.out.println("A _Ordenar lista de marcas : Ciaz, Alto, Swift, Dezzire, Brezza" );
		System.out.println("B _Ingresar marcas nuevas para ordenar" );
		opcion = entrada.nextLine();
	
			switch (opcion.toLowerCase()) {
			case "a":
				String[] marca1 = {"Ciaz","Alto","Swift","Dezzire","Brezza"};
				System.out.println("MARCAS ORDENADAS");
				instMarca.Ordenar(marca1);
				
				break;
			case "b":
				System.out.println("Ingresar cantidad de elementos:" );
				n = Integer.parseInt(entrada.nextLine());
				instMarca.LeerMarcas(n);
				System.out.println("MARCAS ORDENADAS");
				instMarca.Ordenar(marca);
				
				break;
				
			default:
				System.out.println("Opción Incorrecta");
				break;
			}

	}
	
	
	public void Ordenar(String[] m) {
		String temp;
		String[] mc = m;
		
		for (int i = 0; i < mc.length; i++) {
		   	   for (int j = i + 1; j < mc.length; j++) {
			//usamos metodos comrpareTo
				if (mc[j].compareTo(mc[i]) < 0) {
					temp = mc[i];
					mc[i] = mc[j];
					mc[j] = temp;
				}
			   }
			System.out.println(mc[i]);
			}
	
	}
	
	public void LeerMarcas(int n) {
		
		marca = new String[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Ingrese marca " + (i+1) + ": "  );
			marca[i] = entrada.nextLine();
						
		}
	
	}


}
