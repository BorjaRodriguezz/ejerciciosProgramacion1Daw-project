package practicasExamen.examen01.practica01;

import java.util.Random;

public class DigitosNumeroAleatorio {

	public static void main(String[] args) {
		// Objeto Random para generar números al azar
        Random random = new Random();
        
        // Generamos un número al azar entre 0 (incluido) y 10001 (excluido), es decir, 0 a 10000
        int numeroAleatorio = random.nextInt(10001);

        // Variable para almacenar el número que manipularemos en el bucle
        int tempNumero = numeroAleatorio;
        // Contador de dígitos inicializado a 0
        int contadorDigitos = 0;

        System.out.println("Número aleatorio generado: " + numeroAleatorio);

        // Caso especial: Si el número es 0, tiene 1 dígito
        if (tempNumero == 0) {
            contadorDigitos = 1;
        } else {
            // Bucle while: se ejecuta mientras el número temporal sea mayor que 0
            while (tempNumero > 0) {
                // Dividimos el número por 10. Esto elimina el último dígito
                tempNumero = tempNumero / 10;
                // Por cada división, incrementamos el contador de dígitos
                contadorDigitos++;
            }
        }

        // Mostramos el resultado final
        System.out.println("El número " + numeroAleatorio + " tiene " + contadorDigitos + " dígito(s).");

	}

}
