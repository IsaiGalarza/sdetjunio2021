package wendolyn_lugo.laboratorio2;

public class Intercambio {

	// atributos
	private String rangoOFijo;
	private float valorminimo;
	private float valormaximo;
	private float tasaOCuota;
	private int base;

	// constructor
		public Intercambio() {
		super();
	}

	public Intercambio(float valorminimo, float valormaximo, float tasaOCuota, int base) {
		super();
		this.valorminimo = valorminimo;
		this.valormaximo = valormaximo;
		this.tasaOCuota = tasaOCuota;
		this.base = base;
	}

	// funcion
	public float ValidaRango() {
		valorminimo = valormaximo;
		return (valorminimo);
	}
	
	public float calculaImporte(int base, float tasaOCuota)
	{
		return ((base * tasaOCuota)/100);
	}

	// get y set
	public String getrangoOFijo() {
		return rangoOFijo;
	}

	public void setrangoOFijo(String rangoOFijo) {
		this.rangoOFijo = rangoOFijo;
	}

	public float getValorminimo() {
		return valorminimo;
	}

	public void setValorminimo(float valorminimo) {
		this.valorminimo = valorminimo;
	}

	public float getValormaximo() {
		return valormaximo;
	}

	public void setValormaximo(float valormaximo) {
		this.valormaximo = valormaximo;
	}

	public float getTasaOCuota() {
		return tasaOCuota;
	}

	public void setTasaOCuota(float tasaOCuota) {
		this.tasaOCuota = tasaOCuota;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Intercambio [rangoOFijo=" + rangoOFijo + ", valorminimo=" + valorminimo + ", valormaximo=" + valormaximo
				+ ", tasaOCuota=" + tasaOCuota + ", base=" + base + "]";
	}

}