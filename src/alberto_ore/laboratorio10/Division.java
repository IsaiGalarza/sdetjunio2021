package alberto_ore.laboratorio10;

public class Division extends Operacion {

	public Division(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {

		Operacion operacion1 = new Operacion();
		Operacion operacion2 = new Operacion();

		try {
			System.out.println("La división 1 es: " + operacion1.realizarDivision(16, 8));
			System.out.println("La división 2 es: " + operacion2.realizarDivision(16, 0));

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
