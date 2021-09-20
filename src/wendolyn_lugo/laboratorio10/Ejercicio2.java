package wendolyn_lugo.laboratorio10;

public class Ejercicio2 {

	public static void main (String[] args) {
		
		try {
			System.out.println("Bloque a validar ");
			int num = -1;
			if (num > 0) {
				num = num/0;
			} else {
			Integer.parseInt(null);
			}
		} catch (ArithmeticException ae) {
			System.out.println("Excepcion Aritmetico");
		}
		catch (NullPointerException np) {
			System.out.println("Excepcion Nullos");
		}
		catch (NumberFormatException nf) {
			System.out.println("Excepcion Number");
		}
	}
}
