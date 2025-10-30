package capitulo04.ejercicios.bloque04_ArraysDeCaracteresString;

import java.util.Scanner;

public class Ej02_ContadorVocalConsonante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de caracteres
		System.out.println("Introduce caracteres: ");
		String str = sc.nextLine();
		
		contVocales(str);
		
		sc.close();
	}
	
	//Método para contar vocales
	public static void contVocales (String cadena) {
		int vocales = 0;
		int consonantes = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			int codigo = (int) cadena.charAt(i);
			if(codigo >= 65 && codigo <= 122) {
				if(codigo == 65 || codigo == 69 || codigo == 73 || codigo == 79 || codigo == 85 || codigo == 97 || codigo == 101 || codigo == 105 || codigo == 111 || codigo == 117) {
					vocales++;
				} else {
					consonantes++;
				}
			}
		}
		
		System.out.println("Número de vocales: " + vocales);
		System.out.println("Número de vocales: " + consonantes);
	}
}
