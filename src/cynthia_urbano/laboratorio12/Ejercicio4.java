package cynthia_urbano.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Encontrar el m�ximo y el m�nimos de una lista usando la clase Collections
public class Ejercicio4 {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>(); 
		
		lista.add(5);
		lista.add(11);
		lista.add(44);
		lista.add(77);
        
		Integer min = Collections.min(lista);
		Integer max = Collections.max(lista);

		System.out.println(String.format("El n�mero m�nimo de la lista es: " +min));
		System.out.println(String.format("El n�mero m�ximo de la lista es: " +max));
	}

}
