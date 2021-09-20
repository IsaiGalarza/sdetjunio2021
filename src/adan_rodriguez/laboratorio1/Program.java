package adan_rodriguez.laboratorio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double ladoA = 0;
		double ladoB = 0;
		double sumaLados=0;
		double cocienteLados=0;
		double restoLados=0;
		
		Scanner reader= new Scanner(System.in);
	
		System.out.println("Caso 1 Calculo Perimetro y Área");
		System.out.println("Escribe lado A del Rectángulo: ");
		ladoA = reader.nextDouble();
		System.out.println("Escribe lado B del Rectángulo: ");
		ladoB =reader.nextDouble();
		
		Operaciones oPerimetro = new Operaciones();
		Operaciones oArea= new Operaciones();
		System.out.println( "El perimetro es :" + oPerimetro.calculaPerimetro(ladoA, ladoB) );
		System.out.println( "El área es :" + oArea.calculaArea(ladoA, ladoB) );
		
		System.out.println("Caso 2 Operadores Unuarios");
		sumaLados=(ladoA+ladoB);
		System.out.println("La suma de los lados es :" + sumaLados);
		if (sumaLados!=0) {
			System.out.println("Entré a decremento "+ --sumaLados);
			
		}else {
			System.out.println("Enré en incremento" + ++sumaLados);
			
		}
		sumaLados++;
		System.out.println("Estoy afuera del If y estoy incrementando " + sumaLados++);
		System.out.println("Estoy afuera del If y estoy incrementando de nuevo " + sumaLados);
		
		System.out.println("Caso 3 Operadores Cociente y Resto");
		cocienteLados=ladoA/ladoB;
		restoLados=ladoA%ladoB;
		System.out.println("El Cocinete de lado A entre lado B es :"+cocienteLados);
		System.out.println("El Resto (módulo) de lado A entre lado B es :"+restoLados);
		
		reader.close();

	}

}
