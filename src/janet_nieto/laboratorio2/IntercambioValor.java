package janet_nieto.laboratorio2;


public class IntercambioValor {
	
	//atributo
	private float Valor1 ;
	private float Valor2 ;
	



	
	public  IntercambioValor(final float d, final float e) {

		float  aux =d;
  		this.Valor1=e;
  		this.Valor2=aux;
  		  	  	
	}

	//funciones miembros
	public float NuevoValor1() {
		
			
			return this.Valor1;
		}

	public float NuevoValor2() {
		
		
		  return this.Valor2;
	}

	//get set

	/**
	 * @param e 
	 * @param d 
	 * 
	 */
	//public IntercambioValor1(float d, float e) {
		//super();
		// TODO Auto-generated constructor stub
//	}



	public float getValor1() {
		return Valor1;
	}



	public void setValor1(float valor1) {
		Valor1 = valor1;
	}



	public float getValor2() {
		return Valor2;
	}



	public void setValor2(float valor2) {
		Valor2 = valor2;
	}





	
	
	
	
	
}
