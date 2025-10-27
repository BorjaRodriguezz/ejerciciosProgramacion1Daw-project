package examenes.examen20251024;

import java.util.Scanner;

public class Ej05_SumaDivisoresPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int suma = 0;
		
		//Solicitud
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		//bucle para saber si es primo el divisor
		for (int i = 1;i <= num / 2;i++) {
			if (num % i == 0) {
			}else{
				suma += i;
			}
		}
		
		//Resultado
		System.out.println("Calculando suma de divisores primos...");
		System.out.println(suma);
		
		sc.close();

	}

}
