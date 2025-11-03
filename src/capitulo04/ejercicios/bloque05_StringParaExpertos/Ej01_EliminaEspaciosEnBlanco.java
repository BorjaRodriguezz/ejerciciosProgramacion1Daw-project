package capitulo04.ejercicios.bloque05_StringParaExpertos;

import java.util.Scanner;

public class Ej01_EliminaEspaciosEnBlanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto
		System.out.println("Introduce texto: ");
		String str = sc.nextLine();
		
		//Aplicamos método
		String sinEspacios = eliminaEspacios(str);
		
		//Resultado
		System.out.println("\nTexto sin espacios: " + sinEspacios);
		
		sc.close();
	}
	
	//Método para eliminar espacios en blanco
	public static String eliminaEspacios(String cadena) {
		String resultado = "";
		
		//Bucle para eliminar los espacios
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			
			if (c != ' ') {
				resultado = resultado + c;
			}
		}
		
		//Le damos el nuevo valor
		return resultado;
	}
}
