package anais_pinpingos.laboratorio2;

public class Producto {
	
	//atributos
	private String nombre;
	private double precio;
	private int cantidad;
	
	//Constructor por defecto
	public Producto() {
		
	}
	
	//Constructor personalizado
	public Producto(String cnombre, double cprecio, int ccantidad) {
		super();
		this.nombre = cnombre;
		this.precio = cprecio;
		this.cantidad= ccantidad;
	}

	//metodos miembro
	public double ProductoIGV(double a) {
		return (a*18)/100;
	}
	
	public double PrecioTotal(double a, int b) {
		return a*b;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}
