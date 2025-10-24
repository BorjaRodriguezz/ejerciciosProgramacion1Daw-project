package practicasExamen.examen01.practica01;

import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		// Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Variable para almacenar el número que el usuario ingresa
        int numero;

        // Bucle para pedir la entrada del usuario
        System.out.print("Introduce un número entero positivo para verificar si es perfecto: ");
        numero = scanner.nextInt();

        // Verificamos que el número sea positivo
        if (numero <= 0) {
            System.out.println("Por favor, introduce un número positivo.");
            scanner.close();
            return;
        }

        // Variable para almacenar la suma de los divisores
        int sumaDivisores = 0;

        // Bucle for: iteramos desde 1 hasta el número - 1
        // Los divisores propios son aquellos que son menores que el número
        for (int i = 1; i < numero; i++) {
            // Comprobamos si 'i' es un divisor de 'numero'
            if (numero % i == 0) {
                // Si es un divisor, lo sumamos al acumulador
                sumaDivisores += i;
                // Opcionalmente, mostrar los divisores para depuración
                // System.out.println("Divisor encontrado: " + i); 
            }
        }

        // Comparamos la suma de los divisores con el número original
        System.out.println("Número introducido: " + numero);
        System.out.println("Suma de sus divisores propios: " + sumaDivisores);

        // Estructura de control para determinar si es perfecto o no
        if (sumaDivisores == numero) {
            System.out.println("¡El número " + numero + " ES PERFECTO! 🎉");
        } else {
            System.out.println("El número " + numero + " NO es perfecto. 🙁");
        }

        // Cerramos el scanner
        scanner.close();

	}

}
