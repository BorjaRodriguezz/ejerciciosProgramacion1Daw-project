package capitulo03.ejercicios.bloque05_BuclesParaConocedores;

import java.util.Scanner;

public class Ej04_JuegoNumeroAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		int numSecreto = (int) (Math.random() * 100) + 1;
		int intento = 0;
		int contadorIntentos = 0;
		
		
		//INFO JUEGO
		System.out.println("---JUEGO: ADIVINA EL NÚMERO.---");
		System.out.println("Debes elegir un número entre el 1 y el 100 y yo te daré pistas para acercarte a el.");
		
		//BUCLE
		do {
			System.out.println("Introduce un número: ");
			if (sc.hasNextInt()) {
				intento = sc.nextInt();
				contadorIntentos++;
			}
			
			if (intento < numSecreto) {
				System.out.println("Su número es menor, prueba uno más alto.");
			} else if (intento > numSecreto) {
				System.out.println("Su numero es mayor, prueba uno más bajo.");
			} else {
				System.out.println("\nFELICIDADES, adivinaste el número.");
				System.out.println("El número secreto era: " + numSecreto);
				System.out.println("Intentos: " + contadorIntentos);
			}
		} while (intento != numSecreto);
		
		sc.close();

	}

}
