package alberto_ore.laboratorio2;

public class MiClase {
	
	private String atributoA;
	private int atributoB;
	

//constructor
	public MiClase() {
		
	}
	
	public static void main (String [] args){
	MiClase oObjeto1 = new MiClase();
	oObjeto1.atributoA="Soy un texto";
	oObjeto1.atributoB=100;
	
	System.out.println( "Regreso del valor del método " + oObjeto1.metodo(oObjeto1.atributoA, oObjeto1.atributoB) );
	
	}
	
	public boolean metodo(String A, int B) {
		if (A.length()>=0 && B>='0')
			return true;
		else
			return false;
	}
	
}
