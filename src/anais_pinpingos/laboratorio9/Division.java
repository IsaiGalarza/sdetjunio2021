// Escribe un programa con try, catch y el bloque finally

package anais_pinpingos.laboratorio9;

import java.util.Scanner;

public class Division {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		try {
			
			System.out.println("Ingree divisor: ");
			int numero1 = entrada.nextInt();
			System.out.println("Ingree dividendo: ");
			int numero2 = entrada.nextInt();
			
			int result = numero1/numero2;
			
			System.out.println("Resultado de la  Divisón es: " + result);

		}

		catch (ArithmeticException ae) {
			System.out.println("Error aritmetico: " + ae.getMessage());
			ae.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Error generico: " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println(" ... Se finaliza ");
		}
		
		
	}

}