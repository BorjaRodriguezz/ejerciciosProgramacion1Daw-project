package examenes.examen20251024;

import java.util.Scanner;

public class Ej01_NumeroMasDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables contadores
		int contadorNum1 = 1;
		int contadorNum2 = 1;
		
		//solicitud numeros
		System.out.println("Introduce 2 números: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//Contador primero número
		// Bucle while: se ejecuta mientras el número temporal sea mayor que 0
        while (num1 > 0) {
            // Dividimos el número por 10. Esto elimina el último dígito
            num1 = num1 / 10;
            // Por cada división, incrementamos el contador de dígitos
            contadorNum1++;
        }
		//Contador segundo número
		// Bucle while: se ejecuta mientras el número sea mayor que 0
        while (num2 > 0) {
            // Dividimos el número por 10. Esto elimina el último dígito
            num2 = num2 / 10;
            // Por cada división, incrementamos el contador de dígitos
            contadorNum2++;
        }
        System.out.println("Dígitos número 1: " + contadorNum1);
        System.out.println("Dígitos número 2: " + contadorNum2);   
	}

}
	
