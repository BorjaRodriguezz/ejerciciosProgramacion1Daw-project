package capitulo04.ejercicios.bloque01_PrimerosArrays;

import java.util.Random;

public class Ej01_150ElementosAzar {

	public static void main(String[] args) {
		Random random = new Random();
		
		//Array
		int[] numeros = new int[150];
		
		//Variables
		int suma = 0;
		int menor = 100;
		int mayor = 0;
		
		//Bucle para lista de numeros
		int i = 0;
		while (i < numeros.length) {
			numeros[i] = random.nextInt(100);
			suma += numeros[i];
			
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			i++;
		}
		
		//Muestra
		System.out.println("Números generados: ");
		i = 0;
		while (i < numeros.length) {
			System.out.print(numeros[i] + " ");
			i++;
		}
		
		double media = (double) suma / numeros.length;
		
		//Resultados
		System.out.println("\nRESULTADOS");
		System.out.println("Suma total: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Número menor: " + menor);
		System.out.println("Número mayor: " + mayor);
	}

}
