package anais_pinpingos.laboratorio1;

public class Variable {

	private int var;
	
	public Variable(int cvar) {
		super();
		this.var = cvar;
	}

	public int suma(int a, int b) {
		return (a+b);
	}
	
	public int unario(int x) {
		return ++x;
	}	
	
	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
		
}