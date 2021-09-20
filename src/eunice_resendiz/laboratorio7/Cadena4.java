package eunice_resendiz.laboratorio7;

public class Cadena4 {

	public static void main(String[]args)
	{
		String cadena="      She sells sea shells on the sea shore          ";
		int i=0;
		int j=0;
		for (i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i)!=' ')
				break;
		}
		
		for (j=cadena.length()-1; j>=0; j--) {			 
			if(cadena.charAt(j)!=' ')
				break;
		}
		
		System.out.println("Cadena orignal:["+cadena+"]");
		System.out.println("Cadena trim:["+cadena.substring(i,j)+"]");
	}
	
}
