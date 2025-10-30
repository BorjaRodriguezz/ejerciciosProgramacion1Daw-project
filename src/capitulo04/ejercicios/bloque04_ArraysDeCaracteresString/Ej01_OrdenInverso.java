package capitulo04.ejercicios.bloque04_ArraysDeCaracteresString;

import java.util.Scanner;

public class Ej01_OrdenInverso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//solicitud de caracteres
		System.out.println("Introduce caracteres: ");
		String str = sc.nextLine();
		
		//Aplicamos el método
		ordStringInverso(str);
		
		sc.close();

	}
	
	//Método para ordenar String inverso
	public static void ordStringInverso(String cadena) {
		String invert = "";
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invert += cadena.charAt(i);
		}
		
		System.out.println("Texto invertido: " + invert);
	}

}
