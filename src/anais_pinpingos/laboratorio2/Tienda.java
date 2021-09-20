package anais_pinpingos.laboratorio2;

public class Tienda {

	//Objetos
	private Producto objProducto1=new Producto("Fideo",1.5,2);
	private Producto objProducto2=new Producto("Leche",2.3,1);
	private Producto objProducto3=new Producto("Atun",4.8,8);
		
	public static void main(String[] args) {


		Tienda instancia = new Tienda();
		instancia.Venta();
		
	}
	
	public void Venta() {
		
		System.out.println("DETALLE DE VENTA");
		System.out.println("Producto 1: Nombre:" + objProducto1.getNombre() + "  Cantidad:" + objProducto1.getCantidad() + 
						   "  Precio Unitario:" + objProducto1.getPrecio() + "  Precio con IGV:" + (objProducto1.getPrecio()+objProducto1.ProductoIGV(objProducto1.getPrecio())) +
						   "  Precio TOTAL:" + objProducto1.PrecioTotal(objProducto1.getPrecio()+objProducto1.ProductoIGV(objProducto1.getPrecio()), objProducto1.getCantidad()));
		System.out.println("Producto 2: Nombre:" + objProducto2.getNombre() + "  Cantidad:" + objProducto2.getCantidad() + 
				   		   "  Precio Unitario:" + objProducto2.getPrecio() + "  Precio con IGV:" + (objProducto2.getPrecio()+objProducto2.ProductoIGV(objProducto2.getPrecio())) + 
				   		   "  Precio TOTAL:" + objProducto2.PrecioTotal(objProducto2.getPrecio()+objProducto2.ProductoIGV(objProducto2.getPrecio()), objProducto2.getCantidad()));
		System.out.println("Producto 3: Nombre:" + objProducto3.getNombre() + "  Cantidad:" + objProducto3.getCantidad() + 
						   "  Precio Unitario:" + objProducto3.getPrecio() +  "  Precio con IGV:" + (objProducto3.getPrecio()+objProducto3.ProductoIGV(objProducto3.getPrecio())) +
						   "  Precio TOTAL:" + objProducto3.PrecioTotal(objProducto3.getPrecio()+objProducto3.ProductoIGV(objProducto3.getPrecio()), objProducto3.getCantidad()));

		
	}

}
