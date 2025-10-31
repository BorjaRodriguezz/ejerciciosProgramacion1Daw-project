package capitulo04.ejercicios.bloque04_ArraysDeCaracteresString;

import java.util.Scanner;

public class Ej05_Compara2Palabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---COMPARA PALABRAS---");
		System.out.println("\nSi la primera palabra es menor sale -1");
		System.out.println("Si la primera palabra es mayor sale 1");
		System.out.println("Si las palabras son iguales sale 0");
		
		//Solicitud de texto
		System.out.println("\nIntroduce palabra 1: ");
		String str1 = sc.nextLine();
		
		System.out.println("Introduce palabra 2: ");
		String str2 = sc.nextLine();
		
		//Aplicamos método
		int comparacion = comparaPalabras(str1, str2);
		
		System.out.println("\nRESULTADO: " + comparacion);
		
		sc.close();
	}
	
	//Método para comparar 2 palabras
	public static int comparaPalabras(String cad1, String cad2) {
		int i = 0;
		
		//Bucle para comparar las palabras
		while (i < cad1.length() && i < cad2.length()) {
			char p1 = cad1.charAt(i);
			char p2 = cad2.charAt(i);
			
			//Los cambiamos a minúscula para comparar mas facil
			if (p1 >= 'A' && p1 <= 'Z') p1 += 32;
			if (p2 >= 'A' && p2 <= 'Z') p2 += 32;
			
			//Si p1 es menor muestra -1 y si es mayor muestra 1
			if (p1 < p2) {
				return -1;
			} else  if (p2 < p1) {
				return 1;
			}
		}
		//Comparamos por tamaño de palabra
		if (cad1.length() < cad2.length()) {
			return -1;
		} else if (cad2.length() < cad2.length()) {
			return 1;
		}
		
		//Si son iguales muestra 0
		return 0;
	}

}
