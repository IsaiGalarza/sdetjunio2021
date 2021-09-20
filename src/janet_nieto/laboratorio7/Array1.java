package janet_nieto.laboratorio7;
//1.Escribe un programa para ordenar los Strings del Array:(Bubble sort)
import java.util.Arrays;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//String[] Str = {"Ciaz","Alto","Swift","Dezire", "Brezza"};
		
		System.out.println("Ingresa el número de datos a ingresar: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();    
	
	    String Str[]=new String[n];

		for (int i=0; i<n; i++) {
			System.out.println("Ingresa marca de auto: ");
			Scanner st = new Scanner(System.in);
			String cadena = st.nextLine();
			Str[i]=cadena;
		}
		
		System.out.println("-------------------------------------------MARCA DE AUTO ORDENADO----------------");
		
		Arrays.sort(Str);
		for (String marca : Str) {
			System.out.println("Marca de auto: " + marca);
		}
		
		sc.close();
		
	}

}
