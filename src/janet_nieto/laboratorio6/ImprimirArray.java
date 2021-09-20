package janet_nieto.laboratorio6;
//2.Escribir un programa para imprimir los elementos de un array bidimenional
import java.util.Scanner;
public class ImprimirArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final int iFila = 5, iColumna = 4;
	        Scanner sc = new Scanner(System.in);
	        int i, j, mayor, menor;
	        int fila , Mayor, filaMenor, colMayor, colMenor;

	        int[][] Matriz = new int[iFila][iColumna]; //Se crea una matriz de 5 iFila y 4 iColumna

	        //Se introducen por teclado los valores de la matriz
	        System.out.println("Lectura de elementos de la matriz: ");
	        for (i = 0; i < iFila; i++) {
	            for (j = 0; j < iColumna; j++) {
	                System.out.print("A[" + i + "][" + j + "]= ");
	                Matriz[i][j] = sc.nextInt();
	            }
	        }

		
	        System.out.println("valores introducidos:");
	        for (i = 0; i < Matriz.length; i++) { 
	            for (j = 0; j < Matriz[i].length; j++) {
	                System.out.print(Matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
		
		
	
	}
}