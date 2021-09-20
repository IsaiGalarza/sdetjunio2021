package janet_nieto.laboratorio9;
//Escribe un  programa para lanzar una excepcion ArrayOutOfBoundsException
public class ArrayOutOfBoundsException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     int i=0;
             int [] numero = new int[3];
            
	         try
	         {
		      	      
	        	 for ( i=0; i< numero.length+1 ; i++) {
	            	  numero[i]=24;
	             }	 
		      		      
		      
		      }
	         catch(ArrayIndexOutOfBoundsException excepcion)
	         {
		         System.out.println("Error de índice "+ i +" en el array numero.");
	         }
        }
	}
