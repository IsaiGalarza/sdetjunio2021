package eunice_resendiz.laboratorio7;

public class Cadena {
public static void main(String[]args) {
	
	String cadena1="Hola"; 
	String cadena2="Adios";
	
	String [] suma=new String[cadena1.length()+cadena2.length()];
	
	for (int i=0;i<cadena1.length(); i++)
	{
		suma[i]=cadena1.charAt(i)+"";
		
	}
	
	for (int  i=cadena1.length();i<cadena2.length()+cadena1.length(); i++) {
		

		suma[i]=cadena2.charAt(i-cadena1.length())+"";
	}
	
	for (int  i=0; i < suma.length ; i++) {
		
		System.out.println(""+ suma[i]);
	}
}
}
