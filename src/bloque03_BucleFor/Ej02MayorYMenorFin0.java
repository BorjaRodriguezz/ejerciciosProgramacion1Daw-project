package bloque03_BucleFor;

import java.util.Scanner;

public class Ej02MayorYMenorFin0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int mayor = 0;
		int menor = 0;
		int numero;
		
		boolean primerNumero = true;
		
		System.out.println("Introduce numeros (introduce 0 para terminar): ");
		
		//BUCLE WHILE
		
		for (; true;) {
			numero = sc.nextInt();
			
			if (numero == 0) {
				break;
			}
			
			if (primerNumero) {
				mayor = numero;
				menor = numero;
				primerNumero = false;
			} else {
				if (numero > mayor) {
					mayor = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
		}
		
		if (primerNumero) {
			System.out.println("\nValor no valido.");
		} else {
			System.out.println("\nEl numero mayor es: " + mayor);
			System.out.println("\nEl numero menor es: " + menor);
		}
		
		sc.close();

	}

}
