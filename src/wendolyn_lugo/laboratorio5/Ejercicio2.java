package wendolyn_lugo.laboratorio5;

//import librer�a para leer desde el teclado
import java.util.Scanner;

public class Ejercicio2 {
	// Escribir un programa para mostrar n�meros primos entre dos n�meros
	// d�nde obtienes del usuario las 2 entradas para el rango

	// Llamada al programa principal
	public static void main(String[] args) {
		// Leo los rangos de n�meros
		Scanner rango = new Scanner(System.in);
		int rangomin;
		System.out.println("Escriba el rango inferior: ");
		rangomin = rango.nextInt();

		Scanner rangoS = new Scanner(System.in);
		int rangomax;
		System.out.println("Escriba el rango superior: ");
		rangomax = rangoS.nextInt();

		//
		for (int i = rangomin; i <= rangomax; i++) {
			System.out.println("El n�mero "+rangomin+ " es primo?" + ValidaPrimo(i));
		}
		
		
		
		
		// Calculo de primos divisible ent si mismo y la unidad
		// si es dividido por otro numero no es primo
		int contador_divisores = 0;
		int unidad = 1;

		while (unidad <= rangomin) {
			if (rangomin % unidad == 0) {
				contador_divisores++;
			}
			unidad++;
		}
		if(contador_divisores == 2) {

		}

	}
	
	//Se vuelve funci�n
	
	public static boolean ValidaPrimo (int rangomin) {
		return true;
	}

}
