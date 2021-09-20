//3. Añadir libros a una lista y luego, leer la lista de libros usando listIterator en ambas direcciones hacia atras y hacia adelante

package anais_pinpingos.laboratorio12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListaLibros {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		Libro objLibro = new Libro();
		List<Libro> listaLibros = new ArrayList<>();
		String ttemp;
		int atemp;
		
		System.out.println("LISTA DE LIBROS");
		System.out.println("----------------");
		System.out.println("Ingrese cantidad de libros a registar:");
		int cantidad = Integer.parseInt(entrada.nextLine());
		
		for(int i = 0; i < cantidad; i++) {
			System.out.println("Ibgrese titulo de libro " + (i+1) + ": ");
			ttemp = entrada.nextLine();
			System.out.println("Ibgrese año de libro " + (i+1) + ": ");
			atemp=Integer.parseInt(entrada.nextLine());
			objLibro = new Libro(ttemp,atemp);
			listaLibros.add(objLibro);	
			}
	
		ListIterator<Libro> lib = listaLibros.listIterator();	
		
		System.out.println("--------------- LEER HACIA ADELANTE-------------------");
		while(lib.hasNext()) {
			System.out.println("LIBRO : ");
			lib.next().descripcion();
		}
		System.out.print("\n");
		System.out.println("--------------- LEER HACIA ATRAS-------------------");
		while(lib.hasPrevious()) {
			System.out.println("LIBRO : ");
			lib.previous().descripcion();
		}
		
	}
	
	
	
		
		

	

}
