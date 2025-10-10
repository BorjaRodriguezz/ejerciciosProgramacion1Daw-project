package capitulo02.ejercicios.bloque01_PrimerosCondicionales;

import java.util.Scanner;

public class MostrarMayorDe5Variables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pedimos 5 numeros al ususario
		
		System.out.println("Introduzca cinco numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		//Creamos la variable mayor para ir cambiando al numero mayor que pide
		
		int mayor = n1;
		
		if (n2 >= mayor) {
			mayor = n2;
		}
		if (n3 >= mayor) {
			mayor = n3;
		}
		if (n4 >= mayor) {
			mayor = n4;
		}
		if (n5 >= mayor) {
			mayor = n5;
		}
		
		//Mostramos el numero mayor
		
		System.out.println("El mayor es: " + mayor);
		
		sc.close();
	}

}
