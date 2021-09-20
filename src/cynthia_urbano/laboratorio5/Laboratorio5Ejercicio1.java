package cynthia_urbano.laboratorio5;

//1. Escribir un programa para imprimir la tabla de multiplicación del 5, los primeros 10 valores.

public class Laboratorio5Ejercicio1 {

	public static void main(String[] args) {
		
		int tabla=5;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Tabla " + tabla + "x"+ i +" :"+tabla*i);
			
		}

	}

}
