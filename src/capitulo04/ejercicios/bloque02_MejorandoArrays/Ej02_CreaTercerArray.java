package capitulo04.ejercicios.bloque02_MejorandoArrays;

import java.util.Random;

public class Ej02_CreaTercerArray {

	public static void main(String[] args) {
		Random random = new Random();
		int[] array1 = new int[150];
		int[] array2 = new int[150];
		
		//Inicializamos arrays entre 0 y 100
		for (int i = 0; i < array1.length; i++) {
			array1[i] = random.nextInt(101);
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = random.nextInt(101);
		}
		
		//Mostramos los arrays
		System.out.println("Array 1: ");
		mostrarArray(array1);
		
		System.out.println("\nArray 2: ");
		mostrarArray(array2);
		
		int[] array3 = creaTercerArray(array1, array2);
		
		System.out.println("\nArray 3: ");
		mostrarArray(array3);
		
		

	}
	
	//Método para mostrar array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Método para crear tercer array
	public static int[] creaTercerArray(int a1[], int a2[]) {
		int[] a3 = new int[a1.length];
		
		for (int i = 0; i < a3.length; i++) {
			if (i % 2 == 0) {
				a3[i] = a2[i]; //Indices pares del segundo array
			} else {
				a3[i] = a1[i]; //Indices impares del primer array
			}
		}
		return a3;
	}

}
