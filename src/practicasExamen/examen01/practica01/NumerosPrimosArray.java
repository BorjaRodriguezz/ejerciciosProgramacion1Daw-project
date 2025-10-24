package practicasExamen.examen01.practica01;

import java.util.Random;

public class NumerosPrimosArray {

	private static boolean esPrimo(int numero) {
        // 0 y 1 no son primos
        if (numero <= 1) {
            return false;
        }
        
        // El 2 es el único primo par
        if (numero == 2) {
            return true;
        }
        
        // Los pares mayores que 2 no son primos
        if (numero % 2 == 0) {
            return false;
        }

        // Bucle for: Comprobamos la divisibilidad solo con impares, desde 3 
        // hasta la raíz cuadrada del número para optimizar
        for (int i = 3; i * i <= numero; i += 2) {
            // Si el número es divisible por 'i', no es primo
            if (numero % i == 0) {
                return false;
            }
        }
        
        // Si el bucle termina sin encontrar divisores, es primo
        return true;
    }

    public static void main(String[] args) {
        // Constante para el tamaño del array
        final int TAMANO_ARRAY = 100;
        // Creamos el array de enteros
        int[] numerosAleatorios = new int[TAMANO_ARRAY];
        // Objeto Random para generar números al azar
        Random random = new Random();
        
        // Bucle for para llenar el array con 100 números aleatorios entre 0 y 100
        for (int i = 0; i < TAMANO_ARRAY; i++) {
            // Generamos un número entre 0 (incluido) y 101 (excluido), dando 0-100
            numerosAleatorios[i] = random.nextInt(101);
        }

        // Variable para contar la cantidad de números primos
        int contadorPrimos = 0;
        
        System.out.println("Array generado (valores entre 0 y 100):");
        // Bucle for-each para mostrar el array (opcional, para visualización)
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println("\n" + "-".repeat(50));
        
        System.out.println("Números primos encontrados en el array:");
        
        // Bucle for: Iteramos sobre el array completo para comprobar cada elemento
        for (int i = 0; i < TAMANO_ARRAY; i++) {
            // Obtenemos el número actual
            int num = numerosAleatorios[i];
            
            // Llamamos a la función auxiliar para determinar si es primo
            if (esPrimo(num)) {
                // Si es primo, lo mostramos
                System.out.print(num + " ");
                // Incrementamos el contador
                contadorPrimos++;
            }
        }
        
        // Mostramos el resultado final
        System.out.println("\n" + "-".repeat(50));
        System.out.println("Cantidad total de números primos encontrados (contando duplicados): " + contadorPrimos);
    }

}
