/**
 * 
 */
package wendolyn_lugo.laboratorio12;

/**
 * @author wendolyn.lugo
 * Se usa en el ejercicio 2 para crear los objetos y realizar comparaciones
 */
public class Carga {

	/**
	 * 
	 */
	
	private String clave;
	private String descripcion;
	
	public Carga() {
		// TODO Auto-generated constructor stub
	}

	//constructor personalizado
	public Carga(String clave, String descripcion) {
		super();
		this.clave = clave;
		this.descripcion = descripcion;
	}
	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Carga [clave=" + clave + ", descripcion=" + descripcion + "]";
	}

}
