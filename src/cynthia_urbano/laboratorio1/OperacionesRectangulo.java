package cynthia_urbano.laboratorio1;

public class OperacionesRectangulo {
//Atributos
	
	private float base;
	private float altura;
		
//Método constructor personalizado
	public OperacionesRectangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
//Métodos
	
	//Para el perímetro
	
	public float Perimetro () {
		float perimetro= (base*2)+ (altura*2);
		return perimetro; 
	}
	//Para el área
	public float Area () {
		float area= base * altura;
		return area; 
	}
}
