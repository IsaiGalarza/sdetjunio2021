package adan_rodriguez.laboratorio13;

import java.util.TreeSet;

public class Lab13E4 {

	public static void main(String[] args) {

		TreeSet<String> tsetNombres = new TreeSet<>();

		tsetNombres.add("JUAN");
		tsetNombres.add("PEDRO");
		tsetNombres.add("ADAN");
		
		System.out.println("Primer elemento: "+tsetNombres.first());
		System.out.println("Ultimo elemento: "+tsetNombres.last());
		
		System.out.println("TreeSet:  ");
		for (String temp : tsetNombres) {
			System.out.println(temp);
		}



	}

}
