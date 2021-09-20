package janet_nieto.laboratorio12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Añadir Libros a una Lista y luego, leer la lista de libros usando ListIterator, en ambas 
//direcciones hacia atrás y adelante ok
public class AddLibrosL3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solamente las colecciones que implementen List para este ejemplo
			List<String> listaPaises = new ArrayList<>();
			listaPaises.add("PERU");
			listaPaises.add("BOLIVIA");
			listaPaises.add("ECUADOR");
			listaPaises.add("BRASIL");
			
			
			ListIterator<String> li = listaPaises.listIterator();
			System.out.println("--------------- navegar hacia adelante-------------------");
			while(li.hasNext()) {
				System.out.println("Pais Li: " + li.next());
			}
			li.add("ARGENTINA");
			li.add("MEXICO");
			
			for (String pais : listaPaises) {
				System.out.println(pais);
			}
			System.out.println("--------------- navegar hacia atras-------------------");
			while(li.hasPrevious()) {
				System.out.println("Pais Li: " + li.previous());
			}
			
	}		
	
}
