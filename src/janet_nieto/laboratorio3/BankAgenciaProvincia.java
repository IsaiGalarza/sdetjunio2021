package janet_nieto.laboratorio3;


public class BankAgenciaProvincia implements iBank {



public void BankAgenciaLima() {
    System.out.print("Agencia bancaria Lima"); 
    
    
}

public void getInterest() {
    int interes = 20;
    System.out.println("Tasa de interes de Lima" + interes); 
}


@Override
public void getInterestLima() {
	// TODO Auto-generated method stub
	System.out.print("Agencia bancaria Lima Metropolitana");
	
}


@Override
public void getInterestProvincia() {
	// TODO Auto-generated method stub
	
	 int interes = 40;
	    System.out.println("Tasa de interes de Provincia" + interes); 
}

@Override
public void BankAgenciaProvincia() {
	// TODO Auto-generated method stub
	
}





}