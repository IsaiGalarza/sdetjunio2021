package adan_rodriguez.laboratorio3;

public class BancoA implements IBank{
	private double intereses;
	private String tipoInteres;
	
	public BancoA() {
		System.out.println("Constructor de la clase por default");
	}
	
	@Override
	public void getInterest(double monto)
	{
		this.intereses=0.12;
		monto=monto*intereses;
		this.tipoInteres="CAT 12%";		
		
		System.out.println("Intereses: " + this.intereses+ " Monto: " + monto + " Tipo Intereses: " + this.tipoInteres); 
	}

	public static void main(String[] args)
	{
		BancoA Santander= new BancoA();
		Santander.getInterest(500);
	}

	@Override
	public void getInterest1(double descuento) {
		// TODO Auto-generated method stub
		
	}

}