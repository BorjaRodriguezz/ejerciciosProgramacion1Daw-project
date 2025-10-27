package capitulo04.ejercicios.bloque02_MejorandoArrays;

import java.util.Random;

public class Ej04_DesplazaCiclicoDerecha {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numeros = new int[5];
		
		//Inicializamos array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(101);
		}
		
		//Mostramos array original y el resultado de desplazarlo
		System.out.println("Array original: ");
		mostrarArray(numeros);
		
		desplazaCiclicoDerecha(numeros);
		
		System.out.println("\nArray deesplazado a la derecha: ");
		mostrarArray(numeros);
		

	}
	
	// Muestra el contenido de un array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    //Método para desplazar a la derecha el array
    public static void desplazaCiclicoDerecha(int a[]){
    	int ultimo = a[a.length - 1];
    	
    	for (int i = a.length - 1; i > 0; i--) {
    		a[i] = a[i - 1];
    	}
    	
    	a[0] = ultimo;
    }
    

}
