package anais_pinpingos.laboratorio2;

public class Persona {
	
	private String nombre; // variable instancia
	private String apellido;
	private String pais;
		
	public Persona(String cnombre, String capellido, String cpais) {
		super();
		this.nombre = cnombre;
		this.apellido = capellido;
		this.pais = cpais;
	}

	//funcion miembro
	public String nombreCompleto() {
		String nombreCompleto=this.nombre+" "+this.apellido; //variable local
		return nombreCompleto;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
}
