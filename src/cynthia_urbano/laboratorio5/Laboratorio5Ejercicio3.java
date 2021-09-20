package cynthia_urbano.laboratorio5;
/*Un profesor de universidad esta tratando de calcular las calificaciones y calificaciones de 60 estudiantes.
 * Son 5 materias que deben calificar y luego, en consecuentcia, imprimir susu calificaciones. 
 * Veamos como podemos ayudarlo usando bucles y sentend¿cias condicionales. Los cinco temas son: 
 * Electrónica, Dibujo de ingeniería, Civi, Mecánica,Matemáticas
 * */

import java.util.Scanner;

public class Laboratorio5Ejercicio3 {

	public static void main(String[] args) {
		int estudiante;
		String materia[] = { "Electrónica", "Dibujo de Ingenieria", "Civil", "Mecánica", "Matemáticas" };

		String calificaciones;
		float puntajesT = 0;

		float promedio = 0;
		int CalificacionM = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número de estudiantes a Evaluar ");
		estudiante = sc.nextInt();

		for (int i = 1; i <= estudiante; i++) {
			System.out.println("Ingrese las calificaciones del estudiante #" + i);

			for (int j = 0; j <= 4; j++) {

				System.out.print(" Para " + materia[j] + ": ");
				Scanner calM = new Scanner(System.in);
				CalificacionM = calM.nextInt();
				promedio += CalificacionM;
			}
			puntajesT = promedio / 5;
			System.out.print("El puntaje es: " + puntajesT + " con calificación final -");
			if (puntajesT < 40) {
				System.out.println(calificaciones = "Deficiente-");
			} else {

				if (puntajesT >= 40 && puntajesT <= 60) {
					System.out.println(calificaciones = "Promedio-");
				} else {
					if (puntajesT > 60 && puntajesT < 75) {
						System.out.println(calificaciones = "Bueno-");
					} else {
						if (puntajesT > 75 && puntajesT < 90) {
							System.out.println(calificaciones = "Muy Bueno-");
						} else {
							if (puntajesT >= 90) {
								System.out.println(calificaciones = "Excelente-");
							}
						}
					}
				}
			}
		}

	}
}
