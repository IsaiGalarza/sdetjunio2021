package alberto_ore.laboratorio1;

public class Operaciones {
	private double ladoA;
	private double ladoB;
	private double result;

		
	public Operaciones(double num1, double num2)
	{
		super();
		this.ladoA=num1;
		this.ladoB=num2;
		
	}
	
	public Operaciones() {
		// TODO Auto-generated constructor stub
	}

	public double calculaPerimetro(double num1, double num2) 
	{
		return(result=(num1*2)+(num2*2));
	}

	public double calculaArea(double num1, double num2) 
	{
		return(result=(num1)*(num2));
	}
	
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}



}
