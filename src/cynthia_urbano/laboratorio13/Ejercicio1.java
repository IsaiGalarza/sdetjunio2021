package cynthia_urbano.laboratorio13;

import java.util.HashSet;
import java.util.Set;

//Crear un Set e inserta y recupera los valores
public class Ejercicio1 {

		 public static void main(String[] args)
		    {
		       
		        Set<String> set = new HashSet<String>();
		 
		        set.add("Palabra 1");
		        set.add("Palabra 2");
		        set.add("Palabra 1");
		        set.add("Palabra 2");
		        set.add("Palabra 3");
		 
		        System.out.println("La lista sin duplicados es: \n"+set);
		    }
	}
