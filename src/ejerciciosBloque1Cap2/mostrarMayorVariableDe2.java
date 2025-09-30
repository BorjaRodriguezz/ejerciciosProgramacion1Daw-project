package ejerciciosBloque1Cap2;

import java.util.Scanner;

public class mostrarMayorVariableDe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 >= n2) {
			System.out.println("El mayor es: " + n1);
		}
		else {
			if (n2 >= n1) {
				System.out.println("El mayor es " + n2);
			}
		}
	}
		
}
