package wendolyn_lugo.laboratorio1;

public class rectangulo {

	private String figura;
	private float base;
	private float altura;
	
	public rectangulo() {
		
	}
	public rectangulo(String nombreFig, float baseFig, float alturaFig) {
		super();
		this.figura = nombreFig;
		this.base = baseFig;
		this.altura = alturaFig;		
	}	
	
	//metodos o funciones
	public float Area() {
		return this.base*this.altura;
	}
	
	public float Perimetro() {
		return (this.base*2)+(this.altura*2);
	}

	public float Division() {
		return base/altura;
	}
	public float Cociente() {
		return this.base%this.altura;
	}
	public boolean Evaluar() {
		return (this.base-this.altura) < 5;
	}
	
	// get and set
		public String getFigura() {
			return figura;
		}
		public void setfigura(String figura) {
			this.figura = figura;
		}
		
		public float getbase() {
			return base;
		}
		public void setbase(float base) {
			this.base = base;
		}
		
		public float getaltura() {
			return altura;
		}
		public void setaltura(float altura) {
			this.altura = altura;
		}		

}
