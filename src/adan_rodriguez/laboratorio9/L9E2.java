package adan_rodriguez.laboratorio9;

import java.util.Scanner;

public class L9E2 {

	public static void main(String[] args) {
		
		int [] myArray;
		int n;
		Scanner read = new Scanner(System.in);
		
		try {
			System.out.println("Escribe el tamaño del arreglo");
			n=read.nextInt();
			myArray= new int [n];
			
			for(int i=0;i<myArray.length;i++)
			{
				System.out.println("Posición ["+i+"]: ");
				myArray[i]=read.nextInt();
			}
			
			//leyendo la posición del arreglo
			System.out.println("Escribe la posición que quieres ver su valor");
			n=read.nextInt();
			System.out.println(myArray[n]);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		read.close();

	}

}
