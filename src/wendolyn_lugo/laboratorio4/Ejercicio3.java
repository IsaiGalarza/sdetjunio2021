package wendolyn_lugo.laboratorio4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Escriba un n�mero: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("El n�mero: "+ numero +" es Positivo");
		}
		else 
			System.out.println("El n�mero: "+ numero +" es Negativo");
	}
}
