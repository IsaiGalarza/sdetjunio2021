package alberto_ore.laboratorio9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionFecha {

	public static void main(String[] args) {

		String fecha = "19/11/2011";
		boolean res = true;

		try {

			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			formatoFecha.setLenient(false);
			formatoFecha.parse(fecha);

			if (res == true) {

				System.out.println("Fecha válida.");
				System.out.println("Fecha ingresada: dd/MM/yyyy: " +   new SimpleDateFormat("dd/MM/yyyy").format(formatoFecha.parse(fecha)));
				System.out.println("Fecha cambiada por tener formato correcto a: yyyy/MM/dd: " + new SimpleDateFormat("yyyy/MM/dd").format(formatoFecha.parse(fecha)));

			} else {

				System.out.println("Fecha no es válida.");
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}