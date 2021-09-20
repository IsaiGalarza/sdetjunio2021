package alberto_ore.laboratorio12_2;

import java.util.Comparator;

public class EdadComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Estudiante est1 = (Estudiante) o1;
		Estudiante est2 = (Estudiante) o2;

		if (est1.edad == est2.edad) {
			return 0;

		} else if (est1.edad > est2.edad) {
			return 1;

		} else {

			return -1;

		}
	}

}
