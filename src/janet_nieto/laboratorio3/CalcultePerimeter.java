package janet_nieto.laboratorio3;

public class CalcultePerimeter {
	 
    public int CalcultePerimeter(int x, int y, int z)
    {
        //perimetro de triangulo
    	return (x + y + z);
    }
    
  
    public int CalcultePerimeter(int x, int y)
    {
    	 //perimetro de triangulo
        return (x + y + 10);
    }
  
    
    public double CalcultePerimeter(double x, double y,double z)
    {
    	 //perimetro de triangulo
        return (x + y + z);
    }
  
    
    public static void main(String args[])
    {
    	CalcultePerimeter s = new CalcultePerimeter();
        System.out.println("Perimetro de triangulo: " + s.CalcultePerimeter(10, 20,10));
        System.out.println("Perimetro de triangulo: " + s.CalcultePerimeter(10, 20));
        System.out.println("Perimetro de triangulo: " + s.CalcultePerimeter(10.5, 20.5,10.1));
    }
}
