package capitulo04.ejercicios.bloque06_StringParaCampeones;

import java.util.Scanner;

public class Ej02_Anagrama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de palabras
		System.out.println("Introduce palabra: ");
		String pal1 = sc.nextLine();
		System.out.println("Introduce palabra: ");
		String pal2 = sc.nextLine();
		
		
	}
	
	//Método para saber si es un anagrama
	public static boolean anagrama(String pal1, String pal2) 
		//Si no miden lo mismo ya no pueden tener los mismo caracteres
		if (pal1.length() != pal2.length()) {
			return false;
		}
		
		for (int i = 0; i < pal1.length(); i++) {
			char c1 = pal1.charAt(i);
		}
	}

	//Método para cambiar de mayuscula a minuscula
	public static String cambiaMayusMinus(String cadena) {
		String nuevaCad = "";
		
		//Bucle para cambiar de mayuscula a minuscula
		for (int i = 0; i < cadena.length(); i++) {
			char cad = cadena.charAt(i);
			if (cad >= 'A' && cad <= 'Z') {
				cad += 32;
			}
		
		//Aplicamos el resultado del bucle
		nuevaCad += cad;
			
		}
		return nuevaCad;
	}
}
