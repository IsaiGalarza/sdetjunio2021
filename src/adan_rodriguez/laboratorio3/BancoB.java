package adan_rodriguez.laboratorio3;

public class BancoB implements IBank{
	private double intereses;
	private String tipoInteres;
	
	public BancoB() {
		System.out.println("Constructor de la clase por default");
	}
	
	@Override
	public void getInterest(double monto)
	{
		this.intereses=0.10;
		monto=monto*intereses;
		this.tipoInteres="CAT 10%";		
				
		System.out.println("Intereses: " + this.intereses+ " Monto: " + monto + " Tipo Intereses: " + this.tipoInteres); 
	}
	
	@Override
	public void getInterest1(double descuento)
	{
		this.intereses=0.10;
		descuento=descuento-(descuento*intereses);		
		System.out.println("Monto con Descuento: " + descuento); 
	}


	public static void main(String[] args)
	{
		BancoB BBVA= new BancoB();
		BBVA.getInterest(1000);
		BBVA.getInterest1(1000);
	}

}