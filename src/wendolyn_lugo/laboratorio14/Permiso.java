/**
 * 
 */
package wendolyn_lugo.laboratorio14;

/**
 * @author wendolyn.lugo
 *
 */
public class Permiso {

	/**
	 * 
	 */
	private String key;
	private String value;
	private String claveTransporte;
	
	public Permiso() {
		// TODO Auto-generated constructor stub
	}
	
	public Permiso(String key, String claveTransporte) {
		super();
		this.key = key;
		this.claveTransporte = claveTransporte;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the claveTransporte
	 */
	public String getClaveTransporte() {
		return claveTransporte;
	}

	/**
	 * @param claveTransporte the claveTransporte to set
	 */
	public void setClaveTransporte(String claveTransporte) {
		this.claveTransporte = claveTransporte;
	}

	@Override
	public String toString() {
		return "Permiso [key=" + key + ", value=" + value + ", claveTransporte=" + claveTransporte + "]";
	}

}
