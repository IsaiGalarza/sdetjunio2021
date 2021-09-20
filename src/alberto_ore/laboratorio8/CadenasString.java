package alberto_ore.laboratorio8;

public class CadenasString {

	public static void main(String[] args) {

		StringBuilder string1 = new StringBuilder("Felicidades!");
		StringBuffer string2 = new StringBuffer("Felices Fiestas Patrias");

		string1.append(" Alberto ");
		string2.append(" Arriba Perú!");

		System.out.println(string1 + " " + string2);

	}

}
