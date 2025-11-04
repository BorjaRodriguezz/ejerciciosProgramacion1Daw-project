package capitulo04.ejercicios.bloque06_StringParaCampeones;

import java.util.Scanner;

public class Ej01_EliminarCaracteresRepetidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto
		System.out.println("Introduce texto: ");
		String str = sc.nextLine();
		
		//Aplicamos método
		String eliminaDuplicados = eliminaCarRepetidos(str);
		
		//Resultado
		System.out.println("\nTexto sin duplicados: " + eliminaDuplicados);
		
		sc.close();
	}
	
	//Método para eliminar caracteres duplicados
	public static String eliminaCarRepetidos(String cadena) {
		String resultado = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			boolean repetido = false;
			
			//Bucle para comprobar los caracteres
			for (int j = 0; j < resultado.length(); j++) {
				if (resultado.charAt(j) == c) {
					repetido = true;
					break;
				}
			}
			if (!repetido) resultado += c;
		}
		return resultado;
	}
}
