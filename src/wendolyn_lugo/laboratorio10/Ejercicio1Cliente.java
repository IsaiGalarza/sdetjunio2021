package wendolyn_lugo.laboratorio10;

public class Ejercicio1Cliente {

	public static void main(String[] args) throws Ejercicio1Excepcion {
		// TODO Auto-generated method stub
try {
	System.out.println("Sección que se verifica con el try");
	Integer.parseInt(null);
	
} catch (Exception e) {
	// TODO: handle exception
	throw new Ejercicio1Excepcion ("Error NullPointerException mi excepcion...",  new NullPointerException("Valor vacio"));
}
	}

}
