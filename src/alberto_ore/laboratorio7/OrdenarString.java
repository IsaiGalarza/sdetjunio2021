package alberto_ore.laboratorio7;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarString {

	public static void main(String[] args) {

		/*
		 * String[] srt = { "Ciaz", "Alto", "Swift", "Dezire", "Brezza" };
		 * Arrays.sort(srt);
		 */

		String[] srt = new String[5];
		String cadena = "";
		Scanner ent = new Scanner(System.in);

		for (int i = 0; i < srt.length; i++) {
			System.out.println("Ingresa al " + i + " cadena:");
			srt[i] = ent.nextLine();
			cadena += srt[i];
		}

		Arrays.sort(srt);

		for (String i : srt) {
			System.out.print(i + ", ");
		}

	}

}
