package practicasExamen.examen01.practica01;

import java.util.Scanner;

public class SumaNPrimos {

	public static void main(String[] args) {
		// Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Variable para almacenar el número de primos que el usuario desea sumar/encontrar
        int n;

        // Bucle para solicitar al usuario la cantidad N
        System.out.print("Introduce la cantidad (N) de los primeros números primos a encontrar: ");
        n = scanner.nextInt();

        // Si N es 0 o negativo, informamos y salimos
        if (n <= 0) {
            System.out.println("La cantidad debe ser un número positivo.");
            scanner.close();
            return;
        }

        // Contador de números primos encontrados hasta ahora
        int contadorPrimos = 0;
        // Número actual que estamos comprobando si es primo
        int numeroActual = 1;
        // Variable para acumular la suma de los primos (opcional, pero buena práctica)
        long suma = 0;

        // Mensaje de inicio
        System.out.println("Los " + n + " primeros 'primos' (incluyendo el 1) son:");

        // Bucle principal: se ejecuta hasta que encontremos N 'primos'
        while (contadorPrimos < n) {
            // Variable booleana que indica si el número actual es primo
            boolean esPrimo = true;

            // Si el número actual es 1, lo tratamos como "primo" según el ejemplo
            if (numeroActual == 1) {
                esPrimo = true;
            } 
            // Si el número actual es 2, es el primer primo real
            else if (numeroActual == 2) {
                esPrimo = true;
            } 
            // Si es mayor que 2, comprobamos divisibilidad
            else if (numeroActual > 2) {
                // Bucle for para comprobar divisibilidad desde 2 hasta la raíz cuadrada del número
                // La comprobación solo hasta la raíz cuadrada optimiza el proceso
                for (int i = 2; i * i <= numeroActual; i++) {
                    // Si encontramos un divisor, no es primo
                    if (numeroActual % i == 0) {
                        esPrimo = false;
                        // Salimos del bucle interno ya que ya sabemos que no es primo
                        break; 
                    }
                }
            } else {
                // Números menores o iguales a 0 no son primos
                esPrimo = false;
            }

            // Si la bandera es 'true', hemos encontrado un número a incluir
            if (esPrimo) {
                // Mostramos el número
                System.out.print(numeroActual + " ");
                // Sumamos el número al total acumulado
                suma += numeroActual; 
                // Incrementamos el contador de números encontrados
                contadorPrimos++;
            }

            // Pasamos al siguiente número para la siguiente comprobación
            numeroActual++;
        }

        // Imprimimos la suma total y un salto de línea para el formato
        System.out.println("\nLa suma total es: " + suma);
        // Cerramos el scanner para liberar recursos
        scanner.close();
    }

}
