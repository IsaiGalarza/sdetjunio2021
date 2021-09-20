package janet_nieto.laboratorio11;

public class PersonaAL3 {
	
	private int id;
	private String name;
	private int edad;
	
	//constructor
	public PersonaAL3(int id, String name, int edad) {
		super();
		this.id = id;
		this.name = name;
		this.edad = edad;
	}
	
	
	//get and set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", name=" + name + ", edad=" + edad + "]";
	}
	
	
	
}
