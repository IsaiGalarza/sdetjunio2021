package janet_nieto.laboratorio10;
//import java.util.Scanner;
//escribe un programa donde es lanzada una excepcion definida por el usuario
public class ExcepcioDefinidoUsuario1 {

		//throw nos permite lanzar una excepción propia, 

public static void main(String[] args) {
    int a;
    try{
        a = dividir(5,0);
    }catch(MalNumeroADividir err){
        System.out.println(err);
    }finally{
        a = 0;
    }
    System.out.println("Valor de a = "+a);
}

public static int dividir(int a, int b)throws MalNumeroADividir{
    if(b == 0){
        throw new MalNumeroADividir();
    }
    return a / b;
}

public static class MalNumeroADividir extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MalNumeroADividir() {
       super("No es posible dividir entre cero");
   }
 }

}
