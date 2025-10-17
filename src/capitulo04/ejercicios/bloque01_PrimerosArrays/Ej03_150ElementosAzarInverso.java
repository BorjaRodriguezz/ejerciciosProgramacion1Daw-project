package capitulo04.ejercicios.bloque01_PrimerosArrays;

import java.util.Random;

public class Ej03_150ElementosAzarInverso {

	public static void main(String[] args) {
		Random random = new Random ();
		
		//Inicio array
		int[] numeros = new int[150];
		
		//Genero array azar
		int i = 0;
		while (i < numeros.length) {
			numeros[i] = random.nextInt(100);
			i++;
		}
		
		//Muestra array original
		System.out.println("\nArray original.");
		i = 0;
		while (i < numeros.length) {
			System.out.print(numeros[i] + " ");
			i++;
		}
		
		//Muestra array inversa
		System.out.println("\nArray inversa.");
		i = numeros.length - 1;
		while (i >= 0) {
			System.out.print(numeros[i] + " ");
			i--;
		}
		
	}

}
