package janet_nieto.laboratorio5;

import java.util.Scanner;

//2.Escribir un programa para mostrar numeros primos entre dos numeros
//donde obtienes del usuario las 2 entradas para el rango
public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	    //jny
	    int nInicial=0;
	    int nFinal=0;
		   System.out.println("Nro. inicial : ");
	       Scanner sci = new Scanner(System.in);
		   nInicial = sci.nextInt();	
		   
		   System.out.println("Nro. final : ");
	       Scanner scf = new Scanner(System.in);
		   nFinal = scf.nextInt();	
		   
		   System.out.println("Nros primos entre  : " + nInicial + " y " + nFinal );
			for (int x=nInicial;x<=nFinal;x++) {
				  
				  if (bPrimo(x)) {
				
					  System.out.println(x);
				  }  
				}
            sci.close();
			
			scf.close();			
		}

		public static boolean bPrimo(int numero){
			if(numero < 1) {
				return false;
			}
			
			int contador_divisores = 0;
			int unidad = 1;
			
			while(unidad <= numero) {
				if(numero % unidad == 0) {
					contador_divisores++;
				}
				unidad++;
			}
			
			if(contador_divisores == 2) {
				return true;
			}else {
				return false;
	}

			
			
	
  }
		
}
