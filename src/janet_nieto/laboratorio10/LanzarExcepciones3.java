package janet_nieto.laboratorio10;


//import Laboratorio3.CalcultePerimeter;

//Escribe un programa donde una sub-clase lanza excepciones.
//Las reglas para lanzar excepciones de sub-clases deben ser consideradas
public class LanzarExcepciones3 {


	public static void main(String[] args) {

	        //Aqu�, num es m�s grande que denom
	        int nums[]={4,8,16,32,64,128,256,512};
	        int denom[]={2,0,4,4,0,8};
            
	        
	        for (int i=0;i< nums.length;i++){
	            try {
	                System.out.println(nums+" / "+ denom+" es "+nums[i] / denom[i]);
	            }catch (ArrayIndexOutOfBoundsException exc){
	                //Capturando la excepci�n (subclase)
	            	
	                System.out.println("No se encontr� ning�n elemento.");
	            }
	            
	            catch (Throwable exc){
	                //Capturando la excepci�n (superclase)
	            	LanzarExcepcionesHija3 mensaje = new LanzarExcepcionesHija3(exc);
	            	
	               //System.out.println(mensaje "Alguna excepci�n ocurri�.");
	                       	   
	            }
	     }
	}
}


