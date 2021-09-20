package janet_nieto.laboratorio1;
//jny
public class Cociente {
	
	

	//atributo
    private  int a;
    private  int b;
    	
    	
    //contructor
    
  	public Cociente(int pa, int pb) {
  		super();
  		this.a = pa ;
  		this.b = pb;
  		
  	}
	
  //funciones miembros
  	public int CocienteNumero() {
  	int  cociente =a/b;
  		
  		return cociente;
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
