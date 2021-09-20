package janet_nieto.laboratorio8;
//1.escribir un programa para comparar dos String comprobar si son iguales	ok		


import java.util.Arrays;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			String[] marcasAutos = {"Toyota","Alto","Dezire", "Brezza", "Swift"};
			
			for (String marca : marcasAutos) {
				System.out.println("Marca: " + marca);
			}
			
			System.out.println("---------------------------------------------------------------------------------");
			
			
			Arrays.sort(marcasAutos);
			for (String marca : marcasAutos) {
				System.out.println("Marca: " + marca);
			}
			
			System.out.println("---------------------------------------------------------------------------------");
			
			String saludo = "Hola Mundo SDET";
			char[] arraySaludo = saludo.toCharArray();
			
			String minusculas = "";
			String mayusculas = "";
			
			for (char letra : arraySaludo) {
				if(Character.isUpperCase(letra)) {
					mayusculas = mayusculas + letra;
				}else {
					minusculas = minusculas + letra;
				}
			}
			
			System.out.println("Mayusculas: " + mayusculas);
			System.out.println("Minusculas: " + minusculas);
			
			System.out.println("---------------------------------------------------------------------------------");
			
			String cadena1 = "Bienvenidos al ";
			String cadena2 = "curso SDET ";
			cadena1 = cadena1.concat(cadena2);
			
			System.out.println(cadena1);
			
			
			System.out.println("---------------------------------------------------------------------------------");
			String cadena3 = "Bienvenidos al curso SDET";
			System.out.println("Recorte de un indice: " + cadena3.substring(11));
			
			System.out.println("---------------------------------------------------------------------------------");
			String cadena4 = "Bienvenidos al curso SDET";
			System.out.println("Recorte indice inicial al indice final: " + cadena4.substring(11, 20));
			
			
			System.out.println("---------------------------------------------------------------------------------");
			String cadena5 = "Ta Te Ti To Tu";
			System.out.println("Antes: " + cadena5);
			String aux =  cadena5.replaceAll("Ta", "Pa"); 
			System.out.println("Replace All: " + aux);
		}

	}
