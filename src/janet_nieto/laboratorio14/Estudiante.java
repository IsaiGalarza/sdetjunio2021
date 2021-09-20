package janet_nieto.laboratorio14;


public class Estudiante implements Comparable<Estudiante>{
	
	private int codigo;
	private String nombre;
	private int edad;
	private String sexo;
	
	
	//constructor
	public Estudiante(int codigo, String nombre, int edad, String sexo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
	//get and set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}


	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
	
	
	
}
