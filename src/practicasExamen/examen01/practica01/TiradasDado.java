package practicasExamen.examen01.practica01;

import java.util.Random;
import java.util.Scanner;

public class TiradasDado {

	public static void main(String[] args) {
		// Constante para el número de tiradas
        final int NUM_TIRADAS = 10;
        // Array para almacenar los resultados de las 10 tiradas
        int[] resultados = new int[NUM_TIRADAS];
        
        // Objetos para la entrada del usuario y la generación aleatoria
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Bucle for para simular y almacenar las 10 tiradas del dado
        System.out.println("Simulando " + NUM_TIRADAS + " tiradas de un dado (1-6)...");
        for (int i = 0; i < NUM_TIRADAS; i++) {
            // Generamos un número entre 1 y 6. random.nextInt(6) da 0-5. Sumamos 1.
            resultados[i] = random.nextInt(6) + 1;
        }
        
        System.out.print("Resultados de las tiradas: ");
        // Bucle for-each para mostrar los resultados del array
        for (int resultado : resultados) {
            System.out.print(resultado + " ");
        }
        System.out.println("\n" + "-".repeat(30));

        // Variable para almacenar el número a buscar
        int numeroBuscado;
        // Variable booleana para controlar el bucle de validación
        boolean entradaValida = false;

        // Bucle while para pedir y validar la entrada del usuario
        do {
            System.out.print("Introduce el número a contar (entre 1 y 6): ");
            // Pedimos el número al usuario
            if (scanner.hasNextInt()) {
                numeroBuscado = scanner.nextInt();
                
                // Comprobamos si el número está en el rango válido (1 a 6)
                if (numeroBuscado >= 1 && numeroBuscado <= 6) {
                    // Si es válido, salimos del bucle de validación
                    entradaValida = true;
                } else {
                    // Si no es válido, mostramos un error
                    System.out.println("ERROR: El número debe estar entre 1 y 6. Inténtalo de nuevo.");
                }
            } else {
                // Manejo de entrada no entera
                System.out.println("ERROR: Por favor, introduce un número entero.");
                // Limpiamos el buffer del scanner
                scanner.next(); 
                numeroBuscado = -1; // Valor temporal para evitar error de inicialización
            }
        } while (!entradaValida); // El bucle se repite hasta que la entrada sea válida

        // Contador para las ocurrencias del número buscado
        int contadorOcurrencias = 0;

        // Bucle for: recorremos el array para contar las ocurrencias
        for (int resultado : resultados) {
            // Comprobamos si el resultado de la tirada coincide con el número buscado
            if (resultado == numeroBuscado) {
                // Si coincide, incrementamos el contador
                contadorOcurrencias++;
            }
        }

        // Mostramos el resultado final
        System.out.println("\nEl número " + numeroBuscado + " se obtuvo " + contadorOcurrencias + " vez(veces) en 10 tiradas.");

        // Cerramos el scanner
        scanner.close();
	}

}
