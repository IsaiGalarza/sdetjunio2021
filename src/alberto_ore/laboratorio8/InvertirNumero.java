package alberto_ore.laboratorio8;

public class InvertirNumero {

	public static void main(String[] args) {

		int numero = 1234;
		int invertido = 0;
		int resto;
		int i = 0;

		while (numero > 0) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;
			i++;
		}
		System.out.println("Numero invertido: " + invertido);

	}

}
