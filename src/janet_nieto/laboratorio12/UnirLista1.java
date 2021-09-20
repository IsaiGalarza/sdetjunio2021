package janet_nieto.laboratorio12;
//Unir dos listas usando addAll() ok
import java.util.ArrayList;
import java.util.List;


public class UnirLista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initializing a list of type arraylist
		
		
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(15);
        l.add(20);
        System.out.println(l);
  
        // Initializing a collection to be appended to list
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        System.out.println(arr);
  
        l.addAll(arr);
  
        System.out.println(l);
		
		
	}

}
