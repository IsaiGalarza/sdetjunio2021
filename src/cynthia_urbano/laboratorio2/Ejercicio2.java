package cynthia_urbano.laboratorio2;

//Escribir un programa en dónde se intercambien los valores de dos variables de tipo float

public class Ejercicio2 {

	public static void main(String[] args) {
		float aux=0;
		float num1=5;
		float num2=7;
		
		System.out.println("El valor del número 1 es: "+ num1);
		System.out.println("El valor del número 2 es: "+ num2);
		aux=num1;
		num1=num2;
		num2=aux;
		System.out.println("El nuevo valor del número 1 es: "+ num1);
		System.out.println("El nuevo valor del número 2 es: "+ num2);
		
	}

}
