package alberto_ore.laboratorio5;

import java.util.Scanner;

public class Calificacion {

	public static void main(String[] args) {

		int calificacion;
		String materia;
		int numAlumnos;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese materia: ");
		materia = sc.nextLine();

		for (int j = 1; j <= 5; j++) {

			if (materia.equals("Electr�nica")) {

				System.out.println("Ingrese Puntaje Total:  ");
				calificacion = sc.nextInt();

				if (calificacion < 40) {
					System.out.println("Deficiente");
					break;

				} else if (calificacion > 40 && calificacion < 60) {
					System.out.println("Promedio");
					break;
				} else if (calificacion > 60 && calificacion < 75) {
					System.out.println("Bueno");
					break;
				} else if (calificacion >= 75 && calificacion < 90) {
					System.out.println("Muy Bueno");
					break;
				} else if (calificacion >= 90) {
					System.out.println("Excelente");
					break;
				} else {
					System.out.println("No existe esa calificaci�n.");
					break;
				}

			} else if (materia.equals("Dibujo de Ingenier�a")) {

				System.out.println("Ingrese Puntaje Total:  ");
				calificacion = sc.nextInt();

				if (calificacion < 40) {
					System.out.println("Deficiente");
					break;

				} else if (calificacion > 40 && calificacion < 60) {
					System.out.println("Promedio");
					break;
				} else if (calificacion > 60 && calificacion < 75) {
					System.out.println("Bueno");
					break;
				} else if (calificacion >= 75 && calificacion < 90) {
					System.out.println("Muy Bueno");
					break;
				} else if (calificacion >= 90) {
					System.out.println("Excelente");
					break;
				} else {
					System.out.println("No existe esa calificaci�n.");
					break;
				}
			} else if (materia.equals("Dibujo de Ingenier�a")) {

				System.out.println("Ingrese Puntaje Total:  ");
				calificacion = sc.nextInt();

				if (calificacion < 40) {
					System.out.println("Deficiente");
					break;

				} else if (calificacion > 40 && calificacion < 60) {
					System.out.println("Promedio");
					break;
				} else if (calificacion > 60 && calificacion < 75) {
					System.out.println("Bueno");
					break;
				} else if (calificacion >= 75 && calificacion < 90) {
					System.out.println("Muy Bueno");
					break;
				} else if (calificacion >= 90) {
					System.out.println("Excelente");
					break;
				} else {
					System.out.println("No existe esa calificaci�n.");
					break;
				}
			} else if (materia.equals("Civil")) {

				System.out.println("Ingrese Puntaje Total:  ");
				calificacion = sc.nextInt();

				if (calificacion < 40) {
					System.out.println("Deficiente");
					break;

				} else if (calificacion > 40 && calificacion < 60) {
					System.out.println("Promedio");
					break;
				} else if (calificacion > 60 && calificacion < 75) {
					System.out.println("Bueno");
					break;
				} else if (calificacion >= 75 && calificacion < 90) {
					System.out.println("Muy Bueno");
					break;
				} else if (calificacion >= 90) {
					System.out.println("Excelente");
					break;
				} else {
					System.out.println("No existe esa calificaci�n.");
					break;
				}
			} else if (materia.equals("Mec�nica")) {

				System.out.println("Ingrese Puntaje Total:  ");
				calificacion = sc.nextInt();

				if (calificacion < 40) {
					System.out.println("Deficiente");
					break;

				} else if (calificacion > 40 && calificacion < 60) {
					System.out.println("Promedio");
					break;
				} else if (calificacion > 60 && calificacion < 75) {
					System.out.println("Bueno");
					break;
				} else if (calificacion >= 75 && calificacion < 90) {
					System.out.println("Muy Bueno");
					break;
				} else if (calificacion >= 90) {
					System.out.println("Excelente");
					break;
				} else {
					System.out.println("No existe esa calificaci�n.");
					break;
				}
			} else if (materia.equals("Matem�ticas")) {

				System.out.println("Ingrese Puntaje Total:  ");
				calificacion = sc.nextInt();

				if (calificacion < 40) {
					System.out.println("Deficiente");
					break;

				} else if (calificacion > 40 && calificacion < 60) {
					System.out.println("Promedio");
					break;
				} else if (calificacion > 60 && calificacion < 75) {
					System.out.println("Bueno");
					break;
				} else if (calificacion >= 75 && calificacion < 90) {
					System.out.println("Muy Bueno");
					break;
				} else if (calificacion >= 90) {
					System.out.println("Excelente");
					break;
				} else {
					System.out.println("No existe esa calificaci�n.");
					break;
				}
			} else {
				System.out.println("Dicho curso no existe.");
					break;
			}

		}

	}

}
