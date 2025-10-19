package capitulo04.ejercicios.bloque01_PrimerosArrays;

import java.util.Random;

public class Ej05_150ElementosAzarParesImpares {
	
	public static void main(String[] args) {
		Random random = new Random();
		
        int[] numeros = new int[150];
        
        
        // Iniciamos el array con valores aleatorios entre 0 y 100
        int i = 0;
        while (i < numeros.length) {
            numeros[i] = random.nextInt(101); // genera entre 0 y 100
            i++;
        }
        
        // Mostramos el array
        System.out.println("Array generado:");
        i = 0;
        while (i < numeros.length) {
            System.out.print(numeros[i] + " ");
            i++;
        }
        System.out.println("\n");
        
        // Suma de pares e impares
        int sumaPares = 0;
        int sumaImpares = 0;
        i = 0;
        while (i < numeros.length) {
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
            i++;
        }
        
        // Resultados
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
    }
}
