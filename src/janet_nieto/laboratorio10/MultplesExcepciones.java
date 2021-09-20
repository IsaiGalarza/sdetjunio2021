package janet_nieto.laboratorio10;
//2.Escribe un programa para manejar multiples excepciones

public class MultplesExcepciones {
	// Uso de un bloque try anidado

	    public static void main(String[] args) {
	        //Aqu�, num es m�s grande que denom
	        int nums[]={4,8,16,32,64,128,256,512};
	        int denom[]={2,0,4,4,0,8};

	        try { //try externo
	            for (int i = 0; i < nums.length; i++) {
	                try { //try anidado
	                    System.out.println(nums + " / " + denom + " es " + nums[i] / denom[i]);
	                } catch (ArithmeticException exc) {
	                    //Capturando la excepci�n
	                    System.out.println("No se puede dividir por cero!");
	                }
	            }
	        }
	        catch (ArrayIndexOutOfBoundsException exc) {
	                    //Capturando la excepci�n
	                    System.out.println("Alguna excepci�n ocurri�.");
	                    System.out.println("ERROR: Programa terminado.");
	                }
	            }
	        }

