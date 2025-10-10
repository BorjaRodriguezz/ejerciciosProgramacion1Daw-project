package bloque03_PerfeccionandoCondicionales;

import java.util.Scanner;

public class Ej02CalculadoraAvanzada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		//Menu de calculadora
		
		System.out.println("\n=== CALCULADORA AVANZADA ===");
		System.out.println("\n1. Raiz cuadrada");
		System.out.println("2. Potencia");
		System.out.println("3. Modulo de la division");
		System.out.println("4. Salir");
		System.out.println("\nElige una opcion: ");
		opcion = sc.nextInt();
		
		switch (opcion) {
			//Raiz Cuadrada
			case 1: 
				System.out.println("Introduce un numero");
				double numRaiz = sc.nextDouble();
				if (numRaiz < 0) {
					System.out.println("No se puede calcular la raiz de un numero negativo");
				} else {
					System.out.println("La raiz cuadrada de " + numRaiz + " es " + Math.sqrt(numRaiz));
				}
				break;
			
			//Potencia
			case 2:
				System.out.println("Introduce la base: ");
				double base = sc.nextDouble();
				System.out.println("Introduce el exponente: ");
				double exponente = sc.nextDouble();
				System.out.println(base + " elevado a " + exponente + " = " + Math.pow(base, exponente));
				break;
			
			//Modulo de la division
			case 3:
				System.out.println("Introduce el dividendo: ");
				int dividendo = sc.nextInt();
				System.out.println("Introduce el divisor: ");
				int divisor = sc.nextInt();
				if (divisor == 0) {
					System.out.println("No se puede dividir por cero.");
				} else {
					System.out.println("El modulo de la divisiom " + dividendo + " % " + divisor + " = " + (dividendo % divisor));
					break;
				}
			
			//Salir
			case 4:
				System.out.println("Saliendo de la calculadora...");
				break;
				
			default:
				System.out.println("Opcion no valida.");
		}
		
		sc.close();

	}

}
