package adan_rodriguez.laboratorio9;

import java.util.Scanner;

public class L9E2 {

	public static void main(String[] args) {
		
		int [] myArray;
		int n;
		Scanner read = new Scanner(System.in);
		
		try {
			System.out.println("Escribe el tama�o del arreglo");
			n=read.nextInt();
			myArray= new int [n];
			
			for(int i=0;i<myArray.length;i++)
			{
				System.out.println("Posici�n ["+i+"]: ");
				myArray[i]=read.nextInt();
			}
			
			//leyendo la posici�n del arreglo
			System.out.println("Escribe la posici�n que quieres ver su valor");
			n=read.nextInt();
			System.out.println(myArray[n]);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		read.close();

	}

}
