package wendolyn_lugo.laboratorio1;

public class Calculo_AP {
	
	private rectangulo objrectangulo1 = new rectangulo ("Rectangulo",7,5);
	
	public static void main(String[] args) {
		
		Calculo_AP instancia = new Calculo_AP();
	instancia.Resultado();

}

public void Resultado() {
	System.out.println("Figura: "+ objrectangulo1.getFigura() +
			" con Base:" + objrectangulo1.getbase() + 
			", Altura:" + objrectangulo1.getaltura() +
			", Area:" + objrectangulo1.Area());
	System.out.println("Figura: "+ objrectangulo1.getFigura() +
			" con LadoA:" + objrectangulo1.getbase() + 
			", LadoB:" + objrectangulo1.getaltura() +
			", Perimetro:" + objrectangulo1.Perimetro());
	System.out.println("¿Evaluación de: " + objrectangulo1.getbase() + 
			" menos " + objrectangulo1.getaltura() +
			" es menor a 5? " + objrectangulo1.Evaluar()+ " aplicando la negación lógica:" + !objrectangulo1.Evaluar());
	System.out.println("Cociente de: " + objrectangulo1.getbase() + 
			" entre " + objrectangulo1.getaltura() +
			" es igual a: " + objrectangulo1.Division());
	System.out.println("Residuo de: " + objrectangulo1.getbase() + 
			" entre " + objrectangulo1.getaltura() +
			" es igual a:" + objrectangulo1.Cociente());
}
}