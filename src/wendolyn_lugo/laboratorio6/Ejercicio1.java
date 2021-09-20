package wendolyn_lugo.laboratorio6;

public class Ejercicio1 {
//Escribir un programa a calcular el promedio de los elementos en un array
	public static void main(String[] args) {

		int[] promedio = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int suma = 0;

		for (int i=0; i<promedio.length;i++) {
			System.out.println("Valor de los elementos: " + i);
			suma = suma + promedio[i];
			System.out.println("Valor despues: " + suma);
		}

	}
}
