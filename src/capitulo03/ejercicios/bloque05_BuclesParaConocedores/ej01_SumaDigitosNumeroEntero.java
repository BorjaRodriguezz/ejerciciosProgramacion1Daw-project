package capitulo03.ejercicios.bloque05_BuclesParaConocedores;

import java.util.Scanner;

public class ej01_SumaDigitosNumeroEntero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		int suma = 0;
		int digito;
		
		
		//SOLICITO NUMERO
		System.out.println("\nIntroduce un número: ");
		int numero = sc.nextInt();
		int numOriginal = numero;
		
		//BUCLE WHILE
		while (numero > 0) {
			digito = numero % 10;
			suma = suma + digito;
			numero = numero / 10;
		}
		
		System.out.println("\nLa suma de dígitos del número " + numOriginal + " es: " + suma);
		
		sc.close();

	}

}
