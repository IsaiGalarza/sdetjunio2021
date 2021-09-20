package janet_nieto.laboratorio14;
//1.Comprueba que existe una llave en particular en HashMap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.sun.javafx.binding.SelectBinding.AsInteger;
public class HashMap1 {

		private static final String String = null;

		public static void main(String[] args) {
			
			HashMap<Integer, String> hmPaises = new HashMap<>();
			for (int i=1; i<=3; i++) {
				System.out.println("Ingresa nombre de pais: ");
				Scanner st = new Scanner(System.in);
				String Pais = st.nextLine();
				hmPaises.put(i,Pais);
		    }
        
		   
			System.out.println("---------------------------Paises Ingresados-------------------------------");
//			System.out.println(hmPaises);
		
			System.out.println("Ingresa llave: ");
			Scanner st = new Scanner(System.in);
			Integer iLLave = st.nextInt();
			
			Set<Integer> keys = hmPaises.keySet();
		        for ( Integer key : keys ) {		        	
		        	if  (key==iLLave) {
		            System.out.println( "LLave existe:" + key );
		            }
		        	
		        	
		        }
		 }	        
     }
