package cynthia_urbano.laboratorio11;

import java.util.ArrayList;
import java.util.Arrays;

//Buscar un elemento de la ArrayList de java
public class Ejercicio3 {

	public static void main(String[] args) {

		ArrayList<String> listaNombres = new ArrayList<String>(Arrays.asList("Oliva", "Brenda", "Alan"));

		System.out.println("Lista"+ listaNombres);
				
		String elementoB = "Prd";
		
		boolean existe = listaNombres.contains(elementoB);
		if (existe) {
			System.out.println("El elemento " + elementoB +" sí existe en la lista");
		} else {
			System.out.println("El elemento " + elementoB +" no existe en la lista");
		}
	}

}
