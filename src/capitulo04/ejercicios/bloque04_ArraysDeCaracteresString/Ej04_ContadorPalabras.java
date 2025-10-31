package capitulo04.ejercicios.bloque04_ArraysDeCaracteresString;

import java.util.Scanner;

public class Ej04_ContadorPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto
		System.out.println("Introduce texto: ");
		String str = sc.nextLine();
		
		int palabra = contPalabras(str);
		
		System.out.println("\nCantidad de palabras: " + palabra);
		
		sc.close();
	}
	
	//Método para contar palabras
	public static int contPalabras(String cadena) {
		int contador = 0;
		boolean palabra = false;
		
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i); //Obtenemos cada carácter
			
			//Bucle para que detecte solo las letras
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				//Si hay letras hay palabra
				if (!palabra) {
					contador++;
					palabra = true;
				}
			} else {
				//Si no hay letras no hay palabra y vuelve a buscar
				palabra = false;
			}
		}
		
		return contador;
	}

}
