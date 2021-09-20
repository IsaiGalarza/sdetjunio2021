package eunice_resendiz.laboratorio4;

public class NumeroMayor {
	public static void main(String[] args) {
		Integer numA=3;
		Integer numB=2;
		Integer numC=1;
		
		if (numA > numB && numB > numC) {
			
			
			System.out.println ("El numero mayor es A: " + numA); 
		}
		else if ( numB> numA && numA > numC) {
			System.out.println ("El numero mayor es B: " + numB); 
		}
		
		else {
			
			System.out.println ("El numero mayor es C: " + numC);
		}
	}

}
