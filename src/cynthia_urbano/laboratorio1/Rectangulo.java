package cynthia_urbano.laboratorio1;

public class Rectangulo {

	public static void main(String[] args) {
		
		//Declaraci�n de variables
		float lado1;
		float lado2; 
		
		//Se declara el objeto
	OperacionesRectangulo rectangulo1= new OperacionesRectangulo (5,7);
	
		//Se imprimen los resultados de los m�todos para el objeto rectangulo1 
	System.out.println("El per�metro es: "+ rectangulo1.Perimetro());
	System.out.println("El �rea es: "+ rectangulo1.Area());
	
	
		
	}

}
