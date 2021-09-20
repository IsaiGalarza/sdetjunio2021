package janet_nieto.laboratorio9;
//Escribe un programa con try, catch y el bloque finally
public class Excepcion1 {

	public static void main(String[] args) {
		 int a =5;
	     int b =0;
	 
	        try {
	            int resultado=a/b;
	 
	            System.out.println(resultado);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            System.out.println("La aplicación fallo");
	 
	        }finally {
	            System.out.println("Se cierran los recursos");
	 
	        }
	 
	        System.out.println("La aplicacion finalizado");
	 
	    }
	 
	}


