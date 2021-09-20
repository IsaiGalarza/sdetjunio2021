package janet_nieto.laboratorio8;
//2.escribir un programa para adicionar un String con un double.(utilizar Clases de Envoltura) ok

public class Envoltura2 {


	public static Boolean ValidadEstadoCivil(String name) {
		if("YSAI".equals(name)) {
			return true;
		}else {
			return true;
		}
	}
	

	public static void main(String[] args) {
		
		if(ValidadEstadoCivil("YSAI")) {
			System.out.println("Es casado");
		}
		
		String cadena = "cadena: ";
		cadena = cadena.concat(ValidadEstadoCivil("YSAI").toString());
		System.out.println(cadena);
		
		System.out.println(ValidadEstadoCivil("YSAI").toString());
		
		
		ValidadEstadoCivil("YSAI").booleanValue();
		
		
		
		/*
		
		int edad = 35;
		double precio = 20.5;
		
		if(edad == 35) {
			
		}
		
		if(precio == 20.5) {
			
		}
		
		
		
		
		Integer edadEnvoltura = new Integer(35);
		System.out.println("cadena: " + edadEnvoltura.toString().substring(1));
		
		
		
		Double precioEnvoltura = new Double(20.5);
		System.out.println(precioEnvoltura.intValue());
		 */
	}


}
