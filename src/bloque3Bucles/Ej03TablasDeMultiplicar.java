package bloque3Bucles;

import java.util.Scanner;

public class Ej03TablasDeMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un numero (0 para salir): ");
		
		//BUCLE
		
		for (; true;) {
			
			numero = sc.nextInt();
			
			if (numero == 0) {
				System.out.println("Programa finalizado.");
				break;
			}
			
			System.out.println("\nTabla del " + numero + ":");
			
			for (int i = 0; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
			
			System.out.println("Introduce un numero (0 para salir): ");
			
		}
		
		sc.close();

	}

}
