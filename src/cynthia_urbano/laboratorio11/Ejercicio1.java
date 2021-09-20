package cynthia_urbano.laboratorio11;

import java.util.ArrayList;
import java.util.Arrays;

//Crear un ArrayList e insertar y recuperar un valor en un indice especificado
public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<String> listaNombres = new ArrayList<String>(Arrays.asList("Oliva", "Brenda", "Alan"));

		System.out.println("Lista inicial");
		System.out.println(listaNombres);
		listaNombres.add(0, "Lokesh");
		System.out.println("Lista final");
		System.out.println(listaNombres);
		System.out.println("elemento especifico");
		System.out.println(listaNombres.get(0));
	}

}
