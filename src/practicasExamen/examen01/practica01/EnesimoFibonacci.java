package practicasExamen.examen01.practica01;

import java.util.Scanner;

public class EnesimoFibonacci {

	public static void main(String[] args) {
		// Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Variable para almacenar el orden (n) del término a encontrar
        int n;

        // Pedir el número de término al usuario
        System.out.print("Introduce el orden (n) del término de Fibonacci que deseas encontrar: ");
        n = scanner.nextInt();

        // Validar que el orden sea positivo
        if (n <= 0) {
            System.out.println("El orden del término debe ser un número positivo.");
            scanner.close();
            return;
        }

        // Variables para almacenar los dos términos anteriores y el término actual
        // Usamos 'long' para evitar desbordamiento con números de Fibonacci grandes
        long a = 1; // Primer término (orden 1)
        long b = 1; // Segundo término (orden 2)
        long terminoActual = 0;

        // Manejo de los casos base: n=1 y n=2
        if (n == 1) {
            terminoActual = a;
        } else if (n == 2) {
            terminoActual = b;
        } else {
            // Bucle for: Comenzamos en el término 3 hasta alcanzar el término 'n'
            // El bucle calcula los términos intermedios
            for (int i = 3; i <= n; i++) {
                // El término actual es la suma de los dos anteriores
                terminoActual = a + b;
                
                // Actualizamos los términos anteriores para la siguiente iteración
                // El antiguo 'b' se convierte en el nuevo 'a'
                a = b; 
                // El 'terminoActual' se convierte en el nuevo 'b'
                b = terminoActual; 
            }
        }

        // Mostrar el resultado final
        System.out.println("El término de Fibonacci en la posición " + n + " es: " + terminoActual);
        
        // Ejemplo: Si n=8, el resultado es 21.
        // 1 1 2 3 5 8 13 21
        
        // Cerramos el scanner
        scanner.close();
	}

}
