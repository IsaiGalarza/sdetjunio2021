package wendolyn_lugo.laboratorio9;

import java.text.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) throws ParseException {

		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String fecha;
			Date fecha1;
			DateFormat formatoOriginal = new SimpleDateFormat("dd/MM/yyyy");

			System.out.println("Ingrese una fecha en formato \"dd/MM/yyyy\": ");
			fecha = sc.nextLine();

			fecha1 = formatoOriginal.parse(fecha);
			System.out.print("Formato yyyy/MM/dd: ");
			System.out.println((new SimpleDateFormat("yyyy/MM/dd").format(fecha1)));
		} catch (ParseException pe) {
			pe.printStackTrace();
			System.out.println("ParseException: " + pe.getMessage());
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}
/*Salida
 * java.text.ParseException: Unparseable date: "Wendolyn"ParseException: Unparseable date: "Wendolyn"

	at java.text.DateFormat.parse(DateFormat.java:366)
	at Laboratorio9.Ejercicio3.main(Ejercicio3.java:22)
 */
}
