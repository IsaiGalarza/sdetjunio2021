package janet_nieto.laboratorio1;
//jny
public class CalculoUnario {

	
	//atributo
    private  int a;
    private  int b;
    	
    	
    //contructor
    
  	public CalculoUnario(int pa, int pb) {
  		super();
  		this.a = pa ;
  		this.b = pb;
  		
  	}
  	
  	
	//funciones miembros
	public int ObtenerIncrementoUnario() {
	int  valor =a+1;
		
		return valor;
	}
    

	public int ObtenerDecrementoUnario() {
		int  valor =b-1;
			
			return valor;
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
