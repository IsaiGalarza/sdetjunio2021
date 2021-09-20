package cynthia_urbano.laboratorio9;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/*Escribe un programa para lanzar una excepción parseException mientras se analiza una
fecha ingresada por el usuario Convertir el formato dd/mm/aaa a aaaa/mm/dd si la entrada es válida*/

public class Ejercicio3 {

	public static void main(String[] args) throws ParseException, java.text.ParseException {

		try {

			System.out.println("Ingrese una fecha dd/mm/yyyy ");
			Scanner sc = new Scanner(System.in);

			String fechaInicial = sc.nextLine();

			DateFormat formatoOriginal = new SimpleDateFormat("dd/mm/yyyy");
			java.util.Date fechaFinal = formatoOriginal.parse(fechaInicial);

			System.out.println((new SimpleDateFormat("yyyy/mm/dd").format(fechaFinal)));
		} catch (ParseException ex) {

			  ex.printStackTrace();
		} catch (Exception e) {
			System.out.println("Ha ocurrido una excepción: " + e);
		}
	}
}