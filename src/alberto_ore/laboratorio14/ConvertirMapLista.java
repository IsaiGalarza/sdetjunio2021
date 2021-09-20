package alberto_ore.laboratorio14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertirMapLista {

	public static void main(String[] args) {

		Map<String, String> mapo = new HashMap<String, String>();
		mapo.put("a", "Alberto");
		mapo.put("b", "Juan");
		mapo.put("c", "Pedro");

		List<String> list = new ArrayList<String>(mapo.keySet());

		for (String temp : list) {
			System.out.println("Los nombres son: " + temp);

		}

	}

}
