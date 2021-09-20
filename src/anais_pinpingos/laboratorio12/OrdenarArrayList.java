// Ordenar una ArrayList usando Comparable y Comparator

package anais_pinpingos.laboratorio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class OrdenarArrayList {
	
	static List<Pedido> listaPedidos = new ArrayList<>();
	
	public static void main(String[] args) {
		
		OrdenarArrayList objOrdenar =new OrdenarArrayList();
		
		Pedido objPedido1 = new Pedido("ZAPATO", 2, 200.5);
		Pedido objPedido2 = new Pedido("POLOS", 7, 140);
		Pedido objPedido3 = new Pedido("JABON", 5, 9.3);
		Pedido objPedido4 = new Pedido("ACEITE", 1, 10);
		
		
		listaPedidos.add(objPedido1);
		listaPedidos.add(objPedido2);
		listaPedidos.add(objPedido3);
		listaPedidos.add(objPedido4);
		
		System.out.println("LISTA  DE  PEDIDOS");
		System.out.println("-------------------");
		System.out.println("CANT  PORDUCTO  TOTAL");
		for(int i = 0; i < listaPedidos.size() ; i++) {
			listaPedidos.get(i).descripcion();
		}
		
		System.out.println("\n");
		System.out.println("---------OREDENAMIENTO COMPARABLE---------");
		objOrdenar.Comparable();
		System.out.println("\n");
		System.out.println("---------OREDENAMIENTO COMPARATOR---------");
		objOrdenar.Comparator();
		
	}
	
	public void Comparable() {
		
		Collections.sort(listaPedidos);
		
		for(int i = 0; i < listaPedidos.size() ; i++) {
			listaPedidos.get(i).descripcion();
		}
		
		
	}
	
	public void Comparator() {
		
		listaPedidos.sort(new Comparator<Pedido>() {
			@Override
			public int compare(Pedido x, Pedido y) {
				return x.getCantidad().compareTo(y.getCantidad()); //Ordenado de menor a amyor
			}
		});
	
		for(int i = 0; i < listaPedidos.size() ; i++) {
			listaPedidos.get(i).descripcion();
		}
		
	}
	
	
}