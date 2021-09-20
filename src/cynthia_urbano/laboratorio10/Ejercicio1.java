package cynthia_urbano.laboratorio10;

import java.util.Scanner;

//Escribe un programa donde es lanzada una excepci�n definida por el usuario
public class Ejercicio1 {
	
	   void validarEdad(int edad) throws edadInvalida {
	        if (edad <= 100 && edad > 0) {
	            System.out.println("Edad v�lida");
	        } else {
	            throw new edadInvalida("la edad no es v�lida");
	        }
	    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = sc.nextInt();
		Ejercicio1 eje = new Ejercicio1();
		try {
			eje.validarEdad(edad);
		} catch (edadInvalida e) {
			System.out.println("Edad inv�lida, " + e.getMessage());
		}
	}

}
