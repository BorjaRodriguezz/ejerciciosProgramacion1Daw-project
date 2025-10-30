package capitulo04.ejercicios.bloque02_MejorandoArrays;

import java.util.Random;
import java.util.Scanner;

public class Ej03_MultiplicaValoresPorFactor {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[150];
		
		//Inicializamos array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(101);
		}
		
		//Mostramos arrays
		System.out.println("Array original: ");
		mostrarArray(numeros);
		
		//Solitud de número
		System.out.println("\nVamos a generar un array. Introdduce el número para multiplicarla: ");
		int factor = sc.nextInt();
		
		//Array multiplicado
		System.out.println("\nArray multiplicado: ");
		multiplicaValoresPorFactor(numeros, factor);
		mostrarArray(numeros);
		
		sc.close();
	}
	
	//Método para mostrar array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Método para multiplicar valores por factor
	public static void multiplicaValoresPorFactor(int a[], int factor) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * factor;
		}
	}

}
