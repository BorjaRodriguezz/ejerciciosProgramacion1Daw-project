package Bloque04_BucleWhileDoWhile;

import java.util.Scanner;

public class Ej02PrimoEntre2Numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		int numero;
		int limiteInferior;
		int limiteSuperior;
		int divisor;
		
		boolean esPrimo;
		
		//SOLICITO NUMEROS
		
		System.out.println("\nIntroduce el limite inferior: ");
		limiteInferior = sc.nextInt();
		
		System.out.println("\nIntroduce el limite superior: ");
		limiteSuperior = sc.nextInt();
		
		numero = limiteInferior;
		
		//BUCLE WHILE
		
		while (numero <= limiteSuperior) {
			if (numero <= 1) {
				esPrimo = false;
			} else {
				esPrimo = true;
				divisor = 2;
				
				while (divisor <= numero / 2) {
					if (numero % divisor == 0) {
						esPrimo = false;
						break;
					}
					divisor++;
				}
			}
			
			if (esPrimo) {
				System.out.println(numero + " es primo.");
			} else {
				System.out.println(numero + " es compuesto.");
			}
			
			numero++;
		}
		
		sc.close();

	}

}
