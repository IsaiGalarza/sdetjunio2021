package anais_pinpingos.laboratorio5;

public class TablaMultiplicar {
		
	public static void main(String[] args) {

		TablaMultiplicar InsTabla = new TablaMultiplicar();
		InsTabla.GenerarTabla();
	}
	
	public void GenerarTabla() {
		
		System.out.println("Tabla de Multiplicar del 5: ");
		
		int i=0;
		
		while(i < 10){
			
			System.out.println("5 x " + (i+1) + " = " + (5* (i+1)));
			i=i+1;
		}
		
	}
}
