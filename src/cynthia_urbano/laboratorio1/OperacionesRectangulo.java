package cynthia_urbano.laboratorio1;

public class OperacionesRectangulo {
//Atributos
	
	private float base;
	private float altura;
		
//M�todo constructor personalizado
	public OperacionesRectangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
//M�todos
	
	//Para el per�metro
	
	public float Perimetro () {
		float perimetro= (base*2)+ (altura*2);
		return perimetro; 
	}
	//Para el �rea
	public float Area () {
		float area= base * altura;
		return area; 
	}
}
