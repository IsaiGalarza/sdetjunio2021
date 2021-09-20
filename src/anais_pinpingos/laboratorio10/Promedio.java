package anais_pinpingos.laboratorio10;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {

		try {
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Ingree suma total de las edades: ");
			int edades = sc.nextInt();
			System.out.println("Ingree cantidad de personas: ");  // hay que ingresar  para generar una excepción
			int personas = sc.nextInt();
			
			CalcularPromedio myObjetoPromedio = new CalcularPromedio(edades,personas);
			
			System.out.println("El Promedio de edades es : " + myObjetoPromedio.Promediar());

		}catch (MiExcepcion me) {  //escribimos el nombre de nuestra excepcion para que se atrape
			System.out.println("Error aritmetico al dividir: " + me.getMessage());
			me.printStackTrace();
		}
	
		
		
		
	}

}