package yamir_aguilar.laboratorio1;

public class CalcularAreaPerimetro {

	private rectangulo objrectangulo1 = new rectangulo ("Rectangulo", 5, 9);
	
	public static void main(String[] args) {
		
		CalcularAreaPerimetro instancia = new CalcularAreaPerimetro();
		instancia.Resultado();
	}
	
	public void Resultado() {
		System.out.println("nombreFigura: "+ objrectangulo1.getNombreFigura() +
				" con Base: " + objrectangulo1.getBase() + 
				" y Altura: " + objrectangulo1.getAltura() +
				", el Area es: " + objrectangulo1.Area());
		System.out.println("nombreFigura: "+ objrectangulo1.getNombreFigura() +
				" con LadoA: " + objrectangulo1.getBase() + 
				" y LadoB: " + objrectangulo1.getAltura() +
				", el Perimetro es: " + objrectangulo1.Perimetro());
	}
	
}
