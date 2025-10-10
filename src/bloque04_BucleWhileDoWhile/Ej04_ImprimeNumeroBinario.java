package bloque04_BucleWhileDoWhile;

import java.util.Scanner;

public class Ej04_ImprimeNumeroBinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nIntroduce un numero: ");
		int numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.println("\nEl numero en binario es: 0");
		} else {
			String binario = "";
			
			while (numero > 0) {
				int resto = numero % 2;
				binario = resto + binario;
				numero = numero / 2;
			}
			
			System.out.println("\nEl numero en binario es: " + binario);
		}
		
		sc.close();

	}

}
