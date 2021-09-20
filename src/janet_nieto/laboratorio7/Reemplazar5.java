package janet_nieto.laboratorio7;
//Escribe un programa para reemplazar el caracter 'P'con el caracter 'F'
public class Reemplazar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String cadena5 = "Pan Pun Prank Pit Pat";
		System.out.println("Cadena original: " + cadena5);
		String aux =  cadena5.replaceAll("P", "F"); 
		System.out.println("Replace All: " + aux);

		
	}

}
