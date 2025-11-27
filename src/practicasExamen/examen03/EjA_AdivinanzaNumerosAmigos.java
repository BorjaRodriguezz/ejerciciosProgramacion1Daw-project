package practicasExamen.examen03;

import java.util.Scanner;

public class EjA_AdivinanzaNumerosAmigos {

	public static void main(String[] args) {
		/* 
		Dos números ‘a’ y ‘b’ se llaman
		"números amigables" si la suma de los divisores propios de ‘a’ (excluyendo a ‘a’ mismo) es igual a ‘b’ y la
		suma de los divisores propios de ‘b’ es igual a ‘a’. Escribe un programa que reciba un número entero y
		encuentre el número amigable de menor valor mayor que él, si existe. El par más pequeño de números
		amigos es (220, 284), y son amigos porque los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44,
		55 y 110, de los cuales la suma es 284; y los divisores propios de 284 son 1, 2, 4, 71 y 142, de los cuales
		la suma es 220
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos un número al usuario
		System.out.println("Introduce un número (entero):");
		int a = sc.nextInt();
		
		// Aplicamos el método
		int amigable = esAmigable(a);
		
		if (amigable == -1) {
			System.out.println("No existe amigable para ese número.");
		} else {
			System.out.println("El numero amigable mas cercano es: " + amigable);
		}
		
		
		sc.close();
	}
	
	// Método para sumar divisores de un número (sin él mismo).
	public static int sumaDivisores(int num) {
		int sumaDiv = 0;
		
		// Bucle que saca divisores de num y los suma
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sumaDiv += i;
			}
		}
		return sumaDiv;
	}
	
	// Método para encontrar el numero amigable mayor al pedido.
	public static int esAmigable(int num) {
		int b = sumaDivisores(num);
		
		// Si b es menor que el numero no puede ser el que buscamos.
		if (b <= num) {
			return -1;
		}
		
		// Si coincide la suma con nuestro número es el número que buscamos.
		if (sumaDivisores(b) == num) {
			return b;
		}
		
		return -1; // Si no existe.
	}
	
	

}
