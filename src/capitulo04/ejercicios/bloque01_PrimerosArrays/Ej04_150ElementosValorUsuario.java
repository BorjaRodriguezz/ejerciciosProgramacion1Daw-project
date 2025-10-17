package capitulo04.ejercicios.bloque01_PrimerosArrays;

import java.util.Random;
import java.util.Scanner;

public class Ej04_150ElementosValorUsuario {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[150];
		int valorUsuario;
		
		int i = 0;
		while (i < numeros.length) {
			numeros[i] = random.nextInt(100);
			i++;
		}
		
		System.out.println("\nNúmero generados: ");
		
		i = 0;
		while (i < numeros.length) {
			System.out.print(numeros[i] + " ");
			i++;
		}
		
		System.out.println("\nIntroduce un número entre 0 y 100: ");
		valorUsuario = sc.nextInt();
		
		boolean encontrado = false;
		int posicion = -1;
		i = 0;
		while (i < numeros.length && !encontrado) {
			if (numeros[i] == valorUsuario) {
				encontrado = true;
				posicion = i;
			}
			i++;
		}
		 if (encontrado) {
			 System.out.println("El valor " + valorUsuario + " se encuentra en " + posicion + ".");
		 } else {
			 System.out.println("El valor " + valorUsuario + " no esta en el array.");
		 }
		
		sc.close();
 
	}

}
