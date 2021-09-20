package alberto_ore.laboratorio3;

import java.util.Scanner;

public class Figuras implements IPerimetros{
	private int numeroLados;
	private double lado;
	private double altura;
	
	public static void main(String[] args) {
		
		Figuras Figura = new Figuras();
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingresa número de lados");
		Figura.numeroLados=read.nextInt();
		
	
		if (Figura.numeroLados==4)
		{
			System.out.println("Escribe el valor del lado");
			Figura.lado=read.nextDouble();
			Figura.calculatePerimeter(Figura.numeroLados, Figura.lado);
		}
		if (Figura.numeroLados==3)
		{
			System.out.println("Escribe el valor de la base");
			Figura.lado=read.nextDouble();
			System.out.println("Escribe el valor de la altura");
			Figura.altura=read.nextDouble();
			Figura.calculatePerimeter(Figura.numeroLados, Figura.lado, Figura.altura);
		}
		if (Figura.numeroLados==1)
		{
			System.out.println("Escribe el valor del diametro del circulo");
			Figura.lado=read.nextDouble();
			Figura.calculatePerimeter(Figura.lado);
		}
		if(!(Figura.numeroLados==1||Figura.numeroLados==3||Figura.numeroLados==4)) 
		{
			System.out.println("Aun no se agrega esa figura");
		}
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		
	}
	
	public void calculatePerimeter(double numlados, double lado) {
		double perimetro=numlados*lado;
		System.out.println("Perimetro de la figura: "+perimetro);
	}
	
	public void calculatePerimeter(double numlados, double base, double altura) {
		double perimetro=(2*altura)+base;
		System.out.println("Perimetro de la figura: "+perimetro);
	}
	
	public void calculatePerimeter(double diametro) {
		double perimetro=diametro*3.1416;
		System.out.println("Perimetro de la figurar: "+perimetro);
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


}
