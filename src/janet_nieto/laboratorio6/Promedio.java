package janet_nieto.laboratorio6;
//1.Escribir un programa a calcular el promedio de los elementos en un array
public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[]{ 1,2,7}; 
		
		    int contador=0;
		    double elemento=0;
		   
		for (int i = 0; i < intArray.length; i++) {
			
			 elemento= elemento + intArray[i] ;
             contador++;		
			
	}
	
		double promedio= elemento/contador;
		
	System.out.println("El promedio es " + promedio);
	
}
}