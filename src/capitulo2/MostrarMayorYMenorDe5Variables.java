package capitulo2;

import java.util.Scanner;

public class MostrarMayorYMenorDe5Variables {

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
		
		//Creamos la variable menor para ir cambiando al numero menor que pide
		
		int menor = n1;
				
		if (n2 <= menor) {
			menor = n2;
				}
		if (n3 <= menor) {
			menor = n3;
				}
		if (n4 <= menor) {
			menor = n4;
				}
		if (n5 <= menor) {
			menor = n5;
				}
		
		//Mostramos el numero mayor
		
		System.out.println("El mayor es: " + mayor);
		
		//Mostramos el numero menor
		
		System.out.println("El menor es: " + menor);
		
		sc.close();

	}

}
