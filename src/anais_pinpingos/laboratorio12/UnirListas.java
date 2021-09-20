package anais_pinpingos.laboratorio12;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class UnirListas {

	public static void main(String[] args) {


		List<String> listaPaises = new ArrayList<>();
		listaPaises.add("PERU");
		listaPaises.add("BOLIVIA");
		listaPaises.add("ECUADOR");
		listaPaises.add("BRASIL");
		listaPaises.add("MEXICO");
		
		System.out.println("LISTA DE PAISES");
		System.out.println("---------------");
		for(int i = 0; i < listaPaises.size() ; i++) {
			System.out.println(listaPaises.get(i));
		}

		List<String> listaColores = new ArrayList<>();
		listaColores.add("BLANCO");   
		listaColores.add("AZUL");      
		listaColores.add("AMARAILLO");    
		listaColores.add("ANARANJADO");    
		listaColores.add("MORADO");  
		listaColores.add("NEGRO");   
		
		System.out.print("\n");
		System.out.println("LISTA DE COLORES");
		System.out.println("----------------");
		for(int i = 0; i < listaColores.size() ; i++) {
			System.out.println(listaColores.get(i));
		}

		List<String> listaUnida = new ArrayList<>(listaPaises);
		//List<String> listaUnida = new ArrayList<>(listaPaises.size());
		//Collections.copy(listaUnida, listaPaises);		
		listaUnida.addAll(listaColores);
		System.out.print("\n");
		System.out.println("LISTA UNIDA");
		System.out.println("-----------");
		for(int i = 0; i < listaUnida.size() ; i++) {
			System.out.println(listaUnida.get(i));
		}	
	
		

	}

}
