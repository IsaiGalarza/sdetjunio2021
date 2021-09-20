package eunice_resendiz.laboratorio3;

public class InteresBase {
	public static void main(String[] args) {
		IOperacionesBanco banco;
		
		banco= new Banamex();
		
		System.out.println("Banamex intereson son: "+banco.getInterest()); 
		
		banco=new BBVA();
		System.out.println("BBVA intereson son: "+banco.getInterest());
	}
}
