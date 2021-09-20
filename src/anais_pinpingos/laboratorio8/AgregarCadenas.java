/*Escribir un programa para agregar cadenas usando StringBuilder y StringBuffer */

package anais_pinpingos.laboratorio8;

import java.util.Scanner;

public class AgregarCadenas {
	
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
			String opcion;
			
			AgregarCadenas instAgregar = new AgregarCadenas();
			
			System.out.println("Ingrese Opción " );
			System.out.println("A _Agregar cadena usando StringBuffer" );
			System.out.println("B _Agregar cadena usando StringBuilder" );
			opcion = entrada.nextLine();
	
				switch (opcion.toLowerCase()) {
				case "a":
					instAgregar.AgregarStringBuffer();					
					break;
					
				case "b":
					instAgregar.AgregarStringBuilder();					
					break;
					
				default:
					System.out.println("Opción Incorrecta");
					break;
				}
	}
	
	public void AgregarStringBuffer() {
		
		StringBuffer cadenaBuffer = new StringBuffer();
		System.out.println("Ingresar cadena:" );
		cadenaBuffer.append(entrada.nextLine());
		System.out.println("La cadena ingresada usando StringBuffer es:" );
		System.out.println(cadenaBuffer);
		
	}
	
	public void AgregarStringBuilder() {
		
		StringBuilder cadenaBuilder = new StringBuilder();
		System.out.println("Ingresar cadena:" );
		cadenaBuilder.append(entrada.nextLine());
		System.out.println("La cadena ingresada usando StringBuilder es:" );
		System.out.println(cadenaBuilder);
		
	}

	
}
