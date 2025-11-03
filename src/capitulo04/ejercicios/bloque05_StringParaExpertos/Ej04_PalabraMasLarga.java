package capitulo04.ejercicios.bloque05_StringParaExpertos;

import java.util.Scanner;

public class Ej04_PalabraMasLarga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto
		System.out.println("Introduce texto: ");
		String str = sc.nextLine();
		
		//Aplicaamos el método
		String palMasLarga = palabraMasLarga(str);
		
		//Resultado
		System.out.println("\nLa palabra mas larga es: " + palMasLarga);

		sc.close();
	}
	
	//Método para encontra la palabra mas larga
	public static String palabraMasLarga(String cadena) {
		String palabra = "";
		String palabraLarga = "";
		
		//Bucle para comparar las palbras
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			
			if (c != ' ') {
				palabra += c;
			} else {
				if (palabra.length() > palabraLarga.length()) {
					palabraLarga = palabra;
				}
				palabra = ""; //Reiniciamos la palabra
			}
			//En caso de no terminar en espacio
			if (palabra.length() > palabraLarga.length()) palabraLarga = palabra;
		}
		return palabraLarga;
	}
}
