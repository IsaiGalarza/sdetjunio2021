package anais_pinpingos.laboratorio10;

public class MiExcepcion extends Exception { // hereda de la superclase exception

	private static final long serialVersionUID = 1L;
	public MiExcepcion(String mensaje) {  //constructor
		super(mensaje);
		
	}

}