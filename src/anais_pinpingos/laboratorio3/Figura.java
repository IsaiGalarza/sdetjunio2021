package anais_pinpingos.laboratorio3;

import java.util.Scanner;

public class Figura extends Perimetro {

	static Scanner entrada = new Scanner (System.in);
	public Figura() {

	}
	
	public Figura(int lado1, int perimetro, String nombre, int lados) {
		super(lado1,perimetro,nombre,lados);
	}

	//Sobrecarga de Metodos
	public void calcultePerimeter(int lado1,int lado2, String nombre,int lados) {
		setPerimetro(2*(lado1+lado2));
		setNombre(nombre);
		setLados(lados);
		System.out.println("Lados del Rectangulo: "+ lado1+" y "+lado2);
	}
	
	public void calcultePerimeter(int lado1,int lado2,int lado3, String nombre,int lados) {
		setPerimetro(lado1+lado2+lado3);
		setNombre(nombre);
		setLados(lados);
		System.out.println("Lados del Triangulo: "+ lado1+", "+lado2+" y "+lado3);
	}
	
	public void calcultePerimeter(int radio, String nombre) {
		setPerimetro((int)(2*Math.PI*radio));
		setNombre(nombre);
		System.out.println("Radio del Circulo: "+ radio);
	}

	
	public static void main(String[] args) {
		
		Figura instCuadrado= new Figura();
		instCuadrado.calcultePerimeter(2, "CUADRADO",4);
		System.out.println("El perimetro del " + instCuadrado.getNombre() + " que tiene " + instCuadrado.getLados() + " lados es: " + instCuadrado.getPerimetro() +"\n");
		
		Figura instRectangulo= new Figura();
		instRectangulo.calcultePerimeter(2,4,"RECTANGULO",4);
		System.out.println("El perimetro del " + instRectangulo.getNombre() + " que tiene " + instRectangulo.getLados() + " lados es: " + instRectangulo.getPerimetro() +"\n");

		Figura instTriangulo= new Figura();
		instTriangulo.calcultePerimeter(2,5,7,"TRIANGULO",3);
		System.out.println("El perimetro del " + instTriangulo.getNombre() + " que tiene " + instTriangulo.getLados() + " lados es: " + instTriangulo.getPerimetro() +"\n");
		
		Figura instCirculo= new Figura();
		instCirculo.calcultePerimeter(5,"CIRCULO");
		System.out.println("El perimetro del " + instCirculo.getNombre() + " es: " + instCirculo.getPerimetro() +"\n");
		

	}

}
