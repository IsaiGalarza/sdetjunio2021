package janet_nieto.laboratorio1;
//jny
public class Resto {
	

	//atributo
    private  int a;
    private  int b;
    	
    	
    //contructor
    
  	public Resto(int pa, int pb) {
  		super();
  		this.a = pa ;
  		this.b = pb;
  		
  	}
	
  	
  	 //funciones miembros
  	public int Restonumeros() {
  	int  resto =a%b;
  		
  		return resto;
  	}

    //get and set
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
  	

  
  	
  	
  	
  	
}
