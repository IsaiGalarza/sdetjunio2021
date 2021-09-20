package adan_rodriguez.laboratorio10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class L10E2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Throwable {
		String fecha = new String();

		Date oFecha = null;
		Scanner read = new Scanner(System.in);
		try {
			System.out.println("Ingresa una fecha en formato dd/mm/aaaa:");
			fecha = read.next();
					
			SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
			oFecha = df1.parse(fecha);
						
			if(!df1.format(oFecha).equals(fecha)){
				throw new myException(fecha);
			}
			
		}catch (myException e) {
			e.CadenaEntrada();
		}

			read.close();

	}

}
