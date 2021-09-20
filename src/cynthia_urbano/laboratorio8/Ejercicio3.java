package cynthia_urbano.laboratorio8;


//Escripir un programa a convertir un objeto Boolean a una variable boolean
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Boolean objeto1 = new Boolean("true");
		Boolean objeto2 = new Boolean("false");
		
		// Regresa el valor de un objeto como una variable primitiva
		boolean var1 = objeto1.booleanValue();
		System.out.println("El valor del booleano es: " + var1);
		boolean var2 = objeto2.booleanValue();
		System.out.println("El valor del booleano es: " + var2);
		
	}

}
