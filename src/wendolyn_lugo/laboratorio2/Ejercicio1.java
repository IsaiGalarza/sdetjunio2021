package wendolyn_lugo.laboratorio2;

public class Ejercicio1 {
	
	public static void main (String[] args) {
		tipoVariable PedimentoAduana1 = new tipoVariable("01",true,999999,2021);
		tipoVariable PedimentoAduana2 = new tipoVariable("04",false,666666,2010);
		
		System.out.println(PedimentoAduana1.toString());
		System.out.println(PedimentoAduana2.toString());
		
		System.out.println("Imprimiendo función miembro: " + PedimentoAduana1.vigenciaEjercicio());
	}

}
