package anais_pinpingos.laboratorio1;

public class Rectangulo {

	private int ladoA;
	private int ladoB;
	
	public Rectangulo(int cladoA, int cladoB) {
		super();
		this.ladoA = cladoA;
		this.ladoB = cladoB;
	}
	
	public int calcularArea(int a, int b) {
		return (a*b);
	}
	
	public int calcularPerimetro(int a, int b) {
		return 2*(a+b);
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
		

}
