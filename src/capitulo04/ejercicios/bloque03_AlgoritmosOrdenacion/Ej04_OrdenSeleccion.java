package capitulo04.ejercicios.bloque03_AlgoritmosOrdenacion;

import java.util.Random;

public class Ej04_OrdenSeleccion {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numeros = new int[150];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(1001);
		}
		
		//Mostramos array original
		System.out.println("Array original: ");
		mostrarArray(numeros);
		
		//Ordenamos por selección
		ordSeleccion(numeros);
		
		//Mostramos el resultado
		System.out.println("\nArray ordenado por selección: ");
		mostrarArray(numeros);

	}
	
	//Método para mostrar array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Método para ordenar por seleccion
	public static void ordSeleccion(int a[]) {
		int n = a.length;
		
		for (int i = 0; i < n - 1; i++) {
			int indiceMinimo = i;
			
			//Buscamos el valor mas bajo del array
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[indiceMinimo]) {
					indiceMinimo = j;
				}
			}
			
			//Ponemos el numero en su orden del array
			int temp = a[i];
			a[i] = a[indiceMinimo];
			a[indiceMinimo] = temp;
		}
	}
		

}
