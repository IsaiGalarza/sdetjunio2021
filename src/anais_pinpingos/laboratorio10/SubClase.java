package anais_pinpingos.laboratorio10;

	public class SubClase extends SuperClase {
		
		public SubClase() {
		}
		
		public SubClase(int base, int altura) {
			super(base,altura);
		}
	
		//Metodo sobreescrito
		@Override
		public void calcularArea(int a,int b) { //metodo calcular area del triangulo
			
			try {
				int area=(a*b)/0;  //genera excepcion
				setArea(area);
	
			}catch (ArithmeticException ae) {
				System.out.println("Error aritmetico al calcular area de Triangulo: " + ae.getMessage());
				ae.printStackTrace();
			}
			catch (Exception e) {
				System.out.println("Error generico al calcular area de Triangulo: " + e.getMessage());
				e.printStackTrace();
			}
			
		}
		
		public static void main(String[] args) {
			
			SubClase instSubClase= new SubClase();
			instSubClase.calcularArea(2,3); // llama al meodo sobreescrito
			System.out.println("El area  del Triangulo es : " + instSubClase.getArea());
			

		}	
	
	
	}
