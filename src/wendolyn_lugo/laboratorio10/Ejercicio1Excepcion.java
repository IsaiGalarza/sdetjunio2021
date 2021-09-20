package wendolyn_lugo.laboratorio10;

public class Ejercicio1Excepcion extends Exception  {

	private static final long serialVersionUID = 1L;

	public Ejercicio1Excepcion(String mensaje) {
		super(mensaje);
	}
	
	public Ejercicio1Excepcion(String mensaje, Throwable e) {
		super(mensaje, e);
	}
	
}
