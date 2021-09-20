package anais_pinpingos.laboratorio2;

import java.util.Scanner;

public class Registro {

	private static int edad=18; //variable estatica
	private Persona objPersona= new Persona("","","");
	
	Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Registro instancia = new Registro();
		instancia.ingresarPersona();
		instancia.mostrarPersona();

	}

	public void ingresarPersona() {
		
		System.out.println("Ingresar Nombre: ");
		objPersona.setNombre(entrada.nextLine());
		
		System.out.println("Ingresar Apellido: ");
		objPersona.setApellido(entrada.nextLine());
		
		System.out.println("Ingresar Pais: ");
		objPersona.setPais(entrada.nextLine());

	}
	
	public void mostrarPersona() {
		
		System.out.println("Mostrando Registro de:");
		System.out.println(objPersona.nombreCompleto());  // Imprimiendo variable local devuelta de la funcion que concatena nombre y apellido 
		System.out.println("Edad:" + edad);    // Imprimiendo variable estatica edad 
		System.out.println("Pais:" + objPersona.getPais()); // Imprimiendo variable de instancia pais 
	} 
}
