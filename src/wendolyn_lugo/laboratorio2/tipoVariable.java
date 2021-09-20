package wendolyn_lugo.laboratorio2;

public class tipoVariable {

	// declaracion de variables
	private String c_aduana;
	private boolean vigencia;
	private int cantidad;
	private int ejercicio;

	//
	public tipoVariable(String c_aduana, boolean vigencia, int cantidad, int ejercicio) {
		super();
		this.c_aduana = c_aduana;
		this.vigencia = vigencia;
		this.cantidad = cantidad;
		this.ejercicio = ejercicio;
	}

	// funcion miembro
	public String vigenciaEjercicio() {
		return (ejercicio + " " + vigencia);
	}

	// metodos de acceso para quitar el eror de que las variables no se mandan a
	// llamar
	public String getC_aduana() {
		return c_aduana;
	}

	public void setC_aduana(String c_aduana) {
		this.c_aduana = c_aduana;
	}

	public boolean isVigencia() {
		return vigencia;
	}

	public void setVigencia(boolean vigencia) {
		this.vigencia = vigencia;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(int ejercicio) {
		this.ejercicio = ejercicio;
	}

	// Lo usaremos para mostrar los valores
	@Override
	public String toString() {
		return "tipoVariable [c_aduana=" + c_aduana + ", vigencia=" + vigencia + ", cantidad=" + cantidad
				+ ", ejercicio=" + ejercicio + "]";
	}

}
