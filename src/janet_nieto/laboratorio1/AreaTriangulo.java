package janet_nieto.laboratorio1;
//jny
public class AreaTriangulo {
	
	// instanciar un clase para calcular �rea y per�metro

	    private Base objArticulo1 = new Base(200, 3);		
        
        private Perimetro objLados = new Perimetro(100, 50,50);	
	    

	    public static void main(String[] args) {
			// TODO Auto-generated method stub				
	
			AreaTriangulo instancia = new AreaTriangulo();
			
			
		//1.calcular �rea y per�metro
		    instancia.Calcularareatriangulo();
		    instancia.Calcularperimetrotriangulo();
		    
		    		
		 // 2.instanciar un clase para evaluar resultado de una expresi�n con operador unario
		    
	    	CalculoUnario calculounario1 = new CalculoUnario(10,10);
	    
	        System.out.println("2.Valor origen:" + 10 +" Incremento: " + calculounario1.ObtenerIncrementoUnario());
	        System.out.println("2.Valor origen:" + 10 +" Decremento: " + calculounario1.ObtenerDecrementoUnario());
		    
	   //3.Cociente y resto de 2 n�meros
		    
	        Cociente Cociente1 = new Cociente(10,10);
	        System.out.println("3.Cociente de 10/10: "+ Cociente1.CocienteNumero());
	        
	        Resto Resto1 = new Resto(10,10);
	        System.out.println("3.Resto de 10/10: "+ Resto1.Restonumeros());
	        
	        
	}



	
	// metodo 1 calculo �rea
		public void Calcularareatriangulo() {
			
		//variable local - precio final con descuento
		int precioPedido = (objArticulo1.getBase() * objArticulo1.getAltura());

     	System.out.println("1.Base: 200  Altura: 3. �rea del rect�ngulo: " + (precioPedido/2));
			
		}
	
		// metodo 2 calculo per�metro
		
		
        public void Calcularperimetrotriangulo() {
			
		//variable local - precio final con descuento
		int precioPedido = (objLados.getLado1() + objLados.getLado2() + objLados.getLado3());

		System.out.println("1.Lado1:100 Lado2:50 Lado:50. Per�metro del rect�ngulo: " + precioPedido);
			
			
		}

}


