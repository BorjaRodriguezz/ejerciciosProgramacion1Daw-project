package capitulo04.ejercicios.bloque01_PrimerosArrays;

import java.util.Random;

public class Ej06_SumaIndicePar {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numeros = new int[150];

        // Iniciamos el array con números aleatorios entre 0 y 100
        int i = 0;
        while (i < numeros.length) {
            numeros[i] = random.nextInt(100);
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

        // Suma de los elementos con índice par
        int sumaIndicesPares = 0;
        i = 0;
        while (i < numeros.length) {
            if (i % 2 == 0) { // índice par
                sumaIndicesPares += numeros[i];
            }
            i++;
        }

        // Resultado
        System.out.println("La suma de los elementos con índice par es: " + sumaIndicesPares);

	}

}
