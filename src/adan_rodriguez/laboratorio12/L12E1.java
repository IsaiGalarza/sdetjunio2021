package adan_rodriguez.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L12E1 {

	public static void main(String[] args) {
		

		List<String> listaPaises = new ArrayList<>();
		listaPaises.add("M�xico");
		listaPaises.add("USA");
		listaPaises.add("Deustchland");
		
		List<String> listaIdiomas = new ArrayList<>();
		listaIdiomas.add("Espa�ol");
		listaIdiomas.add("Ingl�s"); 
		listaIdiomas.add("Aleman");
		
		System.out.println("-----Uniendo listas-----------");
		
		for(int i=0;i<listaIdiomas.size();i++)
		{
			Collections.addAll(listaPaises, listaIdiomas.get(i));

		}
		
		
		for (String valores : listaPaises) {
			System.out.println(valores);
		}
	
		

	}

}
