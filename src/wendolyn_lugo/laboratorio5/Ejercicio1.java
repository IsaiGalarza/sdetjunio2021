package wendolyn_lugo.laboratorio5;

public class Ejercicio1 {
	
	//metodo principal para arrancar el programa
	//Escribir un prograa para imprimir la tabla de multiplicación del 9, los primeros 10 valores
	public static void main (String[]args) {
		int tabla = 9;
		
		for (int i=1; i <= 20 ; i++) {
			int res = tabla * i;
			System.out.println(i +"*"+tabla+"= "+res);
			
			//Se coloca condicion para que a los 10 se detenga
			if (i == 10)
				break;
		}
		System.out.println("Sali en el if");
	}

}
