package anais_pinpingos.laboratorio12;

public class Pedido implements Comparable<Pedido> {
	
	private String producto;
	private Integer cantidad;
	private double monto;
	
	public Pedido() {
		
	}
	
	public Pedido(String producto, Integer cantidad, double monto) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.monto = monto;
	}
	
	public void descripcion() {
		System.out.println("(" + cantidad + ")    " + producto + "     " + monto);
	}
		
	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	@Override
	public int compareTo(Pedido o) {
		return this.producto.compareTo(o.producto);
	}


}
