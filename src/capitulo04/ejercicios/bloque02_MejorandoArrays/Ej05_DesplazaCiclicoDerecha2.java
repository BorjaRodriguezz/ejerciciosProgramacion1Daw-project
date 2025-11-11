package capitulo04.ejercicios.bloque02_MejorandoArrays;

import java.util.Random;
import java.util.Scanner;

public class Ej05_DesplazaCiclicoDerecha2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		
		//Inicializamos array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(101);
		}
		
		//Mostramos array original, solicitamos desplazamiento y mostramos el resultado de desplazarlo
		System.out.println("Array original: ");
		mostrarArray(numeros);
		
		System.out.println("\nPosiciones que desea desplazar el array: ");
		int posiciones = sc.nextInt();
		
		desplazaCiclicoDerecha(numeros, posiciones);
		
		System.out.println("\nArray deesplazado a la derecha: ");
		mostrarArray(numeros);
		
		sc.close();
	}
	
	// Muestra el contenido de un array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    //Método para desplazar a la derecha el array
    public static void desplazaCiclicoDerecha(int a[], int posiciones){
    	int n = a.length;
    	posiciones = posiciones % n; //Para no repetir el bucle tanto
    	
    	for (int p = 0; p < posiciones; p++) {
    		int ultimo = a[n - 1];
    		for (int i = n - 1; i > 0; i--) {
    			a[i] = a[i - 1];
    		}
    		a[0] = ultimo;
    	}
    }

}
