package cynthia_urbano.laboratorio5;
//2. Escribir un programa para mostrar números primos entre dos números dónde obtienes del usuario las 2 entradas para el rango.
import java.util.Scanner;

public class Laboratorio5Ejercicio2 {

	public static void main(String[] args) {
		
		int numI, numF;
		boolean bandera;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese el rango inicial: ");
		numI= sc.nextInt();
		System.out.println("Ingrese el rango final: ");
		numF= sc.nextInt();
		
		int contador=0;
		
		for (int i = numI; i < numF; i++) {
			bandera=true;
			for(int j=2; j < i;j++) {
				if(i%j==0) {
					bandera=false;
							
				}
				
			}
			
			if (bandera) {
				System.out.println("El número " + i +" es primo.");
			}
			
		}

	}

}
