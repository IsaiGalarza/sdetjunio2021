package cynthia_urbano.laboratorio4;
/*Escribir un programa para imprimir el m�s grandes de tres n�meros usando if-else-if*/
import java.util.Scanner;

public class numeroMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1,num2,num3;
		
		System.out.println("Ingrese el n�mero 1: ");
		num1= sc.nextInt();
		System.out.println("Ingrese el n�mero 2: ");
		num2= sc.nextInt();
		System.out.println("Ingrese el n�mero 3: ");
		num3= sc.nextInt();
		
		if (num1>num2 && num1>num3) { 
			System.out.println("El n�mero m�s grande entre: "  + 
								num1+" ," + num2+ " ," + num3 +" --es: " +num1);	
				
		}else if (num2>num1 && num2>num3) { 
			System.out.println("El n�mero m�s grande entre:  " + 
					num1+" ," + num2+ " ," + num3 +" --es: " +num2);	
			
		}else if (num3>num1 && num3>num2) { 
			System.out.println("El n�mero m�s grande entre: " + 
					num1+" ," + num2+ " ," + num3 +" ---es: " +num3);	
			
		}else {System.out.println("Los n�meros: " + 
				num1+", " + num2+ ", " + num3 +" son iguales");	
			
		}
		
		
		
		
		

	}

}
