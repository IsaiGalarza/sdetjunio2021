package wendolyn_lugo.laboratorio2;

//clase
public class Ejercicio3 {

	public static void main(String[] args) {

		// objetos

		Definicion TasaOCuota1 = new Definicion("Fijo", "002", "Tasa");
		Definicion TasaOCuota2 = new Definicion("Rango", "003", "Cuota", true);
		Definicion TasaOCuota3 = new Definicion("Rango", "002", "Tasa", false, true);

		System.out.println(TasaOCuota1.toString());
		System.out.println(TasaOCuota2.rangoImpuesto());
		System.out.println(TasaOCuota3.trasladoRetencion());
	}
}
