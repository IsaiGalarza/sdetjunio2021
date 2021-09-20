package anais_pinpingos.laboratorio3;

public class BPrivado implements IBank {

	private double interesp; //Interes de cuota de banco privado
	private String tipop;
	
	public BPrivado(double cinteresp, String ctipop) {
		super();
		this.interesp = cinteresp;
		this.tipop = ctipop;
	}	
	
	public BPrivado() {

	}	
	
	//Sobre escritura de metodo
	
	@Override
	public void getInterest(double tea, int dias, int capital) {

		interesp=(Math.pow(tea+1,dias/360)+ 5.5 )*capital;
		tipop= "PRIVADO";
	}
	

	
	public double getInteresp() {
		return interesp;
	}

	public void setInteresp(double interesp) {
		this.interesp = interesp;
	}

	public String getTipop() {
		return tipop;
	}

	public void setTipop(String tipop) {
		this.tipop = tipop;
	}

	public static void main(String[] args) {

		BPrivado instBPrivado = new BPrivado();
		
		instBPrivado.getInterest(1.5,30,1580);
		
		System.out.println("El interes de la cuota del Banco " + instBPrivado.getTipop() + " es: " + instBPrivado.getInteresp());
		
		
	}



}
