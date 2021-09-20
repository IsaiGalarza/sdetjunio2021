package janet_nieto.laboratorio4;
//3.Escribir un programa para comprobar si el numero ingresado por un usuario es positivo
//o negativo
public class PositivoNegativo {
	
	private  int a;

	
	
	public PositivoNegativo(int a) {
		super();
		this.a = a;
	}

	public String FPositivoNegativo() {
	  	int  valor=this.a;
	    String  Cadena;
	
	
		if (valor >= 0) {
			Cadena="Positivo";
			
		}else {
			Cadena="Negativo";
		}
		return Cadena;
		
	
	}
//	get set
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	

	
	
	
	
	
	
}
