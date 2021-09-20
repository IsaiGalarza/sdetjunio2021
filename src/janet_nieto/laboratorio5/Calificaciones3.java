package janet_nieto.laboratorio5;

import java.util.Scanner;

public class Calificaciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Curso[] = {"Electrónica","Dibujo de Ingenieria","Civil","Mecánica", "Matemáticas"};
		int NotaCurso[][] = new int[100][100];
		String Calificacion[][]= new String[100][100];
	
		 
	    System.out.println("Ingresa nro de alumnos: ");
		Scanner scAlumno = new Scanner(System.in);
		int n = scAlumno.nextInt();   
	    
	
			for (int i=0; i<n; i++) { 
				                    
				
				for (int j=0 ;j<5;j++) {				
					    
					System.out.println("Ingresa nota del alumno " +i +  " curso " + Curso[j] + ":");
					Scanner st = new Scanner(System.in);
					int iNota = st.nextInt();
					NotaCurso[i][j]=iNota;
					
					 if (iNota<40) {
						 Calificacion[i][j]="Deficiente";
			            } 
					 else {
			            	
			             
			                if (iNota>=40 && iNota<=60 ) {
			                	Calificacion[i][j]="Promedio";			                	
			                } 
			                else {
			                    if (iNota>60 && iNota<75) {
			                    	Calificacion[i][j]="Bueno";		
			                    }
			                    else {
			                    
			                    	
			                    	if (iNota>75 && iNota<90) {
			                    		Calificacion[i][j]="Muy Bueno";		
				                    }
			                    	else {
			                    		if (iNota>=90) {
			                    			Calificacion[i][j]="Excelente";		
					                    }	
			                    		
			                    		
			                    	}
			                    		
			                    	
			                    }
			                 
			                    
			                    
			                }
			            }
				
					
				}	
				
				
			
			}		
			
			
			System.out.println("--------Notas de curso---------");
			for (int i=0; i<n; i++) { 
				                    
				
				for (int j=0 ;j<5;j++) {				

			
			System.out.println("El alumno "+ i + " para el curso " + Curso[j] + " tiene nota de  " + NotaCurso[i][j] +" por tanto su calificación es " + Calificacion[i][j]);
		
				
	     }
	  }
		
			
			scAlumno.close();
			
	}
}
