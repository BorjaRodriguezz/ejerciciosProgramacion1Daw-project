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
		
		//Aplicamos los métodos
		String min1 = cambiaMayusMinus(pal1);
		String min2 = cambiaMayusMinus(pal2);
		
		boolean esAnagrama = anagrama(min1, min2);
		
		//Resultado
		if (esAnagrama) {
			System.out.println("\nEs un anagrama.");
		} else {
			System.out.println("\nNo es un anagrama.");
		}
		
		sc.close();
	}
	
	//Método para saber si es un anagrama
	public static boolean anagrama(String pal1, String pal2) {
		//Si no miden lo mismo ya no pueden tener los mismo caracteres
		if (pal1.length() != pal2.length()) return false;
		
		for (int i = 0; i < pal1.length(); i++) {
			char c1 = pal1.charAt(i);
			
			//Esto es para la segunda palabra
			int pos = pal2.indexOf(c1);
			
			//Si no está la letra devolvemos falso
			if (pos == -1) return false;
			
			//Bucle para la segunda palabra igual
			for (int j = 0; j < pal2.length(); j++) {
				char c2 = pal2.charAt(j);
				
				pos = pal1.indexOf(c2);
				if (pos == -1) return false;
			}
		}
		
		//Si todas coinciden
		return true;
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
