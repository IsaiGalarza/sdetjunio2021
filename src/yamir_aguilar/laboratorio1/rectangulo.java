package yamir_aguilar.laboratorio1;

public class rectangulo {

	private String nombreFigura;
	private float base;
	private float altura;
	
	public rectangulo() {
		
	}

	public rectangulo(String Fnombre, float Fbase, float Faltura) {
		super();
		this.nombreFigura = Fnombre;
		this.base = Fbase;
		this.altura = Faltura;
	}
	public float Area() {
		return this.base*this.altura;
	}
	public float Perimetro(){
		return (2*(base + altura));
	}

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
