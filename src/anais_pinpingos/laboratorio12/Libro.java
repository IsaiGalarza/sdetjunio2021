package anais_pinpingos.laboratorio12;

public class Libro {

	private String titulo;
	private int anio;
	
	public Libro() {
	}
	
	public Libro(String titulo, int anio) {
		super();
		this.titulo = titulo;
		this.anio = anio;
	}

	public void descripcion() {
		System.out.println(titulo + " del año " + anio);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	

}
