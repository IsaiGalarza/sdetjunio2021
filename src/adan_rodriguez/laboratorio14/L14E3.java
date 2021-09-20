package adan_rodriguez.laboratorio14;

import java.util.Hashtable;

public class L14E3 {
	public static void main(String[] args) {
		Hashtable<Integer, String> htPaises = new Hashtable<>();
		htPaises.put(1, "ARGENTINA");
		htPaises.put(2, "PERU");
		htPaises.put(3, "BOLIVIA");
		htPaises.put(0, "ARGELIA");
		htPaises.put(100, "ESPAÑA");

		System.out.println(htPaises.toString());

		System.out.println("-----------Borrando llave 0 y value --------------");

		htPaises.remove(0, "ARGELIA");

		System.out.println(htPaises.toString());

	}

}
