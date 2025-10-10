package bloque04_BucleWhileDoWhile;

import java.util.Scanner;

public class Ej05_FactorialDeNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nIntroduce un numero: ");
		int numero = sc.nextInt();
		
		int factorial = 1;
		int contador = 1;
		
		while (contador <= numero) {
			factorial = factorial * contador;
			contador++;
		}
		
		System.out.println("\nEl factorial de " + numero + " es: " + factorial);
		
		sc.close();

	}

}
