package anais_pinpingos.laboratorio6;

import java.util.Scanner;

public class PromedioArray {

	static Scanner entrada = new Scanner (System.in);
	private static int n;
	private static int[] array;
	
	
	public static void main(String[] args) {
	
		PromedioArray instProm = new PromedioArray();
		System.out.println("Ingrese tamaño cantidad de elementos del Array: " );
		n = Integer.parseInt(entrada.nextLine());
		instProm.GenerarArray(n);
		
		instProm.CalcularPromedio(n);
	}
	
	public void GenerarArray(int n) {
		array = new int[n];

		for(int i = 0; i < n; i++) {
			array[i] = (int)(Math. random()*10+1);
						
		}
		
		System.out.println(" " );
	}
	
	public void CalcularPromedio(int n) {
		int suma=0;
		float promedio=0;
		
		System.out.println("Para el Array con valores: " );
		for(int i = 0; i < n; i++) {
			System.out.println(array[i] + " ");			
		}		
		
		for(int j = 0; j < n; j++) {
			suma = suma + array[j];
						
		}
		promedio=suma/n;
		System.out.println("El promedio es: " + promedio );
	}

}
