package janet_nieto.laboratorio4;

//1.Escribir un programa para imprimir el mas grande de tres numeros usando if-else-if

public class NumeroMayor {
	//atributo
    private  int a;
    private  int b;
    private  int c;
	
//contructor

public NumeroMayor(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}

//funciones miembros
  	public int FNumeroMayor() {
  	int  aux;
  		if (this.a > this.b) {
            if (this.a > this.c) {
                aux= this.a;                                             
            } else {
                aux= this.c;     
            }
        } else if (this.b > this.c) {
                aux=this.b;
        } else {
                aux=this.c;
        }
  		return aux;
  	}

  	
  	
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

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
	
	
	
	
}
