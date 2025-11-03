package capitulo04.ejercicios.bloque05_StringParaExpertos;

import java.util.Scanner;

public class Ej05_InvertirPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto
		System.out.println("Introduce texto: ");
		String str = sc.nextLine();
		
		//Aplicamos el método
		String inverso = invertirPalabras(str);
		
		//Resultado
		System.out.println("\nTexto palabras invertidas: " + inverso);
		
		sc.close();
	}
	
	//Metodo para invertir palabras de texto
	public static String invertirPalabras(String cadena) {
		String resultado = "";
		String palabra = "";
		
		//Bucle para invertir cada palabra
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			
			if (c != ' ') {
				palabra += c;
			} else {
				resultado += invertirPalabra(palabra) + " ";
				palabra = "";
			}
		}
		resultado += invertirPalabra(palabra);
		return resultado;
	}
	
	//Método para invertir cada palabra
	public static String invertirPalabra(String cadena) {
		String resultado = "";
		
		//Bucle para invertir cada palabra
		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}
		return resultado;
	}
}
