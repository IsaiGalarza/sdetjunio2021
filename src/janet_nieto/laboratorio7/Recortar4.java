package janet_nieto.laboratorio7;
//recortar un string
//string: 
public class Recortar4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = "    She sells sea shells on the sea shore    ";
		System.out.println("Cadena: " + cadena1);
		//String cadena2 = ""; 
		cadena1 = cadena1.substring(1,10);
		
		System.out.println("Cadena recortada: " + cadena1);
		
		
		
	}

}
