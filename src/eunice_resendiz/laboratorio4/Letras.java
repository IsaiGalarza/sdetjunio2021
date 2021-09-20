package eunice_resendiz.laboratorio4;

public class Letras {
	public static void main (String[] args) {
		String letra= "U";
		
		switch (letra.toLowerCase()) {
		
		case "a":
			System.out.println("Es una vocal " + letra);
			break;
		case "e":
			System.out.println("Es una Vocal " + letra);
			break;
		case "i":
			System.out.println("Es una Vocal " + letra);
			break;
		case "o":
			System.out.println("Es una Vocal " + letra);
			break;
		case "u":
			System.out.println("Es una Vocal " + letra);
			break;
	
			default:
				System.out.println("Es una consonante " + letra);
				break;
				
		
		
		}
	}

}
