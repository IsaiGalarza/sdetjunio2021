package janet_nieto.laboratorio2;



//Escribir un programa donde declares 3 tipos diferentes de variables, una funcion miembro e imprimir el valor de cada variable.
public class FuncionMiembro {

	//atributo
    private  String a ="Año del Bicentenario del Perú"; 
    private  int    b =200; 
    private  float  c  = 24.00f;

     
   
 //contructor
    

public FuncionMiembro() {

}    
    
//get and set
	public String Cadena() {
  	String  cadena =this.a;
  		
  		return cadena;
  	}
  	
  	public int Anio() {
  		
  	int annio=this.b;
  	
  	return annio;
  	
  	}
  	
	public float Dias() {
  		
	  	float dias=this.c;
	  	
	  	return dias;
	  	
	  	}


	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public float getC() {
		return c;
	}


	public void setC(char c) {
		this.c = c;
	}
  	

	
	
  	
  	
  	
}





