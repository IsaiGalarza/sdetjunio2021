package adan_rodriguez.laboratorio14;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L14E4 {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hmPaises = new HashMap<>();
		hmPaises.put(1, "ARGENTINA");
		hmPaises.put(2, "BOLIVIA");
		hmPaises.put(3, "PERU");
		
		System.out.println(hmPaises.toString());
		System.out.println("-----------Mao to List --------------");
		List<String> list = new ArrayList<String>(hmPaises.values());
		
		System.out.println(list.toString());
	}

}
