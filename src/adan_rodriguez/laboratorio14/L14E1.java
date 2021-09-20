package adan_rodriguez.laboratorio14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class L14E1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		HashMap <Integer, String> hmPaises = new HashMap<>();
		hmPaises.put(1, "ARGENTINA");
		hmPaises.put(2, "BOLIVIA");
		hmPaises.put(3, "PERU");
		
		
		System.out.println(hmPaises);
		
		System.out.println("-------------------------");
		
		
		ArrayList<Integer> listKey = new ArrayList<Integer>(hmPaises.keySet());
		//ArrayList<String> listValue = new ArrayList<String>(hmPaises.values());
		
		try {
			System.out.println("Inserta el key a buscar");
			int key = read.nextInt();
			
			System.out.println("¿Existe llave? " + listKey.contains(key));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		read.close();

	}

}
