package janet_nieto.laboratorio2;



//import Laboratorio2.FuncionMiembro;

public class Principal {

	
public Principal() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Principal instancia = new Principal();
		
		//laboratorio2.1 
		FuncionMiembro funcion1 = new FuncionMiembro();		 	 
	      
	    System.out.println("2.1.Laboratorio: "+ funcion1.Cadena()+ " " + funcion1.Anio()  +" años de independencia. Falta " + funcion1.Dias() + " días para la celebración.");
			
	   //2.2 Escribir un programa donde se intercambien los valores de dos variables de tipo float
	    	      
	    IntercambioValor funcion2 = new IntercambioValor(10.1f,1.1f);
	    System.out.println("2.2.Laboratorio: "+ funcion2.NuevoValor1() +" "+ funcion2.NuevoValor2()  );
	    
	   //2.3 Definir una clase y crear sus objetos, definir sus atributos, constructores y funciones miembro 
	    
	    FuncionMiembro funcion3 = new FuncionMiembro();
	    System.out.println("2.3.Laboratorio: Definición de clase ,objeto,atributo y constructor "+ funcion3.Cadena());
	}
		  
	

}




