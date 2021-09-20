package anais_pinpingos.laboratorio1;

public class Division {

	private int dividendo;
	private int divisor;
	
	public Division(int cdividendo, int cdivisor) {
		super();
		this.dividendo = cdividendo;
		this.divisor = cdivisor;

	}
	
	public int obtenerCociente(int a, int b) {
		return (a/b);
	}
	
	public int obtenerResiduo(int a, int b) {
		return (a%b);
	}
	
	public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}
	
}
