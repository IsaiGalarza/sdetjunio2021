package eunice_resendiz.laboratorio5;

public class GeneradorPrimos {
	public static void main(String[] args) {
		Primos numero=new Primos();
		double inicial=numero.Pedirnumero("Dame el  primer rango= ");
		double fin=numero.Pedirnumero("Dame el ultimo rango= ");
		numero.Genera(inicial, fin);
		
		
		
	}
}
