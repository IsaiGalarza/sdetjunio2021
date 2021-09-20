package anais_pinpingos.laboratorio1;

import java.util.Scanner;

public class PartesDivision {

	private Division objOperacion = new Division(0,0);
	Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		PartesDivision instancia = new PartesDivision();
		instancia.obtenerPartes();

	}
	
	public void obtenerPartes() {
		
		System.out.println("Ingresar dividendo: ");
		objOperacion.setDividendo(Integer.parseInt(entrada.nextLine()));
				
		System.out.println("Ingresar divisor: ");
		objOperacion.setDivisor(Integer.parseInt(entrada.nextLine()));
		
		System.out.println("El cociente de la divisón es: " + objOperacion.obtenerCociente(objOperacion.getDividendo(), objOperacion.getDivisor()));
		System.out.println("El residuo de la divisón es: " + objOperacion.obtenerResiduo(objOperacion.getDividendo(), objOperacion.getDivisor()));
	}

}
