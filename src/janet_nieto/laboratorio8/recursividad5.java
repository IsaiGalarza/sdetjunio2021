package janet_nieto.laboratorio8;
import java.util.Scanner;

//5.escribir un programa para invertir un numero usando recursividad	

public class recursividad5 {
     
	    public static void main(String[] args) {
	        int num;
	    //    private static Scanner sc;
	        Scanner sc = new Scanner(System.in);	        
	        System.out.print("Introduce un número para invertir: ");
	        num = sc.nextInt();
	        sc.close();
	        System.out.printf("%nEl número %d invertido es el %s", num, invertirNumeroString(num));
	        int numCifras = String.valueOf(num).length();
	        System.out.printf("%nEl número %d invertido es el %d", num, invertirNumero(num, numCifras-1));
	    }
	     
	    private static int invertirNumero(int num, int pos){
	        if(num<10){
	            return num;
	        } else {
	            return num%10 * (int)Math.pow(10, pos) + invertirNumero(num/10, pos-1); 
	        }
	    }
	 
	    private static String invertirNumeroString(int num) {
	        if(num<10){
	            return String.valueOf(num);
	        } else {
	            return String.valueOf(num%10) + invertirNumeroString(num/10);
	        }
	    }
		
		
	}

