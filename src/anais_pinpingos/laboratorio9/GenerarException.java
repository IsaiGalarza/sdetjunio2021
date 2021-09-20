//Escribe un programa para lanzar un excepción ArrayIndexOutOfBoundsException

package anais_pinpingos.laboratorio9;

import java.util.Scanner;

public class GenerarException {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		try {
			
			System.out.print("Ingrese cadena: " );
			String cadena = entrada.nextLine();
			
			Obtener objObtener = new Obtener();

			objObtener.Imprimir(cadena);			

		}

		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Error por indice no existente: " + a.getMessage());
			a.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Error generico: " + e.getMessage());
			e.printStackTrace();
		}
	
		
	}

}
