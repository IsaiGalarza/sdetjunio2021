package adan_rodriguez.laboratorio8;

public class L8E2 {

	public static void main(String[] args) {
		
		String dato="58";
		double num=15.50;
		
		System.out.println("suma de dos datos usando envolturas");
		System.out.println("Dato String " + dato);
		System.out.println("Dato Double " + num);
		
		Double suma = new Double (dato);
		suma=suma+num;
		System.out.println("Dato suma en Envoltura del Tipo doble para dato y suma el valor de num " + suma );

	}

}
