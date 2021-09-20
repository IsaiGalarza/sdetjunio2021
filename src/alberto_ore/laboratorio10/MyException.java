package alberto_ore.laboratorio10;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);

	}

	public MyException(String mensaje, Throwable e) {
		super(mensaje, e);
		e.printStackTrace();

	}

}
