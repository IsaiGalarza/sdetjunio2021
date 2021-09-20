package alberto_ore.laboratorio9;

public class Exception1 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 4;
		int num3 = 0;

		try {

			System.out.println("Se lanza la exception.");
			System.out.println("La operación de la suma del : " + num1 + " , " + num2 + " dividio con el número: "
					+ num3 + " es: " + (num1 + num2) / num3);

		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Se maneja la expcetion.");
			System.out.println("Exception Aritmetica.");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception genérica.");

		}

		finally {
			System.out.println("Se ejecuta parte importante del programa. Siempre es ejecutado.");
		}

	}

}
