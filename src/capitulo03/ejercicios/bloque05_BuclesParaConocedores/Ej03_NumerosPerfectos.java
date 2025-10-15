package capitulo03.ejercicios.bloque05_BuclesParaConocedores;

import java.util.Scanner;

public class Ej03_NumerosPerfectos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		
		System.out.println("\nNÚMEROS PERFECTOS");
		
		//SOLICTUD DE NUMEROS
		System.out.println("Introduce el límite inferior: ");
		int limiteInf = sc.nextInt();
		
		System.out.println("Introduce el límite superior: ");
		int limiteSup = sc.nextInt();
		
		System.out.println("\nLos número perfectos entre " + limiteInf + " y " + limiteSup + " son: ");
		
		//BUCLE
		for (int numero = limiteInf; numero <= limiteSup; numero++) {
			int sumaDivisores = 0;
			
			if (numero > 1)  {
				for (int divisor = 1; divisor < numero; divisor++) {
					if (numero % divisor == 0) {
						sumaDivisores += divisor;
					}
				}
				if (sumaDivisores == numero) {
					System.out.println("\n--> " + numero);
				}
			}
		}
		
		
		
		sc.close();

	}

}
