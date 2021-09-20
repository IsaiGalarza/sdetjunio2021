package cynthia_urbano.laboratorio7;

//Escribe un programa para reemplazar el cáracter 'P' con el caracter 'F' en el string "Pan Pun Prank Pit Pat"
public class Laboratorio7Ejercicio5 {

	public static void main(String[] args) {
		
		String cadena = " Pan Pun Prank Pit Pat";
		
		System.out.println("Cadena antes del remplazo: "+cadena);
		
		String str = cadena.replace('P', 'F');
		
		System.out.println("Cadena despues del remplazo: "+str);
		

	}

}
