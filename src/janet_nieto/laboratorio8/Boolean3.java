package janet_nieto.laboratorio8;
//3.escribir un programa a covertir un Objeto Boolean a una variable boolean

public class Boolean3 {	

	    public static void main(String[] args) {
	       

	        Boolean a = new Boolean("true");
	        Boolean b = new Boolean("false");
	        boolean valorPrimitivoTrue = a.booleanValue();
	        boolean valorPrimitivoFalse = b.booleanValue();
	        
	        
	        if(a) {
	       
	            String c = "Primitive: " + valorPrimitivoTrue;
	            System.out.println(c);
	        }
	  
	        
	        else {
	         
	        	
	        	String d = "Primitive: " + valorPrimitivoTrue;
	            System.out.println(d);	        	
	        }
	        

	    }
	}

