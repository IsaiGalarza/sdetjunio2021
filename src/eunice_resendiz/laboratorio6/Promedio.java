package eunice_resendiz.laboratorio6;

public class Promedio {
	public static void main (String[] args) {
		float suma=0; 
		float[] numeros=new float[10];
		 numeros[0]=10;
		 numeros[1]=(float) 9.5;
		 numeros[2]=8;
		 numeros[3]=(float) 5.5;
		 numeros[4]=(float) 9.2;
		 numeros[5]= 7;
		 numeros[6]= 6;
		 numeros[7]=9;
		 numeros[8]=6;
		 numeros[9]=(float) 6.7;
		   for (int i=0; i<10; i++) {
			    suma=suma + numeros[i];
		   }
		   
		   suma=suma/10;
		   
		   System.out.println("El promedio es : "+ suma);
		   
			   
		 
	}

}
