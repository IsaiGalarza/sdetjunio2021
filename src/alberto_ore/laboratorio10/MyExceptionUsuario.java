package alberto_ore.laboratorio10;

public class MyExceptionUsuario extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MyExceptionUsuario(String mensaje) {
		super(mensaje);
	}
	
	public MyExceptionUsuario(String mensaje, Throwable e) {
		super(mensaje, e);
		e.printStackTrace();
		
		//metrica
		
		//protocolo
		
		//notificador 
		
		//bd
		
		//
	}
	
}
