package cynthia_urbano.laboratorio1;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=2;
		int d=4;
		
		boolean bandera= false;
		
		int numero= +10; //Inicio del valor den n�mero en 10
		
		 System.out.println("El n�mero es: " + numero);
		 
		//Operador unario -- decrementa en 1 a numero
		 numero --;
		 System.out.println("El n�mero 10 ahora es: " + numero);
		 	 
		//Operador unario ++ incrementa en 1 a numero
		 numero ++;
		 System.out.println("El n�mero ahora es: " + numero);
		 
		 //Operador unario - Cambia a numero a negativo
		 
		 numero= - numero;
		 System.out.println("El n�mero cambio a negativo : " + numero );
		 
		 bandera= !bandera;
		 
		 System.out.println("La bandera inicio como false ahora es: " + bandera );
		 
		 
		 //Con Expresiones Aritmeticas
		 
		 a=++b; //Operador ++
		 System.out.println("Ahora -a- es igual a b + 1: " + a );
		 b=++c;
		 d=--d;
		 System.out.println ("Ahora b es  " + b + " igual que d es " +d);
		 
		 System.out.println("b + d = " + ( b + d));
		 System.out.println(" a vale : " + a + "\n b vale : " + b +"\n c vale : " + c +" \n d vale : " + d);
		 System.out.println("Comparaci�n uno a<b : " + ( a<b));
		 System.out.println("Comparaci�n uno (b + d)<(a+c) : " + ( (b + d)<(a+c) ));
		 
		 
		
		 
		 
				 
		
		
	}
	
}
