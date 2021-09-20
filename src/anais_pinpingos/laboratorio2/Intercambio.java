package anais_pinpingos.laboratorio2;

import java.util.Scanner;

public class Intercambio {

	private Objeto objObjeto = new Objeto(0,0);
	Scanner entrada = new Scanner (System.in);
	private float temp;
	
	public static void main(String[] args) {
	
	Intercambio instancia = new Intercambio();
	instancia.Intercambiar();
		
	}
	
	public void Intercambiar() {
		
		System.out.println("Ingresar valor de tipo float para Atributo 1: ");
		objObjeto.setAtributo1(Float.parseFloat(entrada.nextLine()));
				
		System.out.println("Ingresar valor de tipo float para Atributo 2: ");
		objObjeto.setAtributo2(Float.parseFloat(entrada.nextLine()));
		
		System.out.println("Valores ingresados: ");
		System.out.println("Atributo 1: " + objObjeto.getAtributo1());
		System.out.println("Atributo 2: " + objObjeto.getAtributo2());
		
		temp=objObjeto.getAtributo1();
		objObjeto.setAtributo1(objObjeto.getAtributo2());
		objObjeto.setAtributo2(temp);
		
		System.out.println("Valores intercamnbiados: ");
		System.out.println("Atributo 1: " + objObjeto.getAtributo1());
		System.out.println("Atributo 2: " + objObjeto.getAtributo2());
		
	}
	

}
