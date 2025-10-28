package capitulo04.ejercicios.bloque03_AlgoritmosOrdenacion;

import java.util.Random;

public class Ej03_OrdenaShell {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numeros = new int[150];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(1001);
		}
		
		//Muestro array original
		System.out.println("Arrya original: ");
		mostrarArray(numeros);
		
		//Ordenamos el array
		ordShell(numeros);
		
		//Mostramos el resultado
		System.out.println("\nArray ordenado en shell: ");
		mostrarArray(numeros);
	}
	
	//Método para mostrar array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Método ordena en shell
	public static void ordShell(int[] a) {
		int salto = a.length / 2;
		
		while (salto > 0) {
			for (int i = salto; i < a.length; i++) {
				int temp = a[i];
				int j = i;
				
				//Desplazamiento mientras sean mayores
				while (j >= salto && a[j - salto] > temp) {
					a[j] = a[j - salto];
					j -= salto;
				}
				//Ponemos el número en posicion correcta
				a[j] = temp;
			}
			//Pasamos el salto a la mitad
			salto = salto / 2;
		}
	}
}
