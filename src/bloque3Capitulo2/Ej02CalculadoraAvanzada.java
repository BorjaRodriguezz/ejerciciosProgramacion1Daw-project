package bloque3Capitulo2;

import java.util.Scanner;

public class Ej02CalculadoraAvanzada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		//Menu de calculadora
		
		System.out.println("CALCULADORA AVANZADA");
		System.out.println("1. Raiz cuadrada");
		System.out.println("2. Potencia");
		System.out.println("3. Division");
		System.out.println("4. Salir");
		System.out.println("Elige una opcion: ");
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
				
		}
		
		sc.close();

	}

}
