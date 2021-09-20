package cynthia_urbano.laboratorio2;

public class Ejercicio3 {
	
	private String nombreSerie;
	private int capitulos;
	private double califiacion;
	
	public static void main(String[] args) {
	
		Ejercicio3 pelicula1 =new Ejercicio3("Loki",3,4.8);
		Ejercicio3 pelicula2 =new Ejercicio3("The Umbrella Academy",20,4.9);
		Ejercicio3 pelicula3 =new Ejercicio3("Falcon y el Soldado del Invierno",6,4.4);
		
		System.out.println("Pelicula 1: " + pelicula1.DetalleSerie());
		System.out.println("Pelicula 2: " + pelicula2.DetalleSerie());
		System.out.println("Pelicula 3: " + pelicula3.DetalleSerie());

	}
	//Constructores
	
	public Ejercicio3 () {
		
	}
	
	public Ejercicio3(String nombreSerie, int capitulos, double califiacion) {
		super();
		this.nombreSerie = nombreSerie;
		this.capitulos = capitulos;
		this.califiacion = califiacion;
	}

	//Función miembro
	
	public String DetalleSerie () {
		return this.nombreSerie + " "+ this.capitulos + " " + this.califiacion;
	}

	public String getNombreSerie() {
		return nombreSerie;
	}

	public void setNombreSerie(String nombreSerie) {
		this.nombreSerie = nombreSerie;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	public double getCalifiacion() {
		return califiacion;
	}

	public void setCalifiacion(double califiacion) {
		this.califiacion = califiacion;
	}
	
	
	

}
