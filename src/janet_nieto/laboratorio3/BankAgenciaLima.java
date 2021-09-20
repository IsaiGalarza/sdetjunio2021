package janet_nieto.laboratorio3;


public class BankAgenciaLima implements iBank {




public void getInterest() {
    int interes = 30;
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
	
	 int interes = 50;
	    System.out.println("Tasa de interes de Provincia" + interes); 
}

@Override
public void BankAgenciaProvincia() {
	// TODO Auto-generated method stub
	System.out.print("Agencia bancaria Provincia");
}


@Override
public void BankAgenciaLima() {
	// TODO Auto-generated method stub
	
}

}