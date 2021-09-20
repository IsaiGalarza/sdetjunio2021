package cynthia_urbano.laboratorio12;

import java.util.ArrayList;
import java.util.Arrays;

//Unir dos listas usando addAll()
public class Ejercicio1 {

	public static void main(String[] args) throws Exception {
		ArrayList<String> listaUno = new ArrayList<>(Arrays.asList("Anali", "Oliva", "Armando"));

		ArrayList<String> listaDos = new ArrayList<>(Arrays.asList("Alan", "Cynthia"));

		listaUno.addAll(listaDos);
		System.out.println("La unión de las listas es: ");
		System.out.println(listaUno);
	}

}
