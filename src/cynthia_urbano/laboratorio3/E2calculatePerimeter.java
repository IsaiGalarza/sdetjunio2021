package cynthia_urbano.laboratorio3;

public class E2calculatePerimeter {

	public static void main(String[] args) {
		E2Figuras triangulo= new E2Figuras ();
		
		System.out.println("El per�metro del tri�ngulo es: " + triangulo.perimeter(2, 4, 7));
					
		System.out.println("El per�metro del cuadrado es: " + triangulo.perimeter(3.2));
		
		System.out.println("El per�metro del rect�ngulo es: " + triangulo.perimeter(5.4,2.8));	

	}

}
