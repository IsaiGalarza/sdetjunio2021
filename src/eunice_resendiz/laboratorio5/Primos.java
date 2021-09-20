package eunice_resendiz.laboratorio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Primos {
public double Pedirnumero (String mensaje) {
	//Ingrese datos usando BufferReader
    BufferedReader reader = 
               new BufferedReader(new InputStreamReader(System.in));
    
    // Leyendo datos usando readLine
   System.out.println(mensaje);
    String name="";
		try {
			name = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	double valor= Double.parseDouble(name) ;
	return valor;
} 

public void Genera (double inicial, double fin) {
	for (int i=(int)inicial; i<=fin; i++) {
		if (EsPrimo (i)) {
			System.out.println("Es primo=" + i);		
		}
	}
}
public Boolean EsPrimo (double numero)
{
	
	 for (int i=(int)numero ; i>=1 ; i--) {
		 
		 if  (numero%i==0)
		 {
			 if (i!=numero&&i!=1)
				return false; 
		 }
	 }
	
	return true;
}

}
