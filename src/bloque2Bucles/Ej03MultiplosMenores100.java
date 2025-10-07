package bloque2Bucles;

import java.util.Scanner;

public class Ej03MultiplosMenores100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicito numero
		
		System.out.println("\nMULTIPLOS DE UN NUMERO");
		System.out.println("\nIntroduzca un numero: ");
		int numero = sc.nextInt();
		
		//Resultado (no igualo a 100 porque dice menor que 100 entonces este no entra)
		
		System.out.println("\nMultiplos de " + numero + " menores que 100");
		
		for (int i = 1; i * numero < 100; i++) {
			System.out.println(numero * i);
		}
		
		sc.close();

	}

}
