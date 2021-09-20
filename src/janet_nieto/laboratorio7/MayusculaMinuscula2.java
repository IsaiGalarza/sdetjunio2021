package janet_nieto.laboratorio7;

//Escribe un programa para encontrar las mayusculas y minusculas en la cadeja adjunta
public class MayusculaMinuscula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String characters="AbCdefGHiijklMNOpqRstUVwxyz@%*234";

      //String characters = "Hola Mundo SDET";
		char[] arraycharacters = characters.toCharArray();
		
		String minusculas = "";
		String mayusculas = "";
		
		for (char letra : arraycharacters) {
			if(Character.isUpperCase(letra)) {
				mayusculas = mayusculas + letra;
			}
			 else if (Character.isLowerCase(letra)){
				 
				minusculas = minusculas + letra;
			}
			
				 
		}
		
		System.out.println("Mayusculas: " + mayusculas);
		System.out.println("Minusculas: " + minusculas);
	}

}

