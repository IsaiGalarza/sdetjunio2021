// Escribe un programa para lanzar un excepción parseException mientras se analiza una fecha ingresada por el usuario.
// Convertir el formato de dd/mm/aaaa a aaaa/mm/dd si la entrada es válida.

package anais_pinpingos.laboratorio9;

import java.text.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AnalizarFecha {

	public static void main(String[] args) throws ParseException {

		try {
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			
			String fechaIngresada,fechaFormato2;
			Date fechaFormato1;
			DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

			System.out.println("Ingresar una fecha con formato 'dd/MM/yyyy' : ");
			fechaIngresada = entrada.nextLine();
			fechaFormato1 = formato.parse(fechaIngresada);  // se genera excepcion al ingresar un formato inesperado
			
			System.out.print("Fecha con Formato yyyy/MM/dd: ");
			fechaFormato2= new SimpleDateFormat("yyyy/MM/dd").format(fechaFormato1);
			System.out.println(fechaFormato2);
			
		}
		catch (ParseException p) {
			p.printStackTrace();
			System.out.println("ParseException: " + p.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception general: " + e.getMessage());
		}
	}

}
