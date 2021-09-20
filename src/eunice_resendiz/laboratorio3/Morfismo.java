package eunice_resendiz.laboratorio3;

public class Morfismo {
	public static void main(String[] args) {
		FiguraGeometrica figura = new FiguraGeometrica();
		System.out.println("Perimetro circulo de diametro 4: "+figura.calcularPerimetro(4));
		System.out.println("Perimetro triangulo con lados 3, 4, 5: "+figura.calcularPerimetro(3,4,5));
		System.out.println("Perimetro cuadrado con lados 6: "+figura.calcularPerimetro(6,6,6,6));
	}
}
