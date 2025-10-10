package capitulo03.ejercicios.bloque04_BucleWhileDoWhile;

import java.util.Scanner;

public class Ej01NumeroPrimoCompuesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		int numero;
		int divisor = 2;
		boolean esPrimo = true;
		
		System.out.println("Introduce un numero: ");
		numero = sc.nextInt();
		
		if (numero <= 1) {
			esPrimo = false;
		} else {
			while (divisor <= numero / 2) {
				if (numero % divisor == 0) {
					esPrimo = false;
					break;
				}
				divisor++;
			}
		}
		
		if (esPrimo) {
			System.out.println(numero + " es un numero primo.");
		} else {
			System.out.println(numero + " es un numero compuesto.");
		}
		
		sc.close();

	}

}
