package cynthia_urbano.laboratorio7;

//Escribe un programa para recortar el string " She sells sea shells on the sea shore "
public class Laboratorio7Ejercicio4 {

	public static void main(String[] args) {

		String cadena = " She sells sea shells on the sea shore ";
		String[] str = cadena.split(" ");

		for (int i = 0; i < str.length; i++) {
			System.out.println("Palabra "+ i +": "+ str[i]);
		}

	}

}
