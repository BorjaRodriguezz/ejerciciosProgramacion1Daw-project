package capitulo04.ejercicios.bloque05_StringParaExpertos;

import java.util.Scanner;

public class Ej03_ContarOcurrencias {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto y ocurrencia
		System.out.println("Introduce texto: ");
		String str = sc.nextLine();
		System.out.println("Cadena que quiere contar: ");
		String subcadena = sc.nextLine();
		
		//Aplicamos el método
		int contador = contarOcurrencias(str, subcadena);
		
		//Resultado
		System.out.println("\nVeces que se repite la ocurrencia: " + contador);
		
		sc.close();
	}
	
	//Método para contar ocurrencias
	public static int contarOcurrencias(String cadena, String subcadena) {
		int ocurrencias = 0;
		int longitudTexto = cadena.length();
		int longitudSub = subcadena.length();
		
		//Bucle con cadena y sub cadena para comparar
		for (int i = 0; i <= longitudTexto - longitudSub; i++) {
			boolean coincide = true;
			
			//Bucle para saber si la subcadena coincide 
			for (int j = 0; j < longitudSub; j++) {
				if (cadena.charAt(i + j) != subcadena.charAt(j)) {
					coincide = false; //Si no coincide rompemos el bucle
					break;
				}
			}
			//En caso de coincidir aumentamos el contador
			if (coincide) ocurrencias++;
		}
		return ocurrencias;
	}

}
