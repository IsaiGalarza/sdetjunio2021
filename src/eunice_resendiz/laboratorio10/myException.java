package eunice_resendiz.laboratorio10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class myException {
	public myException(String fecha) throws ParseException {
		Date oFecha;
		
		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		oFecha = df1.parse(fecha);
		
		if(!df1.format(oFecha).equals(fecha)){
			System.out.println("Error en el formato");
		}
		
	}
	
	public void CadenaEntrada() {
		System.out.println ("Error en la entrada de la fecha");
	}
	

}
