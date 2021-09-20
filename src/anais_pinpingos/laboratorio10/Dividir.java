package anais_pinpingos.laboratorio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividir {

	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Ingree divisor: ");
			int numero1 = sc.nextInt();
			System.out.println("Ingree dividendo: ");
			int numero2 = sc.nextInt();
			
			int result = numero1/numero2;
			
			System.out.println("Resultado  Divisón: " + result);

		}

		catch (ArithmeticException ae) {
			System.out.println("Error aritmetico: " + ae.getMessage());
			ae.printStackTrace();
		}
		catch(InputMismatchException ie){
            sc.nextLine();
            System.out.println("Debe introducir un número entero " + ie.toString());                          
		}
		catch (Exception e) {
			System.out.println("Error generico: " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}