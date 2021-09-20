package alberto_ore.laboratorio11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIndice {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList();
		list1.add(0, "Alberto");
		list1.add(1, "Pedro");
		list1.add(2, "Juan");
		list1.add(3, "Mario");
		list1.add(4, "Jose");
		for (String temp : list1) {
			System.out.println("Nombres: " + temp);
		}

		if (list1.contains("Alberto")) {
			list1.remove(0);
			list1.add(0, "Aaron");

		}

		System.out.println("-----------------------------");
		for (String temp : list1) {
			System.out.println("Nombres: " + temp);
		}

	}

}
