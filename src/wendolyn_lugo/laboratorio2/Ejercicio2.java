package wendolyn_lugo.laboratorio2;

public class Ejercicio2 {
	public static void main(String[] args) {
		// instanciar objetos

		Intercambio Valor = new Intercambio(1,21,16,100);
		
		System.out.println(Valor.toString());
		
		System.out.println("Valida Rango");
		if (Valor.getValorminimo() >= 0)
				{
			System.out.println("El valor minimo es:" +Valor.getValorminimo()+" usando la función se asigna el valor: " +Valor.ValidaRango());
				}
		else
			System.out.println(Valor.getValorminimo());
	}

}
