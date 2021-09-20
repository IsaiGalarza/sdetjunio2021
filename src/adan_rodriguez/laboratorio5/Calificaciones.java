package adan_rodriguez.laboratorio5;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		
		int alumnos = 0;
		String materia1="Electronica";
		String materia2="Dibujo de Ingeniería";
		String materia3="Civil";
		String materia4="Mecanica";
		String materia5="Matemáticas";
		
		double califM1=0.0;
		double califM2=0.0;
		double califM3=0.0;
		double califM4=0.0;
		double califM5=0.0;
		
			
		Scanner read = new Scanner(System.in);
		
		System.out.println("Inserta Cantidad de alumnos");
		alumnos=read.nextInt();
		
		for(int i=1;i<=alumnos;i++) 
		{
			System.out.println("Alumno "+ i);
			System.out.println("Inserta Calificacion de " + materia1);
			califM1=read.nextDouble();
			System.out.println("Inserta Calificacion de " + materia2);
			califM2=read.nextDouble();
			System.out.println("Inserta Calificacion de " + materia3);
			califM3=read.nextDouble();
			System.out.println("Inserta Calificacion de " + materia4);
			califM4=read.nextDouble();
			System.out.println("Inserta Calificacion de " + materia5);
			califM5=read.nextDouble();
			
			califica(califM1, califM2, califM3, califM4, califM5);
			
			
		}

		read.close();
	}
	
	static void califica (double a, double b, double c, double d, double e)
	{
		double promedio=(a+b+c+d+e)/5;
		if (promedio<=39.99)
		{
			System.out.println("Deficiente: "+promedio);
		}
		else if(promedio>=40 && promedio<=59.99)
		{
			System.out.println("Promedio: "+promedio);			
		}
		else if(promedio>=60 && promedio<=74.99)
		{
			System.out.println("Bueno: "+promedio);
		}
		else if(promedio>=75 && promedio<=89.99)
		{
			System.out.println("Muy Bueno: "+promedio);
		}
		else if(promedio>=90 && promedio<=100.00)
		{
			System.out.println("Excelente: "+promedio);
		}
		
	}

}
