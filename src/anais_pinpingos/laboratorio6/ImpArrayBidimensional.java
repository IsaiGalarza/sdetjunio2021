package anais_pinpingos.laboratorio6;

import java.util.Scanner;

public class ImpArrayBidimensional {

	static Scanner entrada = new Scanner (System.in);
	private static int x,y;
	private static int[][] matriz;
	
	
	public static void main(String[] args) {
		
		ImpArrayBidimensional instImpA = new ImpArrayBidimensional();
		System.out.println("Ingrese cantidad de filas del Array bidimensional: " );
		x = Integer.parseInt(entrada.nextLine());
		System.out.println("Ingrese cantidad de columnas del Array bidimensional : " );
		y = Integer.parseInt(entrada.nextLine());
		instImpA.GenerarMatriz(x,y);
		
		instImpA.ImprimirMatriz(x,y);
	}
	
	public void GenerarMatriz(int n, int m) {
		matriz = new int[n][m];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matriz[i][j] = (int)(Math. random()*10+1);
				//System.out.println(matriz[i][j]);
			}			
		}
		System.out.println(" " );
	}
	
	public void ImprimirMatriz(int n, int m) {
		
		System.out.println("Los valores para el array bidimensional generado son: " );
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.println( "Valor [" + i + "][" + j + "]: " + matriz[i][j]);
			}			
		}

	}


}
