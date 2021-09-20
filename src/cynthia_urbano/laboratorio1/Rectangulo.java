package cynthia_urbano.laboratorio1;

public class Rectangulo {

	public static void main(String[] args) {
		
		//Declaración de variables
		float lado1;
		float lado2; 
		
		//Se declara el objeto
	OperacionesRectangulo rectangulo1= new OperacionesRectangulo (5,7);
	
		//Se imprimen los resultados de los métodos para el objeto rectangulo1 
	System.out.println("El perímetro es: "+ rectangulo1.Perimetro());
	System.out.println("El área es: "+ rectangulo1.Area());
	
	
		
	}

}
