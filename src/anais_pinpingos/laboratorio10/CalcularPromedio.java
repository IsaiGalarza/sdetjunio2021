package anais_pinpingos.laboratorio10;

public class CalcularPromedio {

	private int numero1;
	private int numero2;
		
	public CalcularPromedio(int num1, int num2) {
		super();
		this.numero1 = num1;
		this.numero2 = num2;
	}

	//Funcion miembro
	public int Promediar() throws MiExcepcion{  // usar exepetion personalizada
		
		try {
			return (numero1/numero2);
			
		} catch (Exception e) {
			throw new MiExcepcion("Captura excepcion personalizada al promediar"); 
			
		}		

	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}	

	

}
