package wendolyn_lugo.laboratorio3;

public class IEPS implements IBank {
	
	private double tasaIEPS;


	
//Se obtiene funcion de la Interface
	@Override
	public void getInterest(double tasaIEPS) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		
	}	
	
	//Get y set de la clase
	public double getTasaIEPS() {
		return tasaIEPS;
	}

	public void setTasaIEPS(double tasaIEPS) {
		this.tasaIEPS = tasaIEPS;
	}
	
	//Mostrar resultado
	
	public void main (String [] args) {
		IEPS miCalculo = new IEPS();
		System.out.println("El importe de la tasa 16:  ");
		System.out.println("El importe de la tasa 16:  "+ miCalculo);
	}



}
