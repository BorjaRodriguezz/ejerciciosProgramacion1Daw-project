package capitulo04.ejercicios.bloque03_AlgoritmosOrdenacion;

import java.util.Random;

public class Ej02_InserccionDirecta {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numeros = new int[150];
		
		//Inicializamos array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(1001);
		}
		
		//Mostramos array original
		System.out.println("Array original: ");
		mostrarArray(numeros);
		
		//Ordenamos por insercción directa
		insercciondirecta(numeros);
		
		//Mostramos el resultado final
		System.out.println("\nArray ordenado: ");
		mostrarArray(numeros);
		

	}
	
	//Método para mostrar array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Método de insercción directa
	public static void insercciondirecta(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int actual = a[i];
			int j = i - 1;
			
			//Desplaza a la derecha los números mayores al actual
			while (j >= 0 && a[j] > actual) {
				a[j + 1] = a[j];
				j--;
			}
			
			//Ponemos el número en su posicion
			a[j + 1] = actual;
		}
		
	}

}
