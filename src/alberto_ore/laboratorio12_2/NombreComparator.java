package alberto_ore.laboratorio12_2;

import java.util.Comparator;

public class NombreComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Estudiante est1 = (Estudiante) o1;
		Estudiante est2 = (Estudiante) o2;

		return est1.nombre.compareTo(est2.nombre);
	}

}
