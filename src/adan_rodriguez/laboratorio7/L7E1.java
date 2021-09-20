package adan_rodriguez.laboratorio7;

import java.util.Scanner;

public class L7E1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);

		int arreglo[];
		int nElementos;
		int aux;
		String aux1;
		String[] cadena;
		
		String palabras[] = {"Ciaz","Alto","Swift","Dezire","Brezza"};
		System.out.println("-----ANTES------");
		for(int i=0; i<palabras.length;i++)
		{
			System.out.println(palabras[i]);
		}
		
		for(int i=0;i<palabras.length-1;i++)
		{
			for (int j=1;j<(palabras.length);j++)
			{
				//si numeroActual>numeroSiguente


				if(palabras[j].charAt(0)<palabras[j-1].charAt(0))
				{
					aux1 = palabras[j];
					palabras[j]=palabras[j-1];
					palabras[j-1]=aux1;
					
				}

			}
			
		}
		
		System.out.println("------DESPUES--------");
		for(int i=0; i<palabras.length;i++)
		{
			System.out.println(palabras[i]);
		}
		
	
		
		System.out.println("Ingresa cantidad de elementos ");
		nElementos =read.nextInt();
		
		//arreglo = new int[nElementos];
		cadena = new String [nElementos];
		
		for(int i=0;i<cadena.length;i++)
		{
			System.out.println("Escribe la cadena");
			//arreglo[i] = read.nextInt();
			cadena[i] = read.next();
		}
		
		System.out.println("-----ANTES------");
		for(int i=0; i<cadena.length;i++)
		{
			System.out.println(cadena[i]);
		}
		
		for(int i=0;i<cadena.length-1;i++)
		{
			for (int j=1;j<(cadena.length);j++)
			{
				//si numeroActual>numeroSiguente

				if(cadena[j].charAt(0)<cadena[j-1].charAt(0))
				{
					aux1 = cadena[j];
					cadena[j]=cadena[j-1];
					cadena[j-1]=aux1;
					
				}

			}
			
		}
		
		System.out.println("------DESPUES--------");
		for(int i=0; i<cadena.length;i++)
		{
			System.out.println(cadena[i]);
		}
		
	}

}

/*for(int i=0; (i<nElementos-1);i++)
{
	for (int j=0;j<(nElementos-1);j++)
	{
		//si numeroActual>numeroSiguente
		if(arreglo[j]>arreglo[j+1])
		{
			aux = arreglo[j];
			arreglo[j]=arreglo[j+1];
			arreglo[j+1]=aux;
		}
	}
}

for(int i=0; i<nElementos;i++)
{
	System.out.println(arreglo[i]);
}*/
