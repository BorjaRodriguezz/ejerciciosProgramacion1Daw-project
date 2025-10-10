package capitulo02.ejercicios.bloque01_PrimerosCondicionales;

import java.util.Scanner;

public class MostrarMayorVariableDe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 >= n2) {
			System.out.println("El mayor es: " + n1);
		}
		else {
				System.out.println("El mayor es " + n2);
		}
		sc.close();
	}
		
}
