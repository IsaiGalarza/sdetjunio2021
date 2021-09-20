package eunice_resendiz.laboratorio3;

public class FiguraGeometrica {
	public double calcularPerimetro(double lado) {
		return lado*3.1416;
	}
	public double calcularPerimetro(double lado, double lado1, double lado2) {
		return lado+lado1+lado2;
	}
	public double calcularPerimetro(double lado, double lado1, double lado2, double lado3) {
		return lado+lado1+lado2+lado3;
	}
}
