package janet_nieto.laboratorio8;
//4.escribir un programa para agregar cadenas usando StringBuilder y StringBuffer

public class StringBuilderBuffer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//...string builder 
		StringBuilder CadenaBuilder = new StringBuilder("valor cadena");
		System.out.println(CadenaBuilder);
				
		
		CadenaBuilder.insert(12, " curso");
		System.out.println(CadenaBuilder);
		
		CadenaBuilder.replace(0, 6, "contenido ");
		System.out.println(CadenaBuilder);
		
		CadenaBuilder.delete(0, 9);
		System.out.println(CadenaBuilder);
		
		CadenaBuilder.append(" concatenar1");
		CadenaBuilder.append(" concatenar2");
		CadenaBuilder.append(" concatenar3");
		System.out.println(CadenaBuilder);
		
		CadenaBuilder.reverse();
		System.out.println(CadenaBuilder);
		
		//...string Buffer
		
		StringBuffer CadenaBuffer = new StringBuffer("mi cadena buffer");
		System.out.println(CadenaBuffer.reverse());
		
		CadenaBuffer.insert(16, " curso sdet");
		System.out.println(CadenaBuffer);
		
		CadenaBuffer.replace(0, 9, "mi collar");
		System.out.println(CadenaBuffer);
		
		CadenaBuffer.delete(0, 3);
		System.out.println(CadenaBuffer);
		
		CadenaBuffer.append(" contatenamos 1");
		CadenaBuffer.append(" contatenamos 2");
		CadenaBuffer.append(" contatenamos 3");
		
		System.out.println(CadenaBuffer);
		
	}

}
