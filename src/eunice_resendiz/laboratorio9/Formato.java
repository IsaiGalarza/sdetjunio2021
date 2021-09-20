package eunice_resendiz.laboratorio9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Formato {

	public static void main(String[] args) {
		
		String fecha= new String();
		
		Date oFecha = null;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingresa una fecha en formato dd/mm/aaaa:");
		fecha=read.next();
		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			oFecha=df1.parse(fecha);
			
			
			if(df1.format(oFecha).equals(fecha))
			{
				System.out.println("Cambiando el formato de la fecha aaaa/mm/dd");
				SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
				System.out.println("Fecha invertida: " + df2.format(oFecha));
				
			}
			else {
				System.out.println("Formato Erroneo");
			}
			
			read.close();
			
		}catch(Exception e) {
			System.out.println("Fecha invalida");
			e.printStackTrace();
		}
		
		

	}
}
