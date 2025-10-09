package bloque3BucleFor;

import java.util.Scanner;

public class Ej04ContadorPositivosNegativosFin0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		int numero;
		int positivos = 0;
		int negativos = 0;
		
		System.out.println("Introduce un numero (0 para salir): ");
		
		for (; true;) {
			numero = sc.nextInt();
			
			if (numero == 0) {
				break;
			}
			if (numero > 0) {
				positivos++;
			}
			if (numero < 0) {
				negativos++;
			}
		}
		
		System.out.println("Cantidad de numeros postivos: " + positivos);
		System.out.println("Cantidad de numeros negativos: " + negativos);
		
		sc.close();

	}

}
