package janet_nieto.laboratorio4;
//2.Escribir un programa para comprobar si una letra es una vocal o consonante utilizando la sentencia switch case

public class VocalConsonante {
//atributo 
     private  String a;
	    
	
//constructor		
/**
	 * @param a
	 */
	public VocalConsonante(String a) {
		super();
		this.a = a;
	}


//funciones miembros
	public String FVocalConsonante() {
	  	String  aux=this.a;
	    String  Cadena;
		switch(aux) {
		case "a":
			Cadena="Vocal";
			break;
			
		case "e":
			Cadena="Vocal";
			break;
		case "i":
			Cadena="Vocal";
			break;
		case "0":
			Cadena="Vocal";
			break;
		case "b":
			Cadena="Consonante";
			break;
		case "c":
			Cadena="Consonante";
			break;
		case "d":
		    Cadena="Consonante";
		    break;
		case "f":
			Cadena="Consonante";
			break;
		case "g":
		    Cadena="Consonante";
		    break;
		case "h" :   
		    Cadena="Consonante";
			break;			
		case "j":
			Cadena="Consonante";
			break;
		case "k":
			Cadena="Consonante";
			break;
		case "l":
			Cadena="Consonante";
			break;
		case "m":
			Cadena="Consonante";
			break;
		case "n":
			Cadena="Consonante";
			break;
		case "p":
			Cadena="Consonante";
			break;
		case "q":	
		    Cadena="Consonante";
		    break;
		    
		case "r":
			Cadena="Consonante";
			break;
		case "s":
			Cadena="Consonante";
			break;
		case "t":
			Cadena="Consonante";
			break;
		case "v":
			Cadena="Consonante";
			break;
		case "w":
			Cadena="Consonante";
			break;
		case "x":
			Cadena="Consonante";
			break;
		case "y":
			Cadena="Consonante";
			break;
		case "z":
			Cadena="Consonante";
			break;			
		default:
			Cadena ="No corresponde";
	}
		return Cadena;
	  	
		
	
  
	
   }
	
}