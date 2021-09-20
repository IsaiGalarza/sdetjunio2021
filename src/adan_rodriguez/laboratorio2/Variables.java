package adan_rodriguez.laboratorio2;

public class Variables {
	
	public static int entero=0;
	static public String cadena;

	
	public static void main (String [] args) {
		
		Imprimir();
		
	}

	public static void Imprimir() {
		
		double num1=15.69875;
		cadena="Hola, soy una cadena de datos";
		
		System.out.println("Imprime un valor entero "+ entero++ );
		System.out.println("Imprime una cadena " + cadena);
		System.out.println("Imprime un valor tipo doble " + num1);
		
	}

}
