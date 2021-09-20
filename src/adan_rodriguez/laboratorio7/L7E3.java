package adan_rodriguez.laboratorio7;

public class L7E3 {

	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo";
		
		System.out.println("-----ANTES------");
		System.out.println(cadena1);
		System.out.println(cadena2);
		
		System.out.println("------DESPUES--------");
		String cadena3= cadena1.concat(cadena2);
		
		System.out.println(cadena3);
	}

}
