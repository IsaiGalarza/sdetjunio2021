package anais_pinpingos.laboratorio1;

import java.util.Scanner;

public class Evaluacion {
	
	private Variable objEvaluar = new Variable(0);
	Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
		Evaluacion instancia = new Evaluacion();
		instancia.Evaluar();

	}
	
	public void Evaluar() {
				
		System.out.println("Ingresar numero: ");
		objEvaluar.setVar(Integer.parseInt(entrada.nextLine()));
		
		System.out.println("Incremento en 1 con operador aritmetico de suma  : ");
		System.out.println(objEvaluar.getVar() + " + 1 = " + objEvaluar.suma(objEvaluar.getVar(), 1));
		System.out.println("Incremento en 1 con operador unario de ++  : ");
		System.out.println( "++" + objEvaluar.getVar() + " = "+ objEvaluar.unario(objEvaluar.getVar()));
		
	}

}
