package cynthia_urbano.laboratorio3;

public class E2Figuras {
	
	//Per�metro del triangulo
	
	float perimeter(float l1, float l2, float l3) {
		System.out.println("Los lados del tri�ngulo son:\n" + "lado 1: " + l1+"\nlado 2: "+ l2+"\nlado 3: "+ l3);
		return l1+l2+l3;
	}

	//Per�metro del cuadrado
	
		double  perimeter(double lado ) {
			System.out.println("\nCada lado del cuadrado es: "+ lado );
			return (lado*4);
		}
		
	//Per�metro del rectangulo
		
		double perimeter(double base, double altura ) {
			System.out.println("\nLa base y altura del rectangulo son: "+ "\nBase: " + base + "\nAltura: " + altura);
			
			return ((base*2)+(altura*2));
		}
}
