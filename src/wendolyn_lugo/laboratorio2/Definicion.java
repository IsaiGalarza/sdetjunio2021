package wendolyn_lugo.laboratorio2;

public class Definicion {
	
	//definicion de atributos
	private String rangoOFijo;
	private String impuesto;
	private String factor;
	private boolean traslado;
	private boolean retencion;
	
	//constructor por defecto
	public Definicion() {
		super();
	}
	//constructores
	
	public Definicion(String rangoOFijo, String impuesto, String factor, boolean traslado, boolean retencion) {
		super();
		this.rangoOFijo = rangoOFijo;
		this.impuesto = impuesto;
		this.factor = factor;
		this.traslado = traslado;
		this.retencion = retencion;
	}
	
	public Definicion(String rangoOFijo, String impuesto, String factor, boolean traslado) {
		super();
		this.rangoOFijo = rangoOFijo;
		this.impuesto = impuesto;
		this.factor = factor;
		this.traslado = traslado;
	}
	public Definicion(String rangoOFijo, String impuesto, String factor) {
		super();
		this.rangoOFijo = rangoOFijo;
		this.impuesto = impuesto;
		this.factor = factor;
	}
	//funciones
	
	public String validaFactor() {
	return ("factor=" +'"' + factor +'"');
	}
	
	public String rangoImpuesto() {
		return ("rangoOFijo=" + '"' + rangoOFijo + '"' + " Impuesto=" + '"' + impuesto + '"');
	}
	
	public String trasladoRetencion () {
		return ("traslado= " + '"' + traslado  + '"' + " retencion=" + '"' + retencion + '"' );
	}
	
	//metodos de acceso get y set
	public String getRangoOFijo() {
		return rangoOFijo;
	}
	public void setRangoOFijo(String rangoOFijo) {
		this.rangoOFijo = rangoOFijo;
	}
	public String getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}
	public String getFactor() {
		return factor;
	}
	public void setFactor(String factor) {
		this.factor = factor;
	}
	public boolean isTraslado() {
		return traslado;
	}
	public void setTraslado(boolean traslado) {
		this.traslado = traslado;
	}
	public boolean isRetencion() {
		return retencion;
	}
	public void setRetencion(boolean retencion) {
		this.retencion = retencion;
	}

	@Override
	public String toString() {
		return "Definicion [rangoOFijo=" + rangoOFijo + ", impuesto=" + impuesto + ", factor=" + factor + ", traslado="
				+ traslado + ", retencion=" + retencion + "]";
	}
	
	

}
