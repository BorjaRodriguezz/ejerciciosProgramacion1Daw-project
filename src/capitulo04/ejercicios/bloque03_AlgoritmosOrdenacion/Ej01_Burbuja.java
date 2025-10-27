package capitulo04.ejercicios.bloque03_AlgoritmosOrdenacion;

import java.util.Random;

public class Ej01_Burbuja {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numeros = new int[150];
		
		//Inicializamos array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(1001);
		}
		
		//Mostramos array
		System.out.println("Array original: ");
		mostrarArray(numeros);
		
		//Ordenamos con burbuja
		ordBurbuja(numeros);
		
		System.out.println("\nArray ordenada: ");
		mostrarArray(numeros);

	}
	
	//Método para mostrar array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Método para ordenar en burbuja
	public static void ordBurbuja(int[] a) {
		int n = a.length;
		boolean intercambio;
		
		//bucle para ordenar el array
		for (int i = 0; i < n - 1; i++) {
			intercambio = false;
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					intercambio = true;
				}
			}
			if (!intercambio) {
				break;
			}
		}
	}

}
