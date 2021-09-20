package eunice_resendiz.laboratorio6;

public class MatrizA {
	public static void main (String[] args) {
		Integer[][] matriz=new Integer[3][2];
matriz[0]=new Integer [2];
matriz[1]=new Integer [2];
matriz[2]=new Integer [2];

matriz[0][0]=1;
matriz[0][1]=2;
matriz[1][0]=2;
matriz[1][1]=2;
matriz[2][0]=2;
matriz[2][1]=2;
		
	imprimeMatriz(matriz); 
	}
	
	public static void imprimeMatriz (Integer[][] matrizA) {
		for( int i=0; i< matrizA.length; i++)
		{
			for (int j=0; j<matrizA[i].length; j++) 
			{
				System.out.println("elemtos de posicion ("+i+","+j+")= "+ matrizA[i][j]);
			}
		}
	}

}
