package janet_nieto.laboratorio9;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//Escribe un programa para lanzar una excepcion parseExcepcion mientras 
//se analiza una fecha ingresada por el usuario.Converitr el formato dd/mm/aaaa 
//a aaaa/mm/dd si la entrada es valida

//throws ParseException 
public class parseException3 {

    public static void main(String[] args) {
    
    	  System.out.println("Introduzca la fecha dd/mm/yyyy");
          Scanner sc = new Scanner(System.in);
          String fecha = sc.nextLine();
           
        
		     	      	
        try {
        	  DateFormat fechaHora = new SimpleDateFormat("YYYY/MM/DD");
        	  Date convertido = fechaHora.parse(fecha);
        	  System.out.println("fecha : " +convertido);
        	  		
        	  
  			 
         } 
          catch (ParseException ex) 
          {
             System.out.println("Error en fecha" + ex.getMessage());
          }
        
    }
}   
    	
    	
