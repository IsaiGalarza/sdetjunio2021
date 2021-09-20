package adan_rodriguez.laboratorio7;

public class L7E2 {

	public static void main(String[] args) {
		
		String cadena = "AbCdefGHijklMNOpqRstUVwxyZ @%*234";
		char cadena2 [];
		
		System.out.println("-----ANTES------");
		System.out.println(cadena);
	
		cadena2= new char [cadena.length()];
		
		System.out.println("------Mayusculas--------");
		for(int i=0;i <cadena2.length ;i++)
		{
			cadena2[i]=cadena.charAt(i);
			if(Character.isUpperCase(cadena2[i])) {
				System.out.print(cadena2[i] + " ");
			}
			
		}
		System.out.println("");
		System.out.println("------Minusculas--------");
		for(int i=0;i <cadena2.length ;i++)
		{
			cadena2[i]=cadena.charAt(i);
			if(Character.isLowerCase(cadena2[i])) {
				System.out.print(cadena2[i] + " ");
			}
		}
		
	}

}
