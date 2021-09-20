package anais_pinpingos.laboratorio5;

import java.util.Scanner;

public class Calificaciones {

	static Scanner entrada = new Scanner (System.in);
	private static String[][] matrizNotas;
	
	public static void main(String[] args) {
		
		Calificaciones instCalificar = new Calificaciones();
		instCalificar.GenerarNotas();
		
		System.out.println("Las notas de los alumnos son : " );

		instCalificar.CalificarNotas();
		instCalificar.MostrarNotas();
	}
	
	public void GenerarNotas() {
		matrizNotas = new String[60][7];

		for(int i = 0; i < 60; i++) {
			for(int j = 0; j < 5; j++) {
				matrizNotas[i][j] = String.valueOf(((int)(Math. random()*10+1))*2);
			}			
		}
	}
	
	public void CalificarNotas() {

		int sum, j=5;
				
		for(int i = 0; i < 60; i++) {

				sum=0;
				
				for(int k = 0; k < 5; k++) {
					sum = sum + Integer.parseInt(matrizNotas[i][k]);

				}	
				matrizNotas[i][j] = String.valueOf(sum);
					
				if(sum < 40){
					matrizNotas[i][j+1] = "Deficiente";
					
				}else if(sum >= 40 && sum < 60){
					matrizNotas[i][j+1] = "Promedio";
						
						}else if(sum >= 60 && sum < 75){
							matrizNotas[i][j+1] = "Bueno";
							
							}else if(sum >= 75 && sum < 90){
								matrizNotas[i][j+1] = "Muy Bueno";
								
							   }else{
								   matrizNotas[i][j+1] = "Excelente";
								}	
				
		}
	
	}
	
	public void MostrarNotas() {
		
		System.out.println( "ALUMNO\t  ELECTRÓNICA\t  DIB. de ING.\t\tCIVIL\t   MECÁNICA\t  MATEMÁTICAS\t   PUNTAJE TOTAL\tCALIFICACIÓN");
		
		for(int i = 0; i < 60; i++) {
			System.out.print( "Alumno " + (i+1) + ": "+ "\t");
			for(int j = 0; j < 7; j++) {
				System.out.print(matrizNotas[i][j] + "\t\t");

			}

			System.out.println();
		}
	}
	
	
	
	
	
}
