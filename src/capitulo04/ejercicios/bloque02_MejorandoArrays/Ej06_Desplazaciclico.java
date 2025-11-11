package capitulo04.ejercicios.bloque02_MejorandoArrays;

import java.util.Random;
import java.util.Scanner;

public class Ej06_Desplazaciclico {

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
		
		System.out.println("\nDireccion que desea desplazar el array: ");
		System.out.println("1. Derecha");
		System.out.println("2. Izquierda");
		int direccion = sc.nextInt();
		
		desplazaCiclico(numeros, posiciones, direccion);
		
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
    public static void desplazaCiclico(int a[], int posiciones, int direccion){
    	int longitud = a.length;
    	int[] copia = new int[longitud];
    	
    	//Por si es mayor que la longitud
    	posiciones = posiciones % longitud;
    	
    	//Desplazamiento hacia la izquierda
    	if (direccion == 2) {
    		posiciones = longitud - posiciones;
    	}
    	
    	//Desplazamiento hacia la derecha
    	if (direccion ==  1) {
    		for (int i = 0; i < longitud; i++) {
    		copia[(i + posiciones) % longitud] = a[i];
    		}
    	} else {
    		System.out.println("\nValor no válido.");
    	}
    	
    	//Copiamos al array original
    	for (int i = 0; i  < longitud; i++) {
    		a[i] = copia[i];
    	}
    	
	}


}
