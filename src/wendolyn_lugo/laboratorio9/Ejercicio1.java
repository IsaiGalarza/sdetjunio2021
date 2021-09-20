/**
 * 
 */
package wendolyn_lugo.laboratorio9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author wendolyn.lugo
 *Escribe un programa con try, catch y el bloque finally
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
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

}
