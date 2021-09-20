package wendolyn_lugo.laboratorio8;

public class Ejercicio2 {
//Clases de envoltura con la clase de envoltura hay que llegar toString

	public static void main(String[] args) {
		int edad = 35;
		double precio = 20.5;

		if (edad == 35) {

		}

		if (precio == 20.5) {

		}

		Integer edadEnvoltura = new Integer(35);
		System.out.println("cadena: " + edadEnvoltura.toString().substring(1));

		Double precioEnvoltura = new Double(20.5);
		System.out.println(precioEnvoltura.intValue());
	}
}