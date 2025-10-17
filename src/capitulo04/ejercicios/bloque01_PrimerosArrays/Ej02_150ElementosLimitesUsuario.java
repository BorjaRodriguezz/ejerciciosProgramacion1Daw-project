package capitulo04.ejercicios.bloque01_PrimerosArrays;

import java.util.Random;
import java.util.Scanner;

public class Ej02_150ElementosLimitesUsuario {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int[] numeros = new int[150];
		int limInf;
		int limSup;
		
		//Solicitud de valores
		System.out.println("Introduce el límite inferior: ");
		limInf = sc.nextInt();
		System.out.println("Introduce el límite superior: ");
		limSup = sc.nextInt();
		
		//En caso de que el limite inferior sea mayor que el superior
		if (limInf > limSup) {
			System.out.println("El límite inferior no puede ser mayor que el límite superior. Cambiando los valores...");
			int temp = limInf;
			limInf = limSup;
			limSup = temp;
		}
		
		//Bucle para generar el array
		int i = 0;
		while (i < numeros.length) {
			numeros[i] = random.nextInt(limSup - limInf) + limInf;
			i++;
		}
		
		//Resultado
		System.out.println("\nNúmeros generados entre " + limInf + " y " + limSup +": ");
		i = 0;
		while (i < numeros.length) {
			System.out.print(numeros[i] + " ");
			i++;
		}
		
		sc.close();

	}

}
