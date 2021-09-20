package anais_pinpingos.laboratorio3;

public class BEstatal implements IBank {

	private double interese; //Interes de cuota de banco estatal
	private String tipoe;
	
	public BEstatal(double cinterese, String ctipoe) {
		super();
		this.interese = cinterese;
		this.tipoe = ctipoe;
	}	
	
	public BEstatal() {

	}	
	
	//Sobre escritura de metodo
	
	@Override
	public void getInterest(double tea, int dias, int capital) {

		interese=(Math.pow(tea+1,dias/360)+ 1.5 )*capital;
		tipoe= "ESTATAL";
	}
	

	
	public double getInterese() {
		return interese;
	}

	public void setInterese(double interese) {
		this.interese = interese;
	}

	public String getTipoe() {
		return tipoe;
	}

	public void setTipoe(String tipoe) {
		this.tipoe = tipoe;
	}

	public static void main(String[] args) {

		BEstatal instBEstatal = new BEstatal();
		
		instBEstatal.getInterest(1.5,30,1580);
		
		System.out.println("El interes de la cuota del Banco " + instBEstatal.getTipoe() + " es: " + instBEstatal.getInterese());
		
		
	}




}
