package wendolyn_lugo.laboratorio7;

import java.util.Arrays;

public class Ejercicio1 {
//Escribe un programa parorenaloTrigdel Array (Bubble Sort)
	public static void main (String[]args) {
		String[] MarcaAuto = {"Toyota","Nissan","Ford","Chrysler","Audi","Tesla"};
		
		for (String orden : MarcaAuto) {
			System.out.println("Marca: " + orden);
		}
		
		System.out.println("------------Usando librería utils.Arrays-----------");
		Arrays.sort(MarcaAuto);
		for (String orden : MarcaAuto) {
			System.out.println("Marca: " + orden);
		}
		
	}
}
