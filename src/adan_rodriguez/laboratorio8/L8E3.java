package adan_rodriguez.laboratorio8;

import java.util.Date;

public class L8E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean Bandera = new Boolean(true);
		
		Date fecha = new Date();
		Bandera.booleanValue();
		
		int i=0;
		while(Bandera && i<=5) {
			
			System.out.println(fecha.toString());
			
			if(i==4) {
				Bandera=false;
			}
			i++;
		}

			
	}

}