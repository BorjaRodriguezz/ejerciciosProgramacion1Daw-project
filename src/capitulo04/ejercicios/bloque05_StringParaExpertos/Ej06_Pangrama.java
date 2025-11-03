package capitulo04.ejercicios.bloque05_StringParaExpertos;

import java.util.Scanner;

public class Ej06_Pangrama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto
		System.out.println("Introduce texto: ");
		String str = sc.nextLine();
		
		//Aplicamos el método
		boolean pangrama = pangrama(str);
		
		if (pangrama) {
			System.out.println("El texto es un pangrama.");
		} else {
			System.out.println("El texto no es un pangrama.");
		}
		
		sc.close();
	}
	
	//Método para el pangrama
	public static boolean pangrama(String cadena) {
		boolean[] letras = new boolean[26];
		
		//Bucle para letras mayus y minus y de todas por válidas
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			
			//Letras mayusculas y minusculas
			if (c >= 'A' && c <= 'Z') {
				letras[c - 'A'] = true;
			} else if (c >= 'a' && c <= 'z') {
				letras[c - 'a'] = true;
			}
		}
		
		//Bucle para saber si es pangrama
		for (int i = 0; i < 26; i++) {
			if (!letras[i]) return false; //Si falta alguna letra
		}
		return true; //Tiene todas las letras
	}

}
