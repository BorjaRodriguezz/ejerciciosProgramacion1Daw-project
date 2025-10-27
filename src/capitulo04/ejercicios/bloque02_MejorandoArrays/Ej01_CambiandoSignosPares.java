package capitulo04.ejercicios.bloque02_MejorandoArrays;

import java.util.Random;

public class Ej01_CambiandoSignosPares {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numeros = new int[150];
		
		//Inicializamos array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(201) - 100; //Genera números entre -100 y 100
		}
		
		System.out.println("Array original: ");
		mostrarArray(numeros);
		
		//Método de los signos para los pares
		cambiarSignoPares(numeros);
		
		System.out.println("\nArray después de cambiar el signo de los pares: ");
		mostrarArray(numeros);
	}
	
	//Método para cambiar signo pares
	public static void cambiarSignoPares(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = -array[i];
			}
		}
	}
	
	//Método mostrar Array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
