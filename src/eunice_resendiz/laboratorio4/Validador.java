package eunice_resendiz.laboratorio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validador {
	public static void main (String[] args) throws IOException {
		//Ingrese datos usando BufferReader
        BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
        
        // Leyendo datos usando readLine
       System.out.println("Dame el valor: " );
        String name="";
			name = reader.readLine();
		Integer valor= Integer.parseInt (name) ; 
		 if (valor >0 ) {
			 
			 System.out.println("Positivo" + valor);
		
		 }
		 else 
			 System.out.println("Negativo" + valor);
	}

}
