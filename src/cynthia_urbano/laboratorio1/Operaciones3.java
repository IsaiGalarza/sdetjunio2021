package cynthia_urbano.laboratorio1;

public class Operaciones3 {
	
	//Atributos
	
		private float dividendo;
		private float divisor;
			
	//M�todo constructor personalizado
		
		public Operaciones3(float dividendo, float divisor) {
			super();
			this.dividendo = dividendo;
			this.divisor = divisor;
		}
		
	//M�todos
		
		//Para el cociente
		
		public float Cociente () {
			float cociente= dividendo/divisor;
			return cociente; 
		}
		
		//Para el resto
		public float Resto () {
			float resto= dividendo % divisor;
			return resto; 
		}

}
