package anais_pinpingos.laboratorio10;

public class SuperClase {  //Calculo de area
		
		private int base;
		private int area;
		private int altura;
		
		public SuperClase() {

		}
		
		public SuperClase(int base, int altura) {
			this.base = base;
			this.altura = altura;
		}

		//Metodo miembro
		public void calcularArea(int a,int b) { //metodo calcular area del cuadrado

			try {
	
				base=a;
				altura=b;
				area=base/altura;
				setArea(area);
	
			}catch (ArithmeticException ae) {
				System.out.println("Error aritmetico al calcular area de Cuadrado: " + ae.getMessage());
				ae.printStackTrace();
			}
			catch (Exception e) {
				System.out.println("Error generico al calcular area de Cuadrado: " + e.getMessage());
				e.printStackTrace();
			}			
			
		}

		public int getBase() {
			return base;
		}

		public void setBase(int base) {
			this.base = base;
		}

		public int getArea() {
			return area;
		}

		public void setArea(int area) {
			this.area = area;
		}

		public int getAltura() {
			return altura;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}



	
}
