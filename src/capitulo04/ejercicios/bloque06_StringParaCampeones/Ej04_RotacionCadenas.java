package capitulo04.ejercicios.bloque06_StringParaCampeones;

import java.util.Scanner;

public class Ej04_RotacionCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Solicitud de cadenas
		System.out.println("Introduce cadena 1: ");
		String cad1 = sc.nextLine();
		
		System.out.println("Introduce cadena 2: ");
		String cad2 = sc.nextLine();
		
		//Pasamos todo a minúscula para evitar errores
		String c1 = cambiaMayusMinus(cad1);
		String c2 = cambiaMayusMinus(cad2);
		
		//Aplicamos método
		boolean resultado = esRotativa(c1, c2);
		
		//Resultado
		if (resultado) {
			System.out.println("\nLas cadenas son rotativas.");
		} else {
			System.out.println("\nLas cadenas no son rotativas.");
		}
		
		sc.close();
	}
	
	//Método para saber si dos cadenas son rotativas entre sí
	public static boolean esRotativa(String cad1, String cad2) {
		//Si no miden lo mismo ya no pueden ser iguales
		if(cad1.length() != cad2.length()) return false;
		
		//Cadena nueva para comprobar si son rotativas
		String nueva = cad1 + cad1;
		
		//Usamos indexof par ver si cad2 esta dentro de cad1+cad1
		return nueva.indexOf(cad2) != -1;
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
