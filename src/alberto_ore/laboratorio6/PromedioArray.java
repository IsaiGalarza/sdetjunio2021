package alberto_ore.laboratorio6;

import java.util.Scanner;

public class PromedioArray {

	public static void main(String[] args) {

		int suma = 0;
		double promedio = 0;
		int[] numero = new int[8];
		Scanner ent = new Scanner(System.in);

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Ingresa el "+i+" numero:");
			numero[i] = ent.nextInt();
			suma += numero[i];
		}
		
		for(int i=0;i< numero.length;i++) {
			System.out.println("En la posicion: " +i+ " se guardó: "+numero[i]);
		}
		
		promedio = (double)suma/numero.length;
		System.out.println("\nLa suma es: " +suma);
		System.out.println("El promedio es: " + promedio);

	}

}
