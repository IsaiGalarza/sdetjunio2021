package cynthia_urbano.laboratorio2;

public class Ejercicio1 {
	
	//Variable de instancia
		private int edad=22;
		
	//variable de tipo estatico que ahora pertenece a la clase
	private static String uno = "Esta es una variable estática"; 
	
	//Variable local solo se usa donde fue declarada
	public static void metodo() {
		
		String local= "Esta es una variable local";
		System.out.println(local);
	}
	
	

	public static void main(String[] args) {
		Ejercicio1 ejercicio1= new Ejercicio1();
		metodo();
		System.out.println(Ejercicio1.uno); //Para imprimirlo se puede llamar desde la clase
		System.out.println("Edad como variable de instancia es: " + ejercicio1.getEdad()); //Para imprimirlo se puede llamar desde la clase
		
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
