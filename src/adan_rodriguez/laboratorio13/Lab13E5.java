package adan_rodriguez.laboratorio13;

import java.util.TreeSet;

public class Lab13E5 {

	public static void main(String[] args) {

		TreeSet<Integer> tsetEdades = new TreeSet<>();
		
		Object[] myArray;

		tsetEdades.add(50);
		tsetEdades.add(15);
		tsetEdades.add(35);
		
		myArray = tsetEdades.toArray();
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Edad: "+ myArray[i]);
			
		}


	}

}
