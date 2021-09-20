package wendolyn_lugo.laboratorio3;

public class Interes implements IBank {
	
	private double tasa;
	private double base;
	private double impuesto;

	//Constructor de la clase
	public Interes ()
	{
		this.tasa = 0.16;
	}
	
	//Se sobre escribe la funcionalidad  de getInteres
	//Solo ocupo la funcion de IBank
	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		impuesto = tasa * base;
	}
	@Override
	public void getInterest(double tasaIEPS) {
		// TODO Auto-generated method stub
		
	}
	public double getTasa() {
		return tasa;
	}

	public void setTasa(float tasa) {
		this.tasa = tasa;
	}

	public double getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}

	public void main (String[]args)
	{
		Interes tasa1 = new Interes();
		System.out.println("La tasa es: "+ tasa1);
		
	}


}
