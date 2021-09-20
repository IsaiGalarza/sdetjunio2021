package alberto_ore.laboratorio10;

public class ExceptionDefinida {

	public static void main(String[] args) throws MyException {

		int num1 = 4;
		int num2 = 0;
		System.out.println("La división de: " + num1 + " " + num2);

		try {

			System.out.println(num1 / num2);

		} catch (Exception e) {

			throw new MyException("No es posible dividir un número entre cero.", new ArithmeticException());
		}

	}

}
