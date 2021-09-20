package anais_pinpingos.laboratorio3;

public interface IBank {   //Interfaz Bank

	static double tea=0; // tasa de interes efectivo anual
	static int dias=0;  // numero de dias de la cuota
	static int capital=0; //saldo capital
	
	void getInterest(double ctea, int cdias, int ccapital);
}
