package janet_nieto.laboratorio13;

import java.util.LinkedHashSet;

//3.Comprueba si existe un elemento en particular en un LinkedHasSet
public class LinkedHasSet3 {
public static void main(String[] args) {
		
		LinkedHashSet<String> lsetNombres = new LinkedHashSet<>();
		lsetNombres.add("JUAN");
		lsetNombres.add("PEDRO");
		lsetNombres.add("CARLOS");
		lsetNombres.add("YSAI");
		

		for (String temp : lsetNombres) {
			System.out.println(temp);
		}
		
		System.out.println("Existe CARLOS: " + lsetNombres.contains("CARLOS"));
		
   }
}