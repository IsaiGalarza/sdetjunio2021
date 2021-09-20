package anais_pinpingos.laboratorio5;

import java.util.Scanner;

public class Primos {

	static Scanner entrada = new Scanner (System.in);
	private static int a,b;
	
	
	public static void main(String[] args) {

		Primos InsPrimos = new Primos();
		System.out.println("Ingrese valores de rango para busqueda de numeros primos");
		System.out.println("Ingrese valor de limite inferior: " );
		a = Integer.parseInt(entrada.nextLine());
		System.out.println("Ingrese valor de limite superior: " );
		b = Integer.parseInt(entrada.nextLine());
		System.out.println("Los numeros primos entre " + a + " y " + b + " son: ");
		InsPrimos.BuscarPrimos(a,b);
	}
	
	public void BuscarPrimos(int x, int y) {

		boolean primo;
	
		for(int i = x; i <= y; i++) {
			
			primo=true;
			int j=1;
			int count=0;
			
			while (j <= i) {
				
				if(i % j == 0) {
					count=count+1;
					j=j+1;
				}
				else {
					j=j+1;
				}
				
				if(count >= 3) {
					primo=false;
					break;
				}
				
			}
			
			if(primo==true && count==2){
				System.out.println(i);
			}
			
		}
		
	}
}
