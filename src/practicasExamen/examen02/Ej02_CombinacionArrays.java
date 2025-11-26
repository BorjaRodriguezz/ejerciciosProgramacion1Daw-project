package practicasExamen.examen02;

import java.util.Scanner;

public class Ej02_CombinacionArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto
		System.out.println("Introduce texto: ");
		String str1 = sc.nextLine();
		
		System.out.println("Introduce texto: ");
		String str2 = sc.nextLine();
		
		//Aplicamos métodos
		String resultado = combinaStrings(str1, str2);
		resultado = cambiaMayusMinus(resultado);
		System.out.println("Combinación de caracteres: " + resultado);
		
		sc.close();
	}
	
	//Método que combina arrays de manera alterna
	public static String combinaStrings (String cad1, String cad2) {
		String resultado = "";
		int longitud = 0;
		if (cad1.length() >= cad2.length()) {
			longitud = cad1.length();
		} else {
			longitud = cad2.length();
		}
		
		for (int i = 0; i < longitud; i++) {
			char c1 = ' ';
			char c2 = ' ';
			
			if (i < cad1.length()) c1 = cad1.charAt(i);
			if (i < cad2.length()) c2 = cad2.charAt(i);
			
			if (i % 2 == 0) {
				resultado += c1;
			} else {
				resultado += c2;
			} 
		}
		return resultado;
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
