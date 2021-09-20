package anais_pinpingos.laboratorio1;
import java.util.Scanner;

public class Calculos {

	private Rectangulo objFigura = new Rectangulo(0,0);
	Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {

		Calculos instancia = new Calculos();
		instancia.calcularMedidas();	
				
	}
	
	public void calcularMedidas() {
		
		System.out.println("Ingresar lado A: ");
		objFigura.setLadoA(Integer.parseInt(entrada.nextLine()));
				
		System.out.println("Ingresar lado B: ");
		objFigura.setLadoB(Integer.parseInt(entrada.nextLine()));
		
		System.out.println("Area del rectangulo es: " + objFigura.calcularArea(objFigura.getLadoA(), objFigura.getLadoB()));
		System.out.println("Perimetro del rectangulo es: " + objFigura.calcularPerimetro(objFigura.getLadoA(), objFigura.getLadoB()));
		
	}

}
