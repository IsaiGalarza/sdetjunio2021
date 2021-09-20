package alberto_ore.laboratorio12;

public class Estudiante implements Comparable<Estudiante> {

	int num;
	String nombre;
	int edad;

	public Estudiante(int num, String nombre, int edad) {
		this.num = num;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public int compareTo(Estudiante o) {
		if (edad == o.edad) {
			return 0;

		} else if (edad > o.edad) {
			return 1;

		} else {

			return -1;
		}
	}

}
