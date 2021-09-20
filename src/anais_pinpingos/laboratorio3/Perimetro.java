package anais_pinpingos.laboratorio3;

public class Perimetro {
	
	private int lado1;
	private int perimetro;
	private String nombre;
	private int lados;
	
	public Perimetro() {

	}
	
	public Perimetro(int lado1, int perimetro, String nombre, int lados) {
		this.lado1 = lado1;
		this.perimetro = perimetro;
		this.nombre = nombre;
		this.lados = lados;
	}

	//Metodo miembro
	public void calcultePerimeter(int lado1,String nombre,int lados) { //metodo calcultePerimeter
		setPerimetro(lados*lado1);
		setNombre(nombre);
		setLados(lados);
		System.out.println("Lado del Cuadrado: "+ lado1);
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}



}


