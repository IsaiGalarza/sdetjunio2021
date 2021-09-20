package eunice_resendiz.laboratorio7;

public class Mayusculas {
public static void main (String[] args)
{
	
	String characters="AbCdefGHijklMNOpqRstUVwxyZ@%*234"; 
	
	for (int i=0; i<characters.length(); i++) {
		if (Character.isUpperCase(characters.charAt(i))) {
		System.out.println("Es una Mayuscuala "+ characters.charAt(i));
	
		}

		else if (Character.isLowerCase(characters.charAt(i))) {
			System.out.println("Es una minuscula "+ characters.charAt(i));
		}
		
		else 
		{
			System.out.println("No es una letra  "+ characters.charAt(i));
		}
	}
	
}

}

