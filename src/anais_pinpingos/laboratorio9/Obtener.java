package anais_pinpingos.laboratorio9;

public class Obtener {

	private char[] c;
	
	public Obtener() {

	}
	
	public void Imprimir(String cadena) throws ArrayIndexOutOfBoundsException{  
		
		c = cadena.toCharArray();
	  
		for (int i = 0; i < c.length+1; i++) { // se intenta imprmir un elemento de mas que no exsite
			System.out.print("Elmento "+ (i+1) + " : ");
			System.out.println(c[i]);
		}
	  
	       
	}

	public char[] getC() {
		return c;
	}

	public void setC(char[] c) {
		this.c = c;
	}  
	

}
